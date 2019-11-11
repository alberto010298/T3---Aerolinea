package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Cabina;
import sky.travel.airlines.model.repository.CabinaRepository;
import sky.travel.airlines.service.CabinaService;

@Service
public class CabinaServiceImpl implements CabinaService{

	@Autowired
	private CabinaRepository cabinaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Cabina> findAll() throws Exception {
		return cabinaRepository.findAll();
	}

	@Override
	public Optional<Cabina> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cabina save(Cabina entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cabina update(Cabina entity) throws Exception {
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
