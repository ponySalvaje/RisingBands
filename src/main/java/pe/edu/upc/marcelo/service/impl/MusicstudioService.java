package pe.edu.upc.marcelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.marcelo.models.dao.IMusicstudioDAO;
import pe.edu.upc.marcelo.models.entity.Musicstudio;
import pe.edu.upc.marcelo.service.inter.IMusicstudioService;

@Service
public class MusicstudioService implements IMusicstudioService {

	@Autowired
	private IMusicstudioDAO musicstudioDao;
	
	@Override
	public List<Musicstudio> findAll() {
		// TODO Auto-generated method stub
		return musicstudioDao.findAll();
	}

	@Override
	public Musicstudio findById(Long id) {
		// TODO Auto-generated method stub
		return musicstudioDao.findById(id).orElse(null);
	}

	@Override
	public void save(Musicstudio t) {
		// TODO Auto-generated method stub
		musicstudioDao.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		musicstudioDao.deleteById(id);
	}

	@Override
	public Musicstudio fetchByIdWithStudiorooms(Long id) {
		// TODO Auto-generated method stub
		return musicstudioDao.fetchByIdWithStudiorooms(id);
	}
}
