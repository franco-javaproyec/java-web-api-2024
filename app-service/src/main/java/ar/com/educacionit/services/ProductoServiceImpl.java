package ar.com.educacionit.services;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.repository.repositories.ProductoRepository;
import ar.com.educacionit.repository.repositories.impl.ProductoRepositoryMySqlimpl;

public class ProductoServiceImpl implements ProductoService {

	
	private ProductoRepository repository;
	
	
	public ProductoServiceImpl() {

	  inyectarClase();
	}
	
	private void inyectarClase() {
		this.repository = new ProductoRepositoryMySqlimpl();
	}
	
	@Override
	public ProductoDTO getById(Long id) {
		// ahora si, accedo a la base por medio del repository
	
		return this.repository.getById(id);
	
	}
	
	
}
