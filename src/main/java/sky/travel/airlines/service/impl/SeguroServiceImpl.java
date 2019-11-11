package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Seguro;
import sky.travel.airlines.model.repository.SeguroRepository;
import sky.travel.airlines.service.SeguroService;

@Service
public class SeguroServiceImpl implements SeguroService{

	@Autowired
	private SeguroRepository seguroRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Seguro> findAll() throws Exception {
		return seguroRepository.findAll();
	}

	@Override
	public Optional<Seguro> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seguro save(Seguro entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seguro update(Seguro entity) throws Exception {
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
