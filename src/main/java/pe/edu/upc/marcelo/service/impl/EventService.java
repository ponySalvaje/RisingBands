package pe.edu.upc.marcelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.marcelo.models.dao.IEventDAO;
import pe.edu.upc.marcelo.models.entity.Event;
import pe.edu.upc.marcelo.service.inter.IEventService;

@Service
public class EventService implements IEventService {

	@Autowired
	private IEventDAO eventDao;
	
	@Override
	public List<Event> findAll() {
		// TODO Auto-generated method stub
		return eventDao.findAll();
	}

	@Override
	public Event findById(Long id) {
		// TODO Auto-generated method stub
		return eventDao.findById(id).orElse(null);
	}

	@Override
	public void save(Event t) {
		// TODO Auto-generated method stub
		eventDao.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		eventDao.deleteById(id);
	}
}