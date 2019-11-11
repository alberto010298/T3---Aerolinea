package sky.travel.airlines.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sky.travel.airlines.model.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
