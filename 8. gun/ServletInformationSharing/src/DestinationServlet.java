
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DestinationServlet")
public class DestinationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if ("forward".equals(request.getServletContext().getAttribute("forward"))) {
			System.out.println("/DestinationServlet if statement forward");
		} else if ("redirect".equals(request.getServletContext().getAttribute("forward"))) {
			System.out.println("/DestinationServlet if statement redirect");
		} else {
			System.out.println("else block");
		}

		//if ("forward".equals((String) request.getAttribute("forward"))) {
		//	System.out.println("/DestinationServlet if statement forward");
		//} else if ("redirect".equals((String) request.getAttribute("forward"))) {
		//	System.out.println("/DestinationServlet if statement redirect");
		//} else {
		//	System.out.println("else block");
		//}

		//System.out.println(request.getAttribute("forward"));
	}

}
