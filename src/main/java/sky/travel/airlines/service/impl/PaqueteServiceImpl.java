package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Paquete;
import sky.travel.airlines.model.repository.PaqueteRepository;
import sky.travel.airlines.service.PaqueteService;

@Service
public class PaqueteServiceImpl implements PaqueteService{

	@Autowired
	private PaqueteRepository paqueteRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Paquete> findAll() throws Exception {
		return paqueteRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Paquete> findById(String id) throws Exception {
		return paqueteRepository.findById(id);
	}

	@Transactional
	@Override
	public Paquete save(Paquete entity) throws Exception {
		return paqueteRepository.save(entity);
	}

	@Transactional
	@Override
	public Paquete update(Paquete entity) throws Exception {
		return paqueteRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		paqueteRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		paqueteRepository.deleteAll();
	}

}
