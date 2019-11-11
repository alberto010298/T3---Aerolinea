package sky.travel.airlines.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import sky.travel.airlines.model.entity.Hotel;
import sky.travel.airlines.model.entity.Recepcionista;
import sky.travel.airlines.service.HotelService;
import sky.travel.airlines.service.RecepcionistaService;

@Controller
@RequestMapping("/hotel")
@SessionAttributes( {"hotel", "recepcionista" } )
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	@Autowired
	private RecepcionistaService recepcionistaService;
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Hotel> hoteles = hotelService.findAll();
			model.addAttribute("hoteles", hoteles);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/hotel/lista";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("hotel") Hotel hotel, 
			Model model, SessionStatus status) {
		try {
			hotelService.save(hotel);
			status.setComplete();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/hotel";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		Hotel hotel = new Hotel();
		model.addAttribute("hotel", hotel);
		try {
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/hotel/nuevo";
	}
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") String id, Model model) {
		try {
			Optional<Hotel> optional = hotelService.findById(id);
			if (optional.isPresent()) {
				
				model.addAttribute("hotel", optional.get());
			} else {
				return "redirect:/hotel";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "/hotel/edit";
	}
	
	@GetMapping("/del/{id}")
	public String eliminar(@PathVariable("id") String id, Model model) {
		try {
			Optional<Hotel> hotel = hotelService.findById(id);
			if(hotel.isPresent()) {
				hotelService.deleteById(id);
			}
		} catch (Exception e) {
			
			model.addAttribute("dangerDel", "ERROR - Violación contra el principio de Integridad referencia");
			try {
				List<Hotel> hoteles = hotelService.findAll();
				model.addAttribute("hoteles", hoteles);
			} catch (Exception e2) {
				// TODO: handle exception
			} 
			return "/hotel/lista";
		}
		return "redirect:/hotel";
	}
	
	@GetMapping("/info/{id}")
	public String info(@PathVariable("id") String id, Model model) {
		try {
			Optional<Hotel> hotel = hotelService.findById(id);
			if(hotel.isPresent()) {
				model.addAttribute("hotel", hotel.get());
			} else {
				return "redirect:/hotel";
			}
		} catch (Exception e) {

		}	
		
		return "/hotel/info";
	}
	
	@GetMapping("/{id}/nuevorecepcionista")
	public String nuevoPaciente(@PathVariable("id") String id, Model model) {
		Recepcionista recepcionista = new Recepcionista();
		try {
			Optional<Hotel> hotel = hotelService.findById(id);
			if(hotel.isPresent()) {
				recepcionista.setHotel(hotel.get());
				model.addAttribute("recepcionista", recepcionista);
			} else {
				return "redirect:/hotel";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/hotel/nuevorecepcionista";
	}

	@PostMapping("/saverecepcionista")
	public String saveRecepcionista(@ModelAttribute("recepcionista") Recepcionista recepcionista, 
			Model model, SessionStatus status) {
		try {
			recepcionistaService.save(recepcionista);
			status.setComplete();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/hotel/info/" + recepcionista.getHotel().getCodigo();
	}
	
	@GetMapping("/deli/{id}")
	public String eliminarRecepcionista(@PathVariable("id") String id, Model model) {
		try {
			Optional<Recepcionista> recepcionista = recepcionistaService.findById(id);
			if(recepcionista.isPresent()) {
				recepcionistaService.deleteById(id);
			}
		} catch (Exception e) {	
			// TODO: handle exception
		}
		return "redirect:/hotel";
	}
	
	@GetMapping("/editi/{id}")
	public String editarRecepcionista(@PathVariable("id") String id, Model model) {
		try {
			Optional<Recepcionista> optional = recepcionistaService.findById(id);
			if (optional.isPresent()) {
				
				model.addAttribute("recepcionista", optional.get());
			} else {
				return "redirect:/hotel";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "/hotel/editrecepcionista";
	}
}
