
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list-session-attributes")
public class SessionAttributesListerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Enumeration<String> names = request.getSession().getAttributeNames();

		while (names.hasMoreElements()) {
			String attributeName = (String) names.nextElement();
			out.println(request.getSession().getAttribute(attributeName));
		}

	}

}
