package pe.edu.upc.marcelo.service.inter;

import pe.edu.upc.marcelo.models.entity.Musicstudio;

public interface IMusicstudioService extends IService<Musicstudio> {

	public Musicstudio fetchByIdWithStudiorooms(Long id);
}
