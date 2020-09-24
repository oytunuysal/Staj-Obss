
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit-contact")
public class EditContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().setAttribute("name", request.getParameter("name"));
		request.getSession().setAttribute("gsm", request.getParameter("gsm"));
		request.getRequestDispatcher("edit-contact.jsp").forward(request, response);
		// response.sendRedirect("operation-successful.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Contact contact = (Contact) request.getAttribute("contact");

		// System.out.println(contact);
		String name = (String) request.getSession().getAttribute("name");
		String gsm = (String) request.getSession().getAttribute("gsm");
		String newGsm = request.getParameter("newGsm");

		// boolean isEdited = ContactRepository.editNumber(contact.getName(), gsm); //
		// null
		if (newGsm.isEmpty()) {
			response.sendRedirect("operation-failed.jsp");
		} else {
			boolean isEdited = ContactRepository.editNumber(name, gsm, newGsm);

			if (isEdited) {
				response.sendRedirect("operation-successful.jsp");
			} else {
				response.sendRedirect("operation-failed.jsp");
			}
		}

	}

}
