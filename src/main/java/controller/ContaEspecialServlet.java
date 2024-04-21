package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ContaPoupanca;

/**
 * Servlet implementation class Servlet
 */

@WebServlet("/ContaEspecialServlet")
public class ContaEspecialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContaEspecialServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Inicialização de uma Conta Poupança
		ContaPoupanca contaPoupanca = new ContaPoupanca("Cliente A", 12345, 1000, 1);

		// Ação e retorno para sacar um determinado valor da conta poupança
		float valorSaque = Float.parseFloat(request.getParameter("saque"));
		contaPoupanca.sacar(valorSaque);

		// Ação e retorno para depósito de um determinado valor na conta poupança
		float valorDeposito = Float.parseFloat(request.getParameter("deposito"));
		contaPoupanca.depositar(valorDeposito);

		// Ação e retorno para mostrar o novo saldo do cliente
		float taxaRendimento = Float.parseFloat(request.getParameter("taxaRendimento"));
		contaPoupanca.calcularNovoSaldo(taxaRendimento);

		// Mostrar os dados da conta do cliente
		request.setAttribute("saldoContaPoupanca", contaPoupanca.getSaldo());
		request.getRequestDispatcher("conta_poupanca.jsp").forward(request, response);
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
