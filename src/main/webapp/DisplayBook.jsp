<jsp:useBean id="book" class="mypack.Book" scope="session"/>
<table border>
<tr>
   <th>Book No</th>
   <td><jsp:getProperty name="book" property="bno"/></td>
</tr>
<tr>
<th> Book NAME</th>
<td><jsp:getProperty name="book" property="bname"/></td>
</tr>
<tr>
<th>Book Price </th>
<td><jsp:getProperty name="book" property="price"/></td>

</tr>

</table>
