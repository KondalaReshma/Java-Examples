package com.telsuko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addAlien")
public class MyServlet extends HttpServlet {
	
       
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname = request.getParameter("aname");

		PrintWriter out =  response.getWriter();
		out.println("welcome"  + aname);
				
				
		
}
}