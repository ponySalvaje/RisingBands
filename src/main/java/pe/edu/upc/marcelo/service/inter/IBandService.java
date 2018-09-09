package pe.edu.upc.marcelo.service.inter;

import pe.edu.upc.marcelo.models.entity.Band;

public interface IBandService extends IService<Band> {
	
	public Band fetchByIdWithEvents(Long id);
}
