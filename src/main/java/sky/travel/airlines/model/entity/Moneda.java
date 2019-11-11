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
@Table(name = "monedas")
public class Moneda {

	@Id
	@Column(name = "moneda_id", length = 10)
	private String id;

	@Column(name = "nombre", length = 30)
	private String nombre;

	@OneToMany(mappedBy = "moneda", fetch = FetchType.LAZY)
	private List<Pasajero> pasajeros;

	///////
	public Moneda() {
		this.pasajeros = new ArrayList<>();
	}
	
	public void addPasajero(Pasajero pasajero) {
		pasajero.setMoneda(this);
		this.pasajeros.add(pasajero);
	}
	///////
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
}
