package com.Google.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpController extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Sign Up Controller");
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println("First Name  : "+firstName );
		System.out.println("Email  : "+email );
		System.out.println("Password  : "+password );
		
		
	
	}
}
