package webMVCControllers;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class momcontroller {
	//static Model model;
	@RequestMapping("/sugar")
	public String giveSugar(Model  model) {
		String saman = "sugar";
		model.addAttribute("saman" ,saman );
		
		return "mrfCricket";
		
	}
	
	@RequestMapping("/processOrder")
	public String processOrder( HttpServletRequest req , Model model) {
		//String saman = "sugar processed";
		//model.addAttribute("saman" ,saman );
		String input =(String) req.getParameter("nameInput");
		System.out.println(input);
		model.addAttribute("input" ,input);
		return "result";
		
	}
	
	@RequestMapping("/main")
	public String getWelcomePage(Model  model) {
		String saman = "sugar";
		model.addAttribute("saman" ,saman );
		
		return "welcome-page";
		
	}
}
