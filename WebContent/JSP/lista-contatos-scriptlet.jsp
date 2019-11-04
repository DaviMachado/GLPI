<%@page import="br.com.wi2.glpi.core.dao.*"%>
<%@page import="br.com.wi2.glpi.core.dominio.*" %>
<%@page import="br.com.wi2.glpi.core.dao.impl.*" %>

<%@page import="java.util.List"%>

<html>
<head>
	<title></title>
</head>
<body>
	<table border="1">
		<tr>
            <th>Id</th>
            <th>Nome</th>
            <th>E-mail</th>
            <th>Endereço</th>
            <th>Data Nascimento</th>
        </tr>
		<%
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getLista();
		
		for(Contato contato : contatos) {
		%>
			<tr>
				<td><%=contato.getId() %></td>
				<td><%=contato.getNome() %></td>
				<td><%=contato.getEmail() %></td>
				<td><%=contato.getEndereco() %></td>
				<td><%=contato.getDataNascimento() %></td>
				<td><a href="preAlterar_cliente.jsp?id=<%= contato.getId()%>">Alterar</a></td>
                <td><a href="DeletarCliente?id=<%= contato.getId()%>&acao=deletar">Deletar</a></td>
			</tr>
		<%
		}
		%>
	</table>
	 <input type="button" value="Retornar" onclick="history.back()">
</body>
</html>