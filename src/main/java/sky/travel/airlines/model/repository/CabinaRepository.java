package sky.travel.airlines.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sky.travel.airlines.model.entity.Cabina;

@Repository
public interface CabinaRepository extends JpaRepository<Cabina, String>{

}
