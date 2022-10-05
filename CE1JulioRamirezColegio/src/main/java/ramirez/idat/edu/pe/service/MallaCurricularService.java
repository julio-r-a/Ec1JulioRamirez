package ramirez.idat.edu.pe.service;

import java.util.List;

import ramirez.idat.edu.pe.model.MallaCurricular;

public interface MallaCurricularService {
	
	void guardar(MallaCurricular mallaCurricular);
	void actualizar(MallaCurricular mallaCurricular);
	void eliminar (Integer id);
	List<MallaCurricular> listar();
	MallaCurricular obtener(Integer id);

}
