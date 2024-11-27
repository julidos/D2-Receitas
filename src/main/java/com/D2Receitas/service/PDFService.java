package com.D2Receitas.service;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;
import com.D2Receitas.model.Livro;
import com.D2Receitas.model.Receita;

import java.io.ByteArrayOutputStream;

@Service
public class PDFService {
    
    public byte[] gerarLivroPDF(Livro livro) throws Exception {
        Document document = new Document();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfWriter.getInstance(document, baos);
        document.open();
        
        // Capa
        Font titleFont = new Font(Font.FontFamily.HELVETICA, 24, Font.BOLD);
        Paragraph title = new Paragraph(livro.getNome(), titleFont);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        
        document.newPage();
        
        // Sumário
        Font chapterFont = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
        Chapter sumario = new Chapter(new Paragraph("Sumário", chapterFont), 1);
        
        for (Receita receita : livro.getReceitas()) {
            Paragraph receitaEntry = new Paragraph(receita.getNome());
            sumario.add(receitaEntry);
        }
        
        document.add(sumario);
        
        // Receitas
        for (Receita receita : livro.getReceitas()) {
            document.newPage();
            
            Paragraph nome = new Paragraph(receita.getNome(), chapterFont);
            document.add(nome);
            
            Paragraph chef = new Paragraph("Chef: " + receita.getCozinheiro().getNomeCompleto());
            document.add(chef);
            
            Paragraph descricao = new Paragraph("Descrição: " + receita.getDescricao());
            document.add(descricao);
            
            // Ingredientes
            Paragraph ingredientes = new Paragraph("Ingredientes:");
            for (int i = 0; i < receita.getIngredientes().size(); i++) {
                String linha = receita.getQuantidades().get(i) + " " +
                             receita.getMedidas().get(i).getNome() + " de " +
                             receita.getIngredientes().get(i).getNome();
                ingredientes.add(new Paragraph(linha));
            }
            document.add(ingredientes);
            
            Paragraph modoPreparo = new Paragraph("Modo de Preparo: " + receita.getModoPreparo());
            document.add(modoPreparo);
        }
        
        document.close();
        return baos.toByteArray();
    }
}