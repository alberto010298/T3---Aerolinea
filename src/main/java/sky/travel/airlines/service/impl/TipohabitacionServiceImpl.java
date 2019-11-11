package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Tipohabitacion;
import sky.travel.airlines.model.repository.TipohabitacionRepository;
import sky.travel.airlines.service.TipohabitacionService;

@Service
public class TipohabitacionServiceImpl implements TipohabitacionService{

	@Autowired
	private TipohabitacionRepository tipohabitacionRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tipohabitacion> findAll() throws Exception {
		return tipohabitacionRepository.findAll();
	}

	@Override
	public Optional<Tipohabitacion> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tipohabitacion save(Tipohabitacion entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tipohabitacion update(Tipohabitacion entity) throws Exception {
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
