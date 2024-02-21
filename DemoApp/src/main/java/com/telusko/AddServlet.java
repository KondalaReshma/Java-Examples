package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet  extends HttpServlet
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
	
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='red'>");
		out.println("output: " +  k);
		out.print("</body></html>");
		
		
		
		
		//HttpSession code
		//HttpSession session = req.getSession();
		//session.setAttribute("k", k);
		
		
		
		res.sendRedirect("sq?k=" +k);
		//we can send data from one servlet to another servlet  through req obj.we can add the data to the req obj.by using set
		//req.setAttribute("k", k);
		
		//requestDispatcher code
		//RequestDispatcher rd =  req.getRequestDispatcher("sq");
		//rd.forward(req, res);
		
		
	}

}
