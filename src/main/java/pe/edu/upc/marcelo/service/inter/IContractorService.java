package pe.edu.upc.marcelo.service.inter;

import pe.edu.upc.marcelo.models.entity.Contractor;

public interface IContractorService extends IService<Contractor> {

	public Contractor fetchByIdWithEvents(Long id);
}
