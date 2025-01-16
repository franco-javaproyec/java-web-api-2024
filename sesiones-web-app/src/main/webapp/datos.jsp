<%@page import="ar.com.educacionit.repository.dtos.ProductoDTO"%>
<html>
<head>
</head>
<body>
<!--       Baja el dato de la sesion  -->
    <%
       ProductoDTO producto = (ProductoDTO)session.getAttribute("PRODUCTO");
    %>
    <div>
    <label> ID : </label> <%=producto.getId()%>
    <label> Precio :</label> <%=producto.getPrecio() %> 
    <label> Titulo : </label><%=producto.getTitulo() %> 
    </div>
</body>
</html>