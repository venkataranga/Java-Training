package com.spring.mvc;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.pojo.Mail;

@Controller
public class ViewMailController {

	@RequestMapping("viewMail/{mailId}")
	public String viewMail(@PathVariable int mailId, Model model,  HttpSession session){
		List<Mail> emails = (List<Mail>)session.getAttribute("emails");
		Mail mail = null;
		for(Mail m : emails){
			if(m.getId() == mailId){
				mail = m;
				break;
			}
		}
		model.addAttribute("mail", mail);
		return "mailDetails";
	}
	
	@RequestMapping("viewMail/pdf/{mailId}")
	public String pdfView(@PathVariable int mailId, Model model,  HttpSession session){
		List<Mail> emails = (List<Mail>)session.getAttribute("emails");
		Mail mail = null;
		for(Mail m : emails){
			if(m.getId() == mailId){
				mail = m;
				break;
			}
		}
		model.addAttribute("mail", mail);
		return "pdfView";
	}
}
