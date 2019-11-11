package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Genero;
import sky.travel.airlines.model.repository.GeneroRepository;
import sky.travel.airlines.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService{

	@Autowired
	private GeneroRepository generoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Genero> findAll() throws Exception {
		return generoRepository.findAll();
	}

	@Override
	public Optional<Genero> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genero save(Genero entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genero update(Genero entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
