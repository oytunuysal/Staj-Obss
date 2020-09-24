
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AtmServlet
 */
@WebServlet("/atmservlet")
public class AtmServlet extends HttpServlet implements Runnable {
	private static final long serialVersionUID = 1L;
	// delete everything about threads.

	private static int balance = 300;
	private int withdraw;
	private ArrayList<Thread> threads = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			this.withdraw = (int) request.getAttribute("withdraw");
		} catch (Exception e) {
			System.err.println(e);
			this.withdraw = 200;
		}
		threads.add(new Thread(this));
		threads.get(threads.size() - 1).start();
	}

	@Override
	public void run() {
		if (balance >= withdraw) {
			try {
				threads.get(threads.size() - 1).sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.balance -= this.withdraw;
			System.out.println(this.balance);
		}

	}

}
