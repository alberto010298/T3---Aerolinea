package sky.travel.airlines.service;

import java.util.Optional;

import sky.travel.airlines.model.entity.Usuario;


public interface UsuarioService extends CrudService<Usuario, Long> {
	Optional<Usuario> findByUsername(String username) throws Exception;
}
