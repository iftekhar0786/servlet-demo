package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Customer_mock_dao;
import Dto.Customer_dto;

@WebServlet("/signup")
public class Customer_mock extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		{

			String name = req.getParameter("username");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			String mob = req.getParameter("mob");

			Long mob_no = Long.parseLong(mob);

			Customer_mock customer_mock = new Customer_mock();

			Customer_dto customer_dto = new Customer_dto();

			Customer_mock_dao customer_mock_dao = new Customer_mock_dao();
			
			if()
		}

	}

}
