<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clase 2 - Java Web Api</title>
</head>
<body>
     <form 
     method="get"
     action="<%=request.getContextPath()%>/api/producto?id=1">
     <input type="hidden" name="id" value="1"/>
     <button>
       Consultar
     </button>
      </form>
</body>
</html>