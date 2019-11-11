package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Tipopasajero;
import sky.travel.airlines.model.repository.TipopasajeroRepository;
import sky.travel.airlines.service.TipopasajeroService;

@Service
public class TipopasajeroServiceImpl implements TipopasajeroService{

	@Autowired
	private TipopasajeroRepository tipopasajeroRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tipopasajero> findAll() throws Exception {
		return tipopasajeroRepository.findAll();
	}

	@Override
	public Optional<Tipopasajero> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tipopasajero save(Tipopasajero entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tipopasajero update(Tipopasajero entity) throws Exception {
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
