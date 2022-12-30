<%
 String bgcolor=request.getParameter("bgcolor");
if(bgcolor==null || bgcolor.trim().equals(" "))
	bgcolor="white";
%>
<body bgcolor=<%= bgcolor %>>
Background color <%= bgcolor %>
</body>