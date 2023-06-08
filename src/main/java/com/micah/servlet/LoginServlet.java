package com.micah.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.micah.connection.DBConnection;
import com.micah.dao.UserDao;
import com.micah.model.UserModal;

@WebServlet("/user-login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			PrintWriter out = response.getWriter();


			String email = request.getParameter("email");
			String password = request.getParameter("password");

			UserDao dao = new UserDao(DBConnection.getConnection());
			UserModal user = dao.login(email, password);
			

			if (user != null)
			{
				HttpSession session = request.getSession();
				session.setAttribute("password", user.getPassword());
				session.setAttribute("email", user.getEmail());
				session.setAttribute("name", user.getEmail());
				response.sendRedirect("index.jsp");
			}
			else
				out.print("user login failed");

		} catch (Exception e) {
			PrintWriter out = response.getWriter();
			out.println(e.getMessage());
		}

	}

}
