package ar.com.educacionit.repository.dtos;

public class ProductoDTO {

	
	
	private Long id;
	private String titulo;
	private Double precio;
	
	//mutable|inmutable?
	public ProductoDTO(Long id, String titulo, Double precio) {
		super();
		setId(id);
		this.titulo = titulo;// ¿Hay control?
		this.precio = precio;
	}

	public void setId(Long id) {
		if(id == null || id < 0) {
			throw new IllegalArgumentException("Id no puede ser nulo ni 0");
		}
	this.id = id;	
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "ProductoDTO {id:" + id + ", titulo:" + titulo + ", precio:" + precio + "}";
	}
	
	
	
	
	
	
	
}
