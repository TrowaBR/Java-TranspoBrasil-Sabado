package br.com.cursojava.aula009;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		String ipSolicitante = req.getRemoteHost();
		Date dataHora = new Date();

		StringBuilder result = new StringBuilder();
		result.append("<!DOCTYPE html>")
			.append("<html>")
			.append("<head>")
				.append("<meta charset=\"utf-8\">")
				.append("<title>Hello Java Web</title>")
			.append("</head>")
			.append("<body>")
				.append("<h1>Bem vindo ao mundo Java Web</h1>")
				.append("<h3>Dados da requisi��o:</h3>")
				.append("<p><strong>Path:</strong> ").append(path).append("</p>")
				.append("<p><strong>IP:</strong> ").append(ipSolicitante).append("</p>")
				.append("<p><strong>Data hora:</strong> ").append(dataHora).append("</p>")
			.append("</body>")
			.append("</html>");

		resp.setContentType("text/html");
		resp.getWriter().println(result);
	}
}