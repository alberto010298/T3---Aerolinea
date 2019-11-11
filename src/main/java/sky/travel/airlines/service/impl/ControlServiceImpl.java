package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Control;
import sky.travel.airlines.model.repository.ControlRepository;
import sky.travel.airlines.service.ControlService;

@Service
public class ControlServiceImpl implements ControlService{

	@Autowired
	private ControlRepository controlRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Control> findAll() throws Exception {
		return controlRepository.findAll();
	}

	@Override
	public Optional<Control> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Control save(Control entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Control update(Control entity) throws Exception {
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
