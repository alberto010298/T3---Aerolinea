package sky.travel.airlines.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import sky.travel.airlines.model.entity.Relacion;
import sky.travel.airlines.model.entity.Usuario;
import sky.travel.airlines.service.RelacionService;
import sky.travel.airlines.service.UsuarioService;



@Controller
@RequestMapping("/usuario")
@SessionAttributes({"usuario"})
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RelacionService relacionService;
	
	@GetMapping("/register")
	public String register(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		try {
			List<Relacion> relaciones = 
					relacionService.findAll();
			model.addAttribute("relacio", relaciones);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/usuario/register";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("usuario") Usuario usuario, 
			Model model, SessionStatus status) {
		
		try {
			// Verificar que el username ya exista.
			Optional<Usuario> optional 
				= usuarioService.findByUsername(usuario.getUsername());
			if(optional.isPresent()) {
				model.addAttribute("dangerRegister"
						, "ERROR - El username " 
							+ usuario.getUsername() 
							+ " ya existe ");
				return "/usuario/register";
			} else {
				usuario.setPassword(passwordEncoder
						.encode( usuario.getPassword() ));
				usuario.addAuthority("ROLE_CLIENTE");
				usuarioService.save(usuario);
				status.setComplete();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/login";
	}
}








