<%@page import="br.com.wi2.glpi.core.dao.*"%>
<%@page import="br.com.wi2.glpi.core.dominio.*" %>
<%@page import="br.com.wi2.glpi.view.controller.*"%>

<%@page import="java.util.List"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%
		// linha que faz para receber o atributo definido na servlet
		// o objeto "contato" recebe o valor do atributo "retorno", que também é um objeto
		Contato contato = (Contato) request.getAttribute("retorno");
		%>
		<div>
			<label>Nome</label>
			<input type="text" name="nome" value="<%=contato.getNome() %>"/>
		</div>
	</body>
</html>