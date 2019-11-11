package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Habitacion;
import sky.travel.airlines.model.repository.HabitacionRepository;
import sky.travel.airlines.service.HabitacionService;

@Service
public class HabitacionServiceImpl implements HabitacionService{

	@Autowired
	private HabitacionRepository habitacionRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Habitacion> findAll() throws Exception {
		return habitacionRepository.findAll();
	}

	@Override
	public Optional<Habitacion> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Habitacion save(Habitacion entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Habitacion update(Habitacion entity) throws Exception {
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
