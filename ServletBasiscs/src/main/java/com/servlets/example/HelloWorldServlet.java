package com.servlets.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet {


	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("type/html");
		PrintWriter pw = res.getWriter();
		pw.println("html");
		pw.println("body");
		pw.println("Welcome to Servlets");
		pw.println("body");
		pw.println("html");
	}

}
