package sky.travel.airlines.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class IndexController {
	
	/*
	@Autowired
	private UsuarioService usuarioService;*/
	
	@GetMapping
	public String index() {
		return "index";	// Archivo html que se devuelve
	}
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
	
	

}
