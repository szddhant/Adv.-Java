package com.Google.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calculator extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int num3 = 0;
		String choice = request.getParameter("choice");
		
		if(choice.contains("+")){
			num3 = num1 + num2;
		}
		else if(choice.contains("-")) {
			num3 = num1 - num2;
		}
		else if(choice.contains("x")) {
			num3 = num1 * num2;
		}
		else {
			num3 = num1 / num2;
		}
		System.out.println("Result : "+num3);
	}
}
