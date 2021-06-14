package com.bridgelabz.UserRegistrationByServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

@WebServlet(
		description = "Login Servlet Testing",
		urlPatterns = {"/LoginServlet"}
		
)		
		
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		String validFirstName = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(validFirstName);
		Matcher match = pattern.matcher(user);
		if(match.matches()) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
			
		}else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");
			PrintWriter out = response.getWriter();
			out.println("<font color=red>Incorrect Name , Please Enter The Correct Name</font>");
			rd.include(request, response);
		}
		
		
	}

}
