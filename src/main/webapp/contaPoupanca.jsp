<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/styles.css">
<title>Aula Servlets</title>
</head>

<body>

	<jsp:include page="menu.jsp" />

	<br />
	<br />
	<div class="container" align="center">
		<form action="ContaPoupancaServlet" method="post">
			<p class="title">Conta Poupança</p>
			<table>
				<tr>
					<td><input class="input_data" type="number" id="saque"
						name="saque" placeholder="Digite quanto quer sacar"></td>
				</tr>
				<tr>
					<td><input class="input_data" type="number" id="deposito"
						name="deposito" placeholder="Digite quanto quer depositar"></td>
				</tr>
				<tr>
					<td><input type="submit" id="enviar" name="enviar"
						value="Enviar"> <input type="submit" id="enviar"
						name="enviar" value="Listar"></td>
				</tr>

			</table>
		</form>
	</div>
</body>

</html>