package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Recepcionista;
import sky.travel.airlines.model.repository.RecepcionistaRepository;
import sky.travel.airlines.service.RecepcionistaService;

@Service
public class RecepcionistaServiceImpl implements RecepcionistaService{

	@Autowired
	private RecepcionistaRepository recepcionistaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Recepcionista> findAll() throws Exception {
		return recepcionistaRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Recepcionista> findById(String id) throws Exception {
		return recepcionistaRepository.findById(id);
	}

	@Transactional
	@Override
	public Recepcionista save(Recepcionista entity) throws Exception {
		return recepcionistaRepository.save(entity);
	}

	@Transactional
	@Override
	public Recepcionista update(Recepcionista entity) throws Exception {
		return recepcionistaRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		recepcionistaRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		recepcionistaRepository.deleteAll();
	}
	
	
	
}
