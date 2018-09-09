package pe.edu.upc.marcelo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.marcelo.models.entity.Musicianinstrument;

@Repository
public interface IMusicianinstrumentDAO extends JpaRepository<Musicianinstrument, Long> {

}
