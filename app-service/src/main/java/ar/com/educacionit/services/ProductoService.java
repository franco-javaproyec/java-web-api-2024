package ar.com.educacionit.services;
import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.repository.repositories.ProductoRepository;

public interface ProductoService {

	
	public ProductoDTO getById(Long id);
	
	
}
