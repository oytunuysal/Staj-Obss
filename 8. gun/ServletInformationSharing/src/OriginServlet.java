
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OriginServlet")
public class OriginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		ServletContext context = request.getSession().getServletContext();
		context.setAttribute("forward", new String ("redirect"));
		
		
		//request.setAttribute("forward", new String ("redirect"));
		
		response.sendRedirect("/ServletInformationSharing/DestinationServlet");
		
		
		//javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("/DestinationServlet");
		//rd.forward(request, response);
	}

}
