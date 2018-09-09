package pe.edu.upc.marcelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upc.marcelo.models.dao.IGenreDAO;

import org.springframework.stereotype.Service;

import pe.edu.upc.marcelo.models.entity.Genre;
import pe.edu.upc.marcelo.service.inter.IGenreService;

@Service
public class GenreService implements IGenreService {

	@Autowired
	private IGenreDAO genreDao;
	
	@Override
	public List<Genre> findAll() {
		// TODO Auto-generated method stub
		return genreDao.findAll();
	}

	@Override
	public Genre findById(Long id) {
		// TODO Auto-generated method stub
		return genreDao.findById(id).orElse(null);
	}

	@Override
	public void save(Genre t) {
		// TODO Auto-generated method stub
		genreDao.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		genreDao.deleteById(id);
	}

	@Override
	public List<Genre> findGenreByName(String term) {
		// TODO Auto-generated method stub
		return genreDao.findGenreByName(term);
	}
}
