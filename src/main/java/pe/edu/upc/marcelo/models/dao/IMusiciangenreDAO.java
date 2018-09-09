package pe.edu.upc.marcelo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.marcelo.models.entity.Musiciangenre;

@Repository
public interface IMusiciangenreDAO extends JpaRepository<Musiciangenre, Long> {

}
