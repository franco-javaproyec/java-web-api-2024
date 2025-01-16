package ar.com.educacionit.repository.repositories;

import ar.com.educacionit.repository.dtos.ProductoDTO;

public interface ProductoRepository {

	//Create
	public void save (ProductoDTO entity);
	
//	Read
	public ProductoDTO getById(Long id);
	
//	Update
	public ProductoDTO update(ProductoDTO entity);
	
//	Delete
	public ProductoDTO delete(Long id);
	
}
