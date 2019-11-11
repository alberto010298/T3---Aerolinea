package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Relacion;
import sky.travel.airlines.model.repository.RelacionRepository;
import sky.travel.airlines.service.RelacionService;

@Service
public class RelacionServiceImpl implements RelacionService{

	@Autowired
	private RelacionRepository relacionRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Relacion> findAll() throws Exception {
		return relacionRepository.findAll();
	}

	@Override
	public Optional<Relacion> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Relacion save(Relacion entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Relacion update(Relacion entity) throws Exception {
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
