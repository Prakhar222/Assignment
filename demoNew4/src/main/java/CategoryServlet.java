import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/CategoryServlet")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie[] cookie=request.getCookies();
		if (cookie!=null) {
			for (Cookie cookie2 : cookie) {
				if (cookie2.getName().equals("cCategory")) {
					getServletContext().getRequestDispatcher("/"+cookie2.getValue()+".html").forward(request, response);
					return;
				}
				
			}
			
		}
		getServletContext().getRequestDispatcher("/topcategory.html").forward(request, response);
	}

}
