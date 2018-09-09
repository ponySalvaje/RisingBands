package pe.edu.upc.marcelo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.marcelo.models.entity.Musicstudio;

@Repository
public interface IMusicstudioDAO extends JpaRepository<Musicstudio, Long> {
	
	@Query("select m from Musicstudio m left join fetch m.studiorooms s where m.id=?1")
	public Musicstudio fetchByIdWithStudiorooms(Long id);
}
