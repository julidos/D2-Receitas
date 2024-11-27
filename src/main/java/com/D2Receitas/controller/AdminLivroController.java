package com.D2Receitas.controller;
    
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import java.util.List;
import com.D2Receitas.model.Livro;
import com.D2Receitas.repository.LivroRepository;
import com.D2Receitas.service.PDFService;

@Controller
@RequestMapping("/dashboard/administrador/livros")
@PreAuthorize("hasRole('ADMINISTRADOR')")
public class AdminLivroController {

    @Autowired
    private LivroRepository livroRepository;
    
    @Autowired
    private PDFService pdfService;

    @GetMapping
    public String listarLivros(
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String editor,
            Model model) {
            
        List<Livro> livros;
        
        if (status != null && !status.isEmpty()) {
            boolean publicado = status.equals("publicado");
            livros = livroRepository.findByPublicado(publicado);
        } else {
            livros = livroRepository.findAll();
        }
        
        model.addAttribute("livros", livros);
        return "dashboard/administrador/livros";
    }

    @GetMapping("/baixarLivro/{id}")
    public ResponseEntity<byte[]> baixarLivro(@PathVariable Long id) {
        try {
            Livro livro = livroRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Livro inválido: " + id));
            
            byte[] pdfBytes = pdfService.gerarLivroPDF(livro);
            
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("attachment", livro.getNome() + ".pdf");
            
            return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}