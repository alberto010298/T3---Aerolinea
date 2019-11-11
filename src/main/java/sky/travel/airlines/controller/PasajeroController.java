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

import sky.travel.airlines.model.entity.Cabina;
import sky.travel.airlines.model.entity.Control;
import sky.travel.airlines.model.entity.Destino;
import sky.travel.airlines.model.entity.Genero;
import sky.travel.airlines.model.entity.Habitacion;
import sky.travel.airlines.model.entity.Hotel;
import sky.travel.airlines.model.entity.Moneda;
import sky.travel.airlines.model.entity.Nacionalidad;
import sky.travel.airlines.model.entity.Origen;
import sky.travel.airlines.model.entity.Pago;
import sky.travel.airlines.model.entity.Paquete;
import sky.travel.airlines.model.entity.Pasajero;
import sky.travel.airlines.model.entity.Seguro;
import sky.travel.airlines.model.entity.Tipohabitacion;
import sky.travel.airlines.model.entity.Tipohotel;
import sky.travel.airlines.model.entity.Tipopasajero;
import sky.travel.airlines.service.CabinaService;
import sky.travel.airlines.service.ControlService;
import sky.travel.airlines.service.DestinoService;
import sky.travel.airlines.service.GeneroService;
import sky.travel.airlines.service.HabitacionService;
import sky.travel.airlines.service.HotelService;
import sky.travel.airlines.service.MonedaService;
import sky.travel.airlines.service.NacionalidadService;
import sky.travel.airlines.service.OrigenService;
import sky.travel.airlines.service.PagoService;
import sky.travel.airlines.service.PaqueteService;
import sky.travel.airlines.service.PasajeroService;
import sky.travel.airlines.service.SeguroService;
import sky.travel.airlines.service.TipohabitacionService;
import sky.travel.airlines.service.TipohotelService;
import sky.travel.airlines.service.TipopasajeroService;

@Controller
@RequestMapping("/pasajero")
@SessionAttributes( {"pasajero", "paquete"} )
public class PasajeroController {

	@Autowired
	private PasajeroService pasajeroService;
	
	@Autowired
	private CabinaService cabinaService;
	
	@Autowired
	private ControlService controlService;
	
	@Autowired
	private DestinoService destinoService;
	
	@Autowired
	private GeneroService generoService;
	
	@Autowired
	private HabitacionService habitacionService;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private MonedaService monedaService;
	
	@Autowired
	private NacionalidadService nacionalidadService;
	
	@Autowired
	private OrigenService origenService;
	
	@Autowired
	private PagoService pagoService;
	
	@Autowired
	private PaqueteService paqueteService;
	
	@Autowired
	private SeguroService seguroService;
	
	@Autowired
	private TipohabitacionService tipohabitacionService;
	
	@Autowired
	private TipohotelService tipohotelService;
	
	@Autowired
	private TipopasajeroService tipopasajeroService;
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Pasajero> pasajeros = pasajeroService.findAll();
			model.addAttribute("pasajeros", pasajeros);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/pasajero/inicio";
	}
	
	@GetMapping("/vuelo")
	public String vuelo(Model model) {
		Pasajero pasajero = new Pasajero();
		model.addAttribute("pasajero", pasajero);
		try {
			List<Cabina> cabinas = 
					cabinaService.findAll();
			model.addAttribute("cabin", cabinas);
			
			List<Control> controles = 
					controlService.findAll();
			model.addAttribute("contr", controles);
			
			List<Destino> destinos = 
					destinoService.findAll();
			model.addAttribute("dest", destinos);
			
			List<Genero> generos = 
					generoService.findAll();
			model.addAttribute("gener", generos);
			
			List<Habitacion> habitaciones = 
					habitacionService.findAll();
			model.addAttribute("habitac", habitaciones);
			
			List<Hotel> hoteles = 
					hotelService.findAll();
			model.addAttribute("hot", hoteles);
			
			List<Moneda> monedas = 
					monedaService.findAll();
			model.addAttribute("moned", monedas);
			
			List<Nacionalidad> nacionalidades = 
					nacionalidadService.findAll();
			model.addAttribute("nacionalid", nacionalidades);
			
			List<Origen> origenes = 
					origenService.findAll();
			model.addAttribute("orig", origenes);
			
			List<Pago> pagos = 
					pagoService.findAll();
			model.addAttribute("pag", pagos);
			
			List<Seguro> seguros = 
					seguroService.findAll();
			model.addAttribute("segur", seguros);
			
			List<Tipohabitacion> tipohabitaciones = 
					tipohabitacionService.findAll();
			model.addAttribute("tipohabit", tipohabitaciones);
			
			List<Tipohotel> tipohoteles = 
					tipohotelService.findAll();
			model.addAttribute("tipohot", tipohoteles);
			
			List<Tipopasajero> tipopasajeros = 
					tipopasajeroService.findAll();
			model.addAttribute("tipopasaj", tipopasajeros);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/pasajero/vuelo";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("pasajero") Pasajero pasajero, 
			Model model, SessionStatus status) {
		try {
			pasajeroService.save(pasajero);
			status.setComplete();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/pasajero";
	}
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") int id, Model model) {
		try {
			Optional<Pasajero> optional = pasajeroService.findById(id);
			if (optional.isPresent()) {
				
				List<Cabina> cabinas = 
						cabinaService.findAll();
				model.addAttribute("cabin", cabinas);
				
				List<Control> controles = 
						controlService.findAll();
				model.addAttribute("contr", controles);
				
				List<Destino> destinos = 
						destinoService.findAll();
				model.addAttribute("dest", destinos);
				
				List<Genero> generos = 
						generoService.findAll();
				model.addAttribute("gener", generos);
				
				List<Habitacion> habitaciones = 
						habitacionService.findAll();
				model.addAttribute("habitac", habitaciones);
				
				List<Hotel> hoteles = 
						hotelService.findAll();
				model.addAttribute("hot", hoteles);
				
				List<Moneda> monedas = 
						monedaService.findAll();
				model.addAttribute("moned", monedas);
				
				List<Nacionalidad> nacionalidades = 
						nacionalidadService.findAll();
				model.addAttribute("nacionalid", nacionalidades);
				
				List<Origen> origenes = 
						origenService.findAll();
				model.addAttribute("orig", origenes);
				
				List<Pago> pagos = 
						pagoService.findAll();
				model.addAttribute("pag", pagos);
				
				List<Seguro> seguros = 
						seguroService.findAll();
				model.addAttribute("segur", seguros);
				
				List<Tipohabitacion> tipohabitaciones = 
						tipohabitacionService.findAll();
				model.addAttribute("tipohabit", tipohabitaciones);
				
				List<Tipohotel> tipohoteles = 
						tipohotelService.findAll();
				model.addAttribute("tipohot", tipohoteles);
				
				List<Tipopasajero> tipopasajeros = 
						tipopasajeroService.findAll();
				model.addAttribute("tipopasaj", tipopasajeros);
				
				model.addAttribute("pasajero", optional.get());
			} else {
				return "redirect:/pasajero";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "/pasajero/edit";
	}
	
	@GetMapping("/del/{id}")
	public String eliminar(@PathVariable("id") int id, Model model) {
		try {
			Optional<Pasajero> pasajero = pasajeroService.findById(id);
			if(pasajero.isPresent()) {
				pasajeroService.deleteById(id);
			}
		} catch (Exception e) {
			
			model.addAttribute("dangerDel", "ERROR - Violación contra el principio de Integridad referencia");
			try {
				List<Pasajero> pasajeros = pasajeroService.findAll();
				model.addAttribute("pasajeros", pasajeros);
			} catch (Exception e2) {
				// TODO: handle exception
			} 
			return "/pasajero/inicio";
		}
		return "redirect:/pasajero";
	}
	
	@GetMapping("/paquete")
	public String empaquetado(Model model) {
		try {
			List<Paquete> paquetes = paqueteService.findAll();
			model.addAttribute("paquetes", paquetes);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/pasajero/paquete";
	}
	
	@PostMapping("/savepaquete")
	public String savePaquete(@ModelAttribute("paquete") Paquete paquete, 
			Model model, SessionStatus status) {
		try {
			paqueteService.save(paquete);
			status.setComplete();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/pasajero/paquete";
	}
	@GetMapping("/nuevopaquete")
	public String nuevoPaquete(Model model) {
		Paquete paquete = new Paquete();
		model.addAttribute("paquete", paquete);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/pasajero/nuevopaquete";
	}
}
