package ar.com.educacionit.repository.repositories.impl;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.repository.repositories.ProductoRepository;

public class ProductoRepositoryMySqlimpl implements ProductoRepository {

	@Override
	public void save(ProductoDTO entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductoDTO getById(Long id) {
		//hardcode
		String sql = "SELECT * from producto where id="+id;
		System.out.println(sql);
		
		//simulo que tengo los datos de la db
		Long _id = id;
		String titulo = "producto simulado desde la db";
		Double precio = 1500.75d;
		
		
		
		return new ProductoDTO(_id, titulo, precio);
	}

	@Override
	public ProductoDTO update(ProductoDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
