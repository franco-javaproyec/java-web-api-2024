package ar.com.educacionit.javawebapi.controllers;

import java.io.IOException;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.ProductoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Convierto en WebServlet
@WebServlet("/api/producto")
public class ProductoController extends HttpServlet {
 
    
	
	
	@Override
        protected void doGet(
		HttpServletRequest req, // viene todos los parametros del front
		HttpServletResponse resp
		) 
	    throws ServletException, IOException {
//	    BUSCA UN PRODUCTO EN LA DB POR SU ID
                  	
//		capturo el parametro desde el req
		String id = req.getParameter("id"); // es un numero
		long idL = Long.parseLong(id);
		
		
		
		//ahora instancio el servicio
	    ProductoService service = new ProductoServiceImpl();
		
	    //obtengo el producto usando el servicio
	    ProductoDTO productoDTO = service.getById(idL);
	    
	    //propio de los Servlet, para escribir en el response
//	    resp.getWriter().print(productoDTO.toString());
	    
	    
//	    Guarda en la sesion el objeto de la DB
	    req.getSession().setAttribute("PRODUCTO", productoDTO);
	    
//	    redirect
	    getServletContext().getRequestDispatcher("/datos.jsp").forward(req, resp);
	} 
}
