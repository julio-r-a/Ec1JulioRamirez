package ramirez.idat.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ramirez.idat.edu.pe.model.Universidad;


@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer >{

}
