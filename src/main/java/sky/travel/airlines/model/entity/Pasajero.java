package sky.travel.airlines.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pasajeros")
public class Pasajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "DNI", length = 8)
	private Integer dni;
	
	@Column(name = "fec_nac_pasajero")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "nombre", length = 30)
	private String nombre;

	@Column(name = "apellido_pat", length = 30)
	private String apellidoPat;

	@Column(name = "apellido_mat", length = 30)
	private String apellidoMat;
	
	@Column(name = "fec_ida")
	@Temporal(TemporalType.DATE)
	private Date fechaIda;
	
	@Column(name = "fec_vuelta")
	@Temporal(TemporalType.DATE)
	private Date fechaVuelta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cabina_id")
	private Cabina cabina;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "control_id")
	private Control control;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "destino_id")
	private Destino destino;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "genero_id")
	private Genero genero;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "habitacion_id")
	private Habitacion habitacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hotel_codigo")
	private Hotel hotel;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "moneda_id")
	private Moneda moneda;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nacionalidad_id")
	private Nacionalidad nacionalidad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "origen_id")
	private Origen origen;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pago_id")
	private Pago pago;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paquete_id")
	private Paquete paquete;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seguro_id")
	private Seguro seguro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_habitacion_id")
	private Tipohabitacion tipohabitacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_hotel_id")
	private Tipohotel tipohotel;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_pasajero_id")
	private Tipopasajero tipopasajero;
	
	/*/////////
	public Pasajero() {
		hoteles = new ArrayList<>();
	}
	
	public void addHotel(Hotel hotel) {
		hoteles.add(hotel);
	}
	////////*/
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public Date getFechaIda() {
		return fechaIda;
	}

	public void setFechaIda(Date fechaIda) {
		this.fechaIda = fechaIda;
	}

	public Date getFechaVuelta() {
		return fechaVuelta;
	}

	public void setFechaVuelta(Date fechaVuelta) {
		this.fechaVuelta = fechaVuelta;
	}

	public Cabina getCabina() {
		return cabina;
	}

	public void setCabina(Cabina cabina) {
		this.cabina = cabina;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public Tipohabitacion getTipohabitacion() {
		return tipohabitacion;
	}

	public void setTipohabitacion(Tipohabitacion tipohabitacion) {
		this.tipohabitacion = tipohabitacion;
	}

	public Tipohotel getTipohotel() {
		return tipohotel;
	}

	public void setTipohotel(Tipohotel tipohotel) {
		this.tipohotel = tipohotel;
	}

	public Tipopasajero getTipopasajero() {
		return tipopasajero;
	}

	public void setTipopasajero(Tipopasajero tipopasajero) {
		this.tipopasajero = tipopasajero;
	}

}
