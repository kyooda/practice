package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PortfolioController {

	@GetMapping("/")
	public String top() {
		
		return "hello";
	}
	
	@PostMapping("/hello")
	public String Hello(@RequestParam("text1")String str,Model model) {
		
		model.addAttribute("sample",str);
		return "HelloResponse";
	}
	
}
