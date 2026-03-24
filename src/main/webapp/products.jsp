<%@ page import="java.util.*,com.ecommerce.model.Product"%>
<html>
<body>

<h2>Products</h2>

<%
List<Product> list = (List<Product>)request.getAttribute("products");

for(Product p:list){
%>

<p>
<%=p.getName()%> - ₹<%=p.getPrice()%>
<a href="cart?product=<%=p.getName()%>">Add</a>
</p>

<% } %>

<br>
<a href="cart">View Cart</a>

</body>
</html>
