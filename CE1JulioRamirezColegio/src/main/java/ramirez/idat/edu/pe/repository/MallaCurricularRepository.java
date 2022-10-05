package ramirez.idat.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ramirez.idat.edu.pe.model.MallaCurricular;


@Repository
public interface MallaCurricularRepository extends JpaRepository<MallaCurricular, Integer >{

}
