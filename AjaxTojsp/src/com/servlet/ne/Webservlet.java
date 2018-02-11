package com.servlet.ne;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Webservlet
 */
@WebServlet("/Webservlet")
public class Webservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public Webservlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("input");
		System.out.println(a);
		a=a.concat(" you are awesome");

		a=a.concat("<br>welcome to the club");
		response.setContentType("text/html");

		response.getWriter().write("<h2>"+a+"</h2>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//System.out.println("hello");
		String a=request.getParameter("input");


		System.out.println(a);
		response.setContentType("text/html");

		response.getWriter().write(a);

	}

}
