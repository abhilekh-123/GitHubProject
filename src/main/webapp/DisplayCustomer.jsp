<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource var="dataSource"
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/java13"
	user="root" password="root"/>
<body>
	<sql:query var="customers" dataSource="${dataSource}">
		select * from customer
	</sql:query>
	<table border>
		<tr>
			<th>Customer Name</th>
			<th>username</th>
			<th>password</th>
			<th>Age</th>
			<th>Email</th>
		</tr>
		<c:forEach var="customer" items="${customers.rows}">
			<tr>
				<td><c:out value="${customer.custName}"/></td>
				<td><c:out value="${customer.username}"/></td>
				<td><c:out value="${customer.password}"/></td>
				<td><c:out value="${customer.age}"/></td>
				<td><c:out value="${customer.email}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>