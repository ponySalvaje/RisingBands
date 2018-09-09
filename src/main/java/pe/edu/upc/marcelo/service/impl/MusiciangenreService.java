package pe.edu.upc.marcelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.marcelo.models.dao.IMusiciangenreDAO;
import pe.edu.upc.marcelo.models.entity.Musiciangenre;
import pe.edu.upc.marcelo.service.inter.IMusiciangenreService;

@Service
public class MusiciangenreService implements IMusiciangenreService {

	@Autowired
	private IMusiciangenreDAO musiciangenreDao;
	
	@Override
	public List<Musiciangenre> findAll() {
		// TODO Auto-generated method stub
		return musiciangenreDao.findAll();
	}

	@Override
	public Musiciangenre findById(Long id) {
		// TODO Auto-generated method stub
		return musiciangenreDao.findById(id).orElse(null);
	}

	@Override
	public void save(Musiciangenre t) {
		// TODO Auto-generated method stub
		musiciangenreDao.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		musiciangenreDao.deleteById(id);
	}
}
