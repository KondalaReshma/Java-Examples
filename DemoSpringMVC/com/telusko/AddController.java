package com.telusko;

import org.eclipse.jdt.internal.compiler.util.Util.Displayable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class AddController 
{
	@RequestMapping("/add")
	public  String add() 
	{
		return "Display.jsp";
	}
}
