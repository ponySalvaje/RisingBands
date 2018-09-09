package pe.edu.upc.marcelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.marcelo.models.dao.IMusicstudioownerDAO;
import pe.edu.upc.marcelo.models.entity.Musicstudioowner;
import pe.edu.upc.marcelo.service.inter.IMusicstudioownerService;

@Service
public class MusicstudioownerService implements IMusicstudioownerService {

	@Autowired
	private IMusicstudioownerDAO musicstudioownerDao;
	
	@Override
	public List<Musicstudioowner> findAll() {
		// TODO Auto-generated method stub
		return musicstudioownerDao.findAll();
	}

	@Override
	public Musicstudioowner findById(Long id) {
		// TODO Auto-generated method stub
		return musicstudioownerDao.findById(id).orElse(null);
	}

	@Override
	public void save(Musicstudioowner t) {
		// TODO Auto-generated method stub
		musicstudioownerDao.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		musicstudioownerDao.deleteById(id);
	}
}
