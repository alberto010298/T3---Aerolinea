package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Pago;
import sky.travel.airlines.model.repository.PagoRepository;
import sky.travel.airlines.service.PagoService;

@Service
public class PagoServiceImpl implements PagoService{

	@Autowired
	private PagoRepository pagoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Pago> findAll() throws Exception {
		return pagoRepository.findAll();
	}

	@Override
	public Optional<Pago> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pago save(Pago entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pago update(Pago entity) throws Exception {
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
