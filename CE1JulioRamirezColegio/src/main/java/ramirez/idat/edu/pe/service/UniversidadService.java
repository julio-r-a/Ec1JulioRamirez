package ramirez.idat.edu.pe.service;

import java.util.List;

import ramirez.idat.edu.pe.model.Universidad;

public interface UniversidadService {
	
	void guardar(Universidad universidad);
	void actualizar(Universidad universidad);
	void eliminar (Integer id);
	List<Universidad> listar();
	Universidad obtener(Integer id);

}
