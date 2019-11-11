package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Origen;
import sky.travel.airlines.model.repository.OrigenRepository;
import sky.travel.airlines.service.OrigenService;

@Service
public class OrigenServiceImpl implements OrigenService{

	@Autowired
	private OrigenRepository origenRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Origen> findAll() throws Exception {
		return origenRepository.findAll();
	}

	@Override
	public Optional<Origen> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Origen save(Origen entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Origen update(Origen entity) throws Exception {
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
