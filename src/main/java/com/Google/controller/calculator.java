package com.Google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class calculator extends HttpServlet  {
	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int num3 = 0;
		String choice = request.getParameter("choice");
		
		
		if(choice.contains("+")){
			num3 = num1 + num2;
			out.println("<html><body align=center >");
			out.println(num1+" + "+num2+" = "+num3);
			out.println("<html><body>");
		}
		else if(choice.contains("-")) {
			num3 = num1 - num2;
			out.println("<html><body>");
			out.println(num1+" - "+num2+" = "+num3);
			out.println("<html><body>");

		}
		else if(choice.contains("x")) {
			num3 = num1 * num2;
			out.println("<html><body>");
			out.println(num1+" x "+num2+" = "+num3);
			out.println("<html><body>");

		}
		else {
			num3 = num1 / num2;
			out.println("<html><body>");
			out.println(num1+" / "+num2+" = "+num3);
			out.println("<html><body>");

		}
		
		
	}
}
