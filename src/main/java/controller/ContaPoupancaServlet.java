package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ContaEspecial;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/ContaPoupancaServlet")
public class ContaPoupancaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContaPoupancaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Inicialização de uma Conta Especial
		ContaEspecial contaEspecial = new ContaEspecial("Cliente B", 54321, 2000, 500);

		// Ação e retorno para sacar um determinado valor da conta especial
		float valorSaque = Float.parseFloat(request.getParameter("saque"));
		contaEspecial.sacar(valorSaque);

		// Ação e retorno para depósito de um determinado valor na conta especial
		float valorDeposito = Float.parseFloat(request.getParameter("deposito"));
		contaEspecial.depositar(valorDeposito);

		// Mostrar os dados da conta do cliente
		request.setAttribute("saldoContaEspecial", contaEspecial.getSaldo());
		request.getRequestDispatcher("conta_especial.jsp").forward(request, response);
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
