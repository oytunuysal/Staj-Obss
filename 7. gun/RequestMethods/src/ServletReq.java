
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class ServletReq extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String afterContextPath = request.getServletPath() + request.getPathInfo() + request.getQueryString();
		if (!afterContextPath.contains("secured")) {
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("hello.jsp");
			rd.forward(request, response);
		} else {
			response.sendError(403);
			// response.sendError(HttpServletResponse.SC_FORBIDDEN);
			System.out.println("secured");
		}
		System.out.println(request.getRequestURI());
	}
}
