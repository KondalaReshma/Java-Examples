package com.telusko;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

	@RequestMapping("/add")
	public void add() {
		System.out.println("hii");
	}
	
}
