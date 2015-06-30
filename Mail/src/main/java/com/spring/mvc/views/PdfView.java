package com.spring.mvc.views;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.spring.mvc.pojo.Mail;

public class PdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model,
			Document document, PdfWriter writer, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Mail mail = (Mail)model.get("mail");
		Table table = new Table(2);
		table.addCell("From: ");
		table.addCell(mail.getFrom());
		
		table.addCell("To: ");
		table.addCell(mail.getTo());
		
		table.addCell("Subject: ");
		table.addCell(mail.getSubject());
		
		table.addCell("Message");
		table.addCell(mail.getMessage());
		
		document.add(table);
	}

}
