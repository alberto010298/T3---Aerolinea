package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Pasajero;
import sky.travel.airlines.model.repository.PasajeroRepository;
import sky.travel.airlines.service.PasajeroService;

@Service
public class PasajeroServiceImpl implements PasajeroService{

	@Autowired
	private PasajeroRepository pasajeroRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Pasajero> findAll() throws Exception {
		return pasajeroRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Pasajero> findById(Integer id) throws Exception {
		return pasajeroRepository.findById(id);
	}

	@Transactional
	@Override
	public Pasajero save(Pasajero entity) throws Exception {
		return pasajeroRepository.save(entity);
	}

	@Transactional
	@Override
	public Pasajero update(Pasajero entity) throws Exception {
		return pasajeroRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		pasajeroRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		pasajeroRepository.deleteAll();
	}

}
