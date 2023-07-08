package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	 @RequestMapping("/home")
	public String home() {
		 System.out.println("this home url");
		return "index";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
