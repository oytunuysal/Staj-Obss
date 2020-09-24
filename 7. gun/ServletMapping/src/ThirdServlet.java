import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8291771693535153722L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String jsp = req.getParameter("jsp");
		if ("simple".equalsIgnoreCase(jsp)) {
			javax.servlet.RequestDispatcher rd = req.getRequestDispatcher("simple.jsp");
			rd.forward(req, resp);
		}
	}

}
