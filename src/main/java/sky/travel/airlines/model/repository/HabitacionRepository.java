package sky.travel.airlines.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sky.travel.airlines.model.entity.Habitacion;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, String>{

}
