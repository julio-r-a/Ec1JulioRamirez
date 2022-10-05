package ramirez.idat.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ramirez.idat.edu.pe.model.Profesor;
import ramirez.idat.edu.pe.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl  implements ProfesorService{
	
	@Autowired
	private ProfesorRepository repository;

	@Override
	public void guardar(Profesor profesor) {
		repository.save(profesor);		
		
	}

	@Override
	public void actualizar(Profesor profesor) {
		repository.saveAndFlush(profesor);		
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);		
		
	}

	@Override
	public List<Profesor> listar() {
		return repository.findAll();		
		
	}

	@Override
	public Profesor obtener(Integer id) {
		return repository.findById(id).orElse(null);		

	}

}
