package com.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sevice.booklistService;

import model.Book;

/**
 * Servlet implementation class bookController
 */
@WebServlet("*.app")
public class bookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	booklistService bserv = new booklistService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public bookController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		System.out.println(action);

		switch (action) {

		case "/addtocart.app":
			response.sendRedirect("home.jsp");
			break;
		case "/cart.app":
			response.sendRedirect("cart.jsp");
			break;
		case "/refresh.app":

			bserv.addNewBook();
			Collection<Book> b = bserv.viewAllBooks();

			request.setAttribute("k", b);
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("home.jsp");
			requestdispatcher.forward(request, response);
			break;

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
