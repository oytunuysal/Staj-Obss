
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CreateSession
 */
@WebServlet("/create-session")
public class CreateSession extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession currentSession = request.getSession(true);
		currentSession.setAttribute("sessionId", "anId");
		currentSession.setAttribute("sessionTime", new Date().getTime());
		response.addCookie( new Cookie("sessionName", "asd"));
		request.getRequestDispatcher("/list-session-attributes").forward(request, response);
		
		//response.sendRedirect("/SessionExample/list-session-attributes");
	}


}
