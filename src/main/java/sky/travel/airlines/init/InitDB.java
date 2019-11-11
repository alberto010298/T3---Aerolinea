package sky.travel.airlines.init;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import sky.travel.airlines.model.entity.Relacion;
import sky.travel.airlines.model.entity.Usuario;
import sky.travel.airlines.model.repository.AuthorityRepository;
import sky.travel.airlines.model.repository.RelacionRepository;
import sky.travel.airlines.model.repository.UsuarioRepository;


@Service
public class InitDB implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		
		this.usuarioRepository.deleteAll();
		this.authorityRepository.deleteAll();
		
		Usuario alberto = new Usuario();
		alberto.setUsername("alberto");
		alberto.setPassword(passwordEncoder.encode("alberto"));
		alberto.setApellidos("Castro");
		alberto.setNombres("Alberto");
		alberto.setEnable(true);
		
		Usuario admin = new Usuario();
		admin.setUsername("admin");
		admin.setPassword(passwordEncoder.encode("admin"));
		admin.setApellidos("Ruiz");
		admin.setNombres("Jorge");
		admin.setEnable(true);
		
		
        Usuario manager = new Usuario();
        manager.setUsername("manager");
        manager.setPassword(passwordEncoder.encode("manager"));
        manager.setApellidos("Caceres");
		manager.setNombres("Antu");
        manager.setEnable(true);
        
        alberto.addAuthority("ROLE_USER");
        alberto.addAuthority("ACCESS_PASAJERO_READ");
        admin.addAuthority("ROLE_ADMIN");
        admin.addAuthority("ACCESS_REST1");
        manager.addAuthority("ROLE_MANAGER");
        manager.addAuthority("ACCESS_REST2");
        
        List<Usuario> usuarios = Arrays.asList(alberto, admin, manager);        
        this.usuarioRepository.saveAll(usuarios);
	}
}
