package org.battleship.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.battleship.servis.BattleshipServis;

/**
 * Servlet implementation class BattleshipServlet
 */
// @WebServlet("/BattleshipServlet")
public class BattleshipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BattleshipServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		BattleshipServis battleshipServis = new BattleshipServis();
		battleshipServis.fillMatrix();
		battleshipServis.addShips(4,1);
		battleshipServis.addShips(3,2);
		battleshipServis.addShips(2,3);
		battleshipServis.addShips(1,4);

		request.setAttribute("battleshipMap", battleshipServis.getBattleshipMap());

		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);

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
