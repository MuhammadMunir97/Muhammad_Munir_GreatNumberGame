package com.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class numberGame
 */
@WebServlet("/numberGame")
public class numberGame extends HttpServlet {
	int randNumber = 0;
	Random rand = new Random();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public numberGame() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			HttpSession session = request.getSession();
			randNumber = rand.nextInt(99) + 1;
			int numberOfTries = 0;
			session.setAttribute("NumOfTries", numberOfTries);
	        session.setAttribute("randNumber", randNumber);
	        
	        request.setAttribute("randNumber", randNumber);
	        
	        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view.jsp");
	        
	        view.forward(request, response);
	}

}
