package ramirez.idat.edu.pe.service;

import java.util.List;

import ramirez.idat.edu.pe.model.Curso;

public interface CursoService {
	
	void guardar(Curso curso);
	void actualizar(Curso curso);
	void eliminar (Integer id);
	List<Curso> listar();
	Curso obtener(Integer id);

}
