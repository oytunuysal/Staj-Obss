
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search-contact")
public class SearchContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("search-contact.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		try {
			ArrayList<Contact> contacts = ContactRepository.query(name);
			if (contacts != null) {
				request.setAttribute("contacts", contacts);
				request.getRequestDispatcher("search-result.jsp").forward(request, response);
			}else {
				response.sendRedirect("operation-failed.jsp");
			}

			/*
			 * if (contacts != null) { // request.setAttribute("contact", contact);
			 * request.getSession().setAttribute("contact", contact);
			 * 
			 * response.sendRedirect("edit-contact.jsp"); } else {
			 * request.getSession().setAttribute("contact", null);
			 * System.out.println("Contact not found!"); response.sendRedirect("menu.jsp");
			 * }
			 */

		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
