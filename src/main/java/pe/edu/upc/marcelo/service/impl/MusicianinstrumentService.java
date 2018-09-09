package pe.edu.upc.marcelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.marcelo.models.dao.IMusicianinstrumentDAO;
import pe.edu.upc.marcelo.models.entity.Musicianinstrument;
import pe.edu.upc.marcelo.service.inter.IMusicianinstrumentService;

@Service
public class MusicianinstrumentService implements IMusicianinstrumentService {

	@Autowired
	private IMusicianinstrumentDAO musicianinstrumentDao;
	
	@Override
	public List<Musicianinstrument> findAll() {
		// TODO Auto-generated method stub
		return musicianinstrumentDao.findAll();
	}

	@Override
	public Musicianinstrument findById(Long id) {
		// TODO Auto-generated method stub
		return musicianinstrumentDao.findById(id).orElse(null);
	}

	@Override
	public void save(Musicianinstrument t) {
		// TODO Auto-generated method stub
		musicianinstrumentDao.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		musicianinstrumentDao.deleteById(id);
	}
}
