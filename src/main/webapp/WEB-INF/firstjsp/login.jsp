<form action=loginpagedata>
	UserName: <input type="text" name="username"><br>
	Password: <input type="text" name="password"><br> <input
		type="submit"><br>
</form>

<%
if (request.getAttribute("msg") != null) {
	if (request.getAttribute("msg").equals("login successfully")) {
%>
<font color="green"> <%
 out.print(request.getAttribute("msg"));
 %>
</font>
<%
} else {
%>
<font color="red"> <%
 out.print(request.getAttribute("msg"));
 %></font>
<%
}
}
%>

