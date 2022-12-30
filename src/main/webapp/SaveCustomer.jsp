<%@page import="mypack.InsertCustomer" %>
<jsp:useBean id="customer" class="mypack.Customer" scope= "session"/>

<jsp:setProperty property="*" name="customer"/>
<%
boolean flag= InsertCustomer.saveCustomer(customer);
if(flag)
	out.println("<h3>customer added sucessfully</h3>");
%>
<a href="customer.html"> add new customer</a>
<a href="DisplayCustomer.jsp"> display customer details</a>
