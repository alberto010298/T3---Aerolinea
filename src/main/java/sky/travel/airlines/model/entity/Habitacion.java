package sky.travel.airlines.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "habitaciones")
public class Habitacion {

	@Id
	@Column(name = "habitacion_id", length = 10)
	private String id;

	@Column(name = "nro_camas")
	private Integer nroCamas;
	
	@OneToMany(mappedBy = "habitacion", fetch = FetchType.LAZY)
	private List<Pasajero> pasajeros;

	///////
	public Habitacion() {
		this.pasajeros = new ArrayList<>();
	}
	
	public void addPasajero(Pasajero pasajero) {
		pasajero.setHabitacion(this);
		this.pasajeros.add(pasajero);
	}
	///////
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNroCamas() {
		return nroCamas;
	}

	public void setNroCamas(Integer nroCamas) {
		this.nroCamas = nroCamas;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
}
