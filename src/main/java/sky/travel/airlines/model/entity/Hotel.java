package sky.travel.airlines.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hoteles")
public class Hotel {

	@Id
	@Column(name = "hotel_cod", length = 10)
	private String codigo;

	@Column(name = "nombre", length = 80)
	private String nombre;
	
	@Column(name = "fono_hotel")
	private Integer telefono;
	
	@Column(name = "dir_hotel", length = 50, nullable = true)
	private String direccion;
	
	@Column(name = "precio")
	private Float precio;
	
	@OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
	private List<Pasajero> pasajeros;
	
	@OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
	private List<Recepcionista> recepcionistas;

	///////
	public Hotel() {
		pasajeros = new ArrayList<>();
		recepcionistas = new ArrayList<>();
	}
	//-----------------
	public void addRecepcionista(Recepcionista recepcionista) {
		recepcionista.setHotel(this);
		this.recepcionistas.add(recepcionista);
	}
	public void addPasajero(Pasajero pasajero) {
		pasajeros.add(pasajero);
	}
	///////
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public List<Recepcionista> getRecepcionistas() {
		return recepcionistas;
	}

	public void setRecepcionistas(List<Recepcionista> recepcionistas) {
		this.recepcionistas = recepcionistas;
	}
	
}
