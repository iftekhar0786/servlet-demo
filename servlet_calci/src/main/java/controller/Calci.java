package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calci")
public class Calci extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num1= req.getParameter("first");		
		Double first_num= Double.parseDouble(num1);
		
		String num2= req.getParameter("second");
		Double second_num= Double.parseDouble(num2);
			
		String button= req.getParameter("btn");
		
		switch (button) {
		case "+":
			resp.getWriter().print(first_num + second_num);			
			break;
			
		case "-":
			resp.getWriter().print(first_num-second_num);			
			break;
			
		case "*":
			resp.getWriter().print(first_num*second_num);			
			break;
			
		case "/":
			resp.getWriter().print(first_num/second_num);			
			break;

		default:
			break;
		}
		
		
		
		
	}
}
