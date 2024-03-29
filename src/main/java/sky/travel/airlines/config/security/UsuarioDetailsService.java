package sky.travel.airlines.config.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import sky.travel.airlines.model.entity.Usuario;
import sky.travel.airlines.model.repository.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Retornando el usuario 
		Optional<Usuario> buscado = this.usuarioRepository.findByUsername(username);
		
		if(buscado.isPresent()) {
			UsuarioDetails usuarioDetails = new UsuarioDetails(buscado.get());
			return usuarioDetails;
		}
		throw new UsernameNotFoundException("Invalid User");
	}
}
