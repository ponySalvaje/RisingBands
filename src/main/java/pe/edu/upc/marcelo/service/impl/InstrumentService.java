package pe.edu.upc.marcelo.service.impl;

import java.util.List;


import pe.edu.upc.marcelo.models.dao.IInstrumentDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.marcelo.models.entity.Instrument;
import pe.edu.upc.marcelo.service.inter.IInstrumentService;

@Service
public class InstrumentService implements IInstrumentService {

	@Autowired
	private IInstrumentDAO instrumentDao;
	
	@Override
	public List<Instrument> findAll() {
		// TODO Auto-generated method stub
		return instrumentDao.findAll();
	}

	@Override
	public Instrument findById(Long id) {
		// TODO Auto-generated method stub
		return instrumentDao.findById(id).orElse(null);
	}

	@Override
	public void save(Instrument t) {
		// TODO Auto-generated method stub
		instrumentDao.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		instrumentDao.deleteById(id);
	}

	@Override
	public List<Instrument> findInstrumentByName(String term) {
		// TODO Auto-generated method stub
		return instrumentDao.findInstrumentByName(term);
	}
}
