package kosta.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalsServlet")
public class CalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public CalsServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 0;
		int num2 = 0;
		
		request.setCharacterEncoding("utf-8");
		
		String s1 = request.getParameter("num1");
		String s2 = request.getParameter("num2");
		String name = request.getParameter("userName");
				
		if(s1 == null) {
			s1 = "0";
		}
		
		num1 = Integer.parseInt(s1);
		num2 = Integer.parseInt(s2);
		
		int result = num1 + num2;
		request.setAttribute("result", result);
		request.setAttribute("name", name);

		response.sendRedirect("/JSP/basic/result.jsp");
		
//		RequestDispatcher re =
//				request.getRequestDispatcher("/basic/result.jsp");
//		re.forward(request, response);
	}

}
