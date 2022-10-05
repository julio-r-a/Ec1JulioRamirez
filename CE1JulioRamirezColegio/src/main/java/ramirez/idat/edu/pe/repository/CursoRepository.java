package ramirez.idat.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ramirez.idat.edu.pe.model.Curso;


@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer > {

}
