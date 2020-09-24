import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/private/*")
public class AuthFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpSession currentSession = ((HttpServletRequest) request).getSession(true);
		if (currentSession.getAttribute("isUserLoggedIn") == null) { //== false
			((HttpServletResponse) response).sendRedirect("/FilterExample/login");
		}else {
			chain.doFilter(request, response);
		
		}
	}

}
