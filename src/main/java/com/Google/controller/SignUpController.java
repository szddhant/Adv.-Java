package com.Google.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SignUpController")
public class SignUpController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cnfPassword = request.getParameter("cnfPassword");
		String hobby = request.getParameter("hobby");
		String city = request.getParameter("city");
		String gender = request.getParameter("gender");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		boolean isError = false;
		StringBuffer error = new StringBuffer("");
		
		
		
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error.append("<br>Please Enter First Name");
		} else if (firstName.trim().length() <= 2) {
			isError = true;
			error.append("<br>Please Enter atleast 3 characters in First Name");

		} else {
			String alpha = "[a-zA-Z]+"; 
			if (firstName.matches(alpha) == false) {
				isError = true;
				error.append("<br>Please Enter Valid First Name");
			}
		}
		
		
		
		
		
		
		if (lastName == null || lastName.trim().length() == 0) {
			isError = true;
			error.append("<br>Please Enter Last Name");
		} else if (firstName.trim().length() <= 2) {
			isError = true;
			error.append("<br>Please Enter atleast 3 characters in Last Name");

		} else {
			String alpha = "[a-zA-Z]+"; 
			if (firstName.matches(alpha) == false) {
				isError = true;
				error.append("<br>Please Enter Valid First Name");
			}
		}
		
		
		
		
		
		
		if (email == null || email.trim().length() == 0) {
			isError = true;
			error.append("<br>Please Enter Email");

		}else {
			String alpha = "[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)"; 
			if (email.matches(alpha) == false) {
				isError = true;
				error.append("<br>Please Enter valid Email");
			}
		}
		
		
		
		
		if (password == null || password.trim().length() == 0) {
			isError = true;
			error.append("<br>Please Enter Password");
		}else {
//			String alpha = "^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$";
			String alpha = "[0-9a-zA-Z] {3,6}";
			if(password.matches(alpha) == false) {
						isError = true;
						error.append("<br>Please enter a Strong Password");
					}
		}

		
		
		
		
		
		if (cnfPassword == null || cnfPassword.trim().length() == 0) {
			isError = true;
			error.append("<br>Please Confirm your password");
		}else {
			if(cnfPassword.equals(password)) {
				isError=false;
			}
			else
			{
				isError=true;
				out.println("<br>Password doesn't match! ");
			}
		}
		
		
		
		
		if(hobby==null) {
			isError=true;
			error.append("<br> Please Select a Hobby.");
		}
		
		
		
		
		if(city.equals("----")) {
			isError=true;
			error.append("Please Select a city");
		}
		
		
		
		
		if(gender==null) {
			isError=true;
			error.append("<br> Please Select an Option.");
		}
		
		
		
		
		
		if (isError == true) {
			out.print("<span style='color:blue;'>" + error + "</span>");
		}

	
	
		RequestDispatcher rd = null;
		if(isError) {
			request.setAttribute("error", error.toString());
			rd = request.getRequestDispatcher("SignUp.jsp");
		}else {
			rd = request.getRequestDispatcher("welcome.html");
		}
		
		
		rd.forward(request, response);
	
	}
}
