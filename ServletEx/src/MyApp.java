

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyApp")
public class MyApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		response.setContentType("text/html");
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.println("<html>");
		outPrintWriter.println("<head>");
		outPrintWriter.println("<title>Hello World</title>");
		outPrintWriter.println("</head>");
		outPrintWriter.println("<h1>Hello World !</h1>");
		outPrintWriter.println("</body>");
		outPrintWriter.println("</html>");
	
	}
	

}
