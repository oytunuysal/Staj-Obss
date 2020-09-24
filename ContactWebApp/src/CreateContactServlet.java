
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create-contact-servlet")
public class CreateContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("create-contact.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = (String) request.getParameter("name");
		String gsm = (String) request.getParameter("gsm");
		if ("".equals(name) || "".equals(gsm)) {
			// input cannot be null
			response.sendRedirect("operation-failed.jsp");
		} else {
			//Contact contact = new Contact(name, gsm);
			ContactRepository.createContact(name, gsm);

			RequestDispatcher rd = request.getRequestDispatcher("operation-successful.jsp");
			rd.forward(request, response);
		}

	}

}
