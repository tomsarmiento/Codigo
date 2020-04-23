package com.tomassarmiento.elcodigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String home(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		if(code.equals("bushido")) {
			return "code.jsp";
		}
		else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
}
