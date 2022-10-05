package ramirez.idat.edu.pe.service;

import java.util.List;

import ramirez.idat.edu.pe.model.Profesor;

public interface ProfesorService {
	
	void guardar(Profesor profesor);
	void actualizar(Profesor profesor);
	void eliminar (Integer id);
	List<Profesor> listar();
	Profesor obtener(Integer id);
}
