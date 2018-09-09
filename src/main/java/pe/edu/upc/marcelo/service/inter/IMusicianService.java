package pe.edu.upc.marcelo.service.inter;

import pe.edu.upc.marcelo.models.entity.Musician;

public interface IMusicianService extends IService<Musician> {
	
	public Musician fetchByIdWithGenres(Long id);
	
	public Musician fetchByIdWithInstruments(Long id);
}
