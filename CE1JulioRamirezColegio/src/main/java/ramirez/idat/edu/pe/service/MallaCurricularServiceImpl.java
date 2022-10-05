package ramirez.idat.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ramirez.idat.edu.pe.model.MallaCurricular;
import ramirez.idat.edu.pe.repository.MallaCurricularRepository;

@Service
public class MallaCurricularServiceImpl implements MallaCurricularService {
	
	@Autowired
	private MallaCurricularRepository repository;

	@Override
	public void guardar(MallaCurricular mallaCurricular) {
		repository.save(mallaCurricular);		
		
	}

	@Override
	public void actualizar(MallaCurricular mallaCurricular) {
		repository.saveAndFlush(mallaCurricular);		
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);		
		
	}

	@Override
	public List<MallaCurricular> listar() {
		return repository.findAll();		

	}

	@Override
	public MallaCurricular obtener(Integer id) {
		return repository.findById(id).orElse(null);		

	}

}
