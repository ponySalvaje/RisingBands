package pe.edu.upc.marcelo.service.inter;

import java.util.List;

import pe.edu.upc.marcelo.models.entity.Genre;

public interface IGenreService extends IService<Genre> {
	
	public List<Genre> findGenreByName(String term);
}
