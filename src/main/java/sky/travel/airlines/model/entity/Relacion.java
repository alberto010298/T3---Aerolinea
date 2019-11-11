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
@Table(name = "relaciones")
public class Relacion {

	@Id
	@Column(name = "relacion_id", length = 10)
	private String id;

	@Column(name = "nombre", length = 30)
	private String nombre;
	
	@OneToMany(mappedBy = "relacion", fetch = FetchType.LAZY)
	private List<Usuario> usuarios;
	
	public Relacion() {
		this.usuarios = new ArrayList<>();
	}
	
	public void addUsuario(Usuario usuario) {
		usuario.setRelacion(this);
		this.usuarios.add(usuario);
	}
	
	
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

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
