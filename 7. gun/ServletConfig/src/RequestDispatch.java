import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @WebServlet
 * @WebInitParam
 */
public class RequestDispatch extends HttpServlet {

	private static final long serialVersionUID = 1L;
	ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String stringConfig = this.config.getInitParameter("forwardorredirect");
		if ("forward".equalsIgnoreCase(stringConfig)) {
			javax.servlet.RequestDispatcher rd = req.getRequestDispatcher("red-paragraph.jsp");
			rd.forward(req, resp);
		} else if ("redirect".equalsIgnoreCase(stringConfig)) {
			resp.sendRedirect("blue-paragraph.jsp");
		}

		/*
		 * String jsp = req.getParameter("jsp"); if ("red".equalsIgnoreCase(jsp)) {
		 * javax.servlet.RequestDispatcher rd =
		 * req.getRequestDispatcher("red-paragraph.jsp"); rd.forward(req, resp); } else
		 * if ("blue".equals(jsp)) { resp.sendRedirect("blue-paragraph.jsp"); }
		 */

	}

}
