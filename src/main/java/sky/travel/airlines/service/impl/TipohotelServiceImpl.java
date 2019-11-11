package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Tipohotel;
import sky.travel.airlines.model.repository.TipohotelRepository;
import sky.travel.airlines.service.TipohotelService;

@Service
public class TipohotelServiceImpl implements TipohotelService{

	@Autowired
	private TipohotelRepository tipohotelRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tipohotel> findAll() throws Exception {
		return tipohotelRepository.findAll();
	}

	@Override
	public Optional<Tipohotel> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tipohotel save(Tipohotel entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tipohotel update(Tipohotel entity) throws Exception {
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
