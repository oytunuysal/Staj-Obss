import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Oytun
 */
@WebServlet(name = "RequestDispatch", urlPatterns = { "/RequestDispatch" })
public class RequestDispatcher extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String jsp = req.getParameter("jsp");
		if ("red".equalsIgnoreCase(jsp)) {
			javax.servlet.RequestDispatcher rd = req.getRequestDispatcher("red-paragraph.jsp");
			rd.forward(req, resp);
		} else if ("blue".equals(jsp)) {
			resp.sendRedirect("blue-paragraph.jsp");
		}
	}

}
