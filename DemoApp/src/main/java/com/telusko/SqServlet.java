package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.filters.ExpiresFilter.XPrintWriter;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		 
		//HttpSession session = req.getSession();
		//int k  =(int) session.getAttribute("k");
		//int k  = Integer.parseInt(req.getParameter("k"));
		//k= k*k;
		
		PrintWriter out = res.getWriter();
		//out.println("result is " + k);
		out.println("sq is called" );
}
}