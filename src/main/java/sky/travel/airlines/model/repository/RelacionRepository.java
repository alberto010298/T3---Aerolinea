package sky.travel.airlines.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sky.travel.airlines.model.entity.Relacion;

@Repository
public interface RelacionRepository extends JpaRepository<Relacion, String>{

}
