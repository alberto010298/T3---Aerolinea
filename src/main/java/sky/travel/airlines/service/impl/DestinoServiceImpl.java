package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Destino;
import sky.travel.airlines.model.repository.DestinoRepository;
import sky.travel.airlines.service.DestinoService;

@Service
public class DestinoServiceImpl implements DestinoService{

	@Autowired
	private DestinoRepository destinoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Destino> findAll() throws Exception {
		return destinoRepository.findAll();
	}

	@Override
	public Optional<Destino> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Destino save(Destino entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Destino update(Destino entity) throws Exception {
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
