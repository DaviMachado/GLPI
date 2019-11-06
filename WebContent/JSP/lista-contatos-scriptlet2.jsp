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
            <th>Login</th>
            <th>Senha</th>
            <th>E-mail</th>
            <th>Cd Usuario</th>
            <th>Setor</th>
        </tr>
		<%
		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> usuarios = dao.getLista();
		
		for(Usuario usuario : usuarios) {
		%>
			<tr>
				<td><%=usuario.getLogin() %></td>
				<td><%=usuario.getSenha() %></td>
				<td><%=usuario.getEmail() %></td>
				<td><%=usuario.getCdUsuario() %></td>
				<td><%=usuario.getSetor() %></td>
				<td><a href="preAlterar_cliente.jsp?id=<%= usuario.getCdUsuario()%>">Alterar</a></td>
                <td><a href="DeletarCliente?id=<%= usuario.getCdUsuario()%>&acao=deletar">Deletar</a></td>
			</tr>
		<%
		}
		%>
	</table>
	 <input type="button" value="Retornar" onclick="history.back()">
</body>
</html>