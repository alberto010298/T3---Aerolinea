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
@Table(name = "paquetes")
public class Paquete {

	@Id
	@Column(name = "paquete_id", length = 10)
	private String id;

	@Column(name = "nombre", length = 30)
	private String nombre;
	
	@Column(name = "descrip_paquete", length = 30)
	private String descripcion;
	
	@Column(name = "precio")
	private Float precio;
	
	@OneToMany(mappedBy = "paquete", fetch = FetchType.LAZY)
	private List<Pasajero> pasajeros;

	/////////
	public Paquete() {
		this.pasajeros = new ArrayList<>();
	}
	
	public void addPasajero(Pasajero pasajero) {
		pasajero.setPaquete(this);
		this.pasajeros.add(pasajero);
	}
	/////////
	
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
}
