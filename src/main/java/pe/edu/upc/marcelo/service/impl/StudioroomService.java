package pe.edu.upc.marcelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.marcelo.models.dao.IStudioroomDAO;
import pe.edu.upc.marcelo.models.entity.Studioroom;
import pe.edu.upc.marcelo.service.inter.IStudioroomService;

@Service
public class StudioroomService implements IStudioroomService {

	@Autowired
	private IStudioroomDAO studioroomDao;
	
	@Override
	public List<Studioroom> findAll() {
		// TODO Auto-generated method stub
		return studioroomDao.findAll();
	}

	@Override
	public Studioroom findById(Long id) {
		// TODO Auto-generated method stub
		return studioroomDao.findById(id).orElse(null);
	}

	@Override
	public void save(Studioroom t) {
		// TODO Auto-generated method stub
		studioroomDao.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		studioroomDao.deleteById(id);
	}
}
