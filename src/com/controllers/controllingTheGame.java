package com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class controllingTheGame
 */
@WebServlet("/controllingTheGame")
public class controllingTheGame extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controllingTheGame() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int randNumber = 0;
		try {
			randNumber = Integer.parseInt(session.getAttribute("randNumber").toString());
		}catch (Exception e) {
			randNumber = 0;
		}
		int userNumber = Integer.parseInt(request.getParameter("number").toString());
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view.jsp");
		
		int tries = Integer.parseInt(session.getAttribute("NumOfTries").toString());
		session.setAttribute("NumOfTries", ++tries);
		if (randNumber == userNumber) {
			view = request.getRequestDispatcher("/WEB-INF/playAgain.jsp");
		}else {
			if (randNumber > userNumber){
			request.setAttribute("number", "low");
		}else {
			request.setAttribute("number", "high");
		}
		}
		
        
        view.forward(request, response);
	}

}
