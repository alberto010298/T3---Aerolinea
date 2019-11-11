package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Hotel;
import sky.travel.airlines.model.repository.HotelRepository;
import sky.travel.airlines.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Hotel> findAll() throws Exception {
		return hotelRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Hotel> findById(String id) throws Exception {
		return hotelRepository.findById(id);
	}

	@Transactional
	@Override
	public Hotel save(Hotel entity) throws Exception {
		return hotelRepository.save(entity);
	}

	@Transactional
	@Override
	public Hotel update(Hotel entity) throws Exception {
		return hotelRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		hotelRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		hotelRepository.deleteAll();
	}

}
