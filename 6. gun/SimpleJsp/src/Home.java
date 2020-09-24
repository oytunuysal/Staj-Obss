import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FirstServlet", urlPatterns = {"/html"})
public class Home extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8"); 
	     try (PrintWriter out = resp.getWriter()) { 
	       out.println("<!DOCTYPE html>"); 
	       out.println("<html>"); 
	       out.println("<head>"); 
	       out.println("<title>Servlet StudentServlet</title>"); 
	       out.println("</head>"); 
	       out.println("<body>"); 
	       out.println("<b style=\"color:red;\">Red paragraph text</b>"); 
	       out.println("</body>"); 
           out.println("</html>"); 
}}}
