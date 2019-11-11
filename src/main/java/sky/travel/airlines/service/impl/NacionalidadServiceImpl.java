package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Nacionalidad;
import sky.travel.airlines.model.repository.NacionalidadRepository;
import sky.travel.airlines.service.NacionalidadService;

@Service
public class NacionalidadServiceImpl implements NacionalidadService{

	@Autowired
	private NacionalidadRepository nacionalidadRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Nacionalidad> findAll() throws Exception {
		return nacionalidadRepository.findAll();
	}

	@Override
	public Optional<Nacionalidad> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nacionalidad save(Nacionalidad entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nacionalidad update(Nacionalidad entity) throws Exception {
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
