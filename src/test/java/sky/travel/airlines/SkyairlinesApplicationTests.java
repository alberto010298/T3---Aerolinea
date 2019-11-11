package sky.travel.airlines;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sky.travel.airlines.model.entity.Control;
import sky.travel.airlines.model.entity.Destino;
import sky.travel.airlines.model.entity.Genero;
import sky.travel.airlines.model.entity.Habitacion;
import sky.travel.airlines.model.entity.Moneda;
import sky.travel.airlines.model.entity.Nacionalidad;
import sky.travel.airlines.model.entity.Origen;
import sky.travel.airlines.model.entity.Pago;
import sky.travel.airlines.model.entity.Recepcionista;
import sky.travel.airlines.model.entity.Relacion;
import sky.travel.airlines.model.entity.Seguro;
import sky.travel.airlines.model.entity.Tipohabitacion;
import sky.travel.airlines.model.entity.Tipohotel;
import sky.travel.airlines.model.entity.Tipopasajero;
import sky.travel.airlines.model.entity.Cabina;
import sky.travel.airlines.model.repository.CabinaRepository;
import sky.travel.airlines.model.repository.ControlRepository;
import sky.travel.airlines.model.repository.DestinoRepository;
import sky.travel.airlines.model.repository.GeneroRepository;
import sky.travel.airlines.model.repository.HabitacionRepository;
import sky.travel.airlines.model.repository.HotelRepository;
import sky.travel.airlines.model.repository.MonedaRepository;
import sky.travel.airlines.model.repository.NacionalidadRepository;
import sky.travel.airlines.model.repository.OrigenRepository;
import sky.travel.airlines.model.repository.PagoRepository;
import sky.travel.airlines.model.repository.PaqueteRepository;
import sky.travel.airlines.model.repository.RecepcionistaRepository;
import sky.travel.airlines.model.repository.RelacionRepository;
import sky.travel.airlines.model.repository.SeguroRepository;
import sky.travel.airlines.model.repository.TipohabitacionRepository;
import sky.travel.airlines.model.repository.TipohotelRepository;
import sky.travel.airlines.model.repository.TipopasajeroRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SkyairlinesApplicationTests {

	@Autowired
	private CabinaRepository cabinarepository;
	@Autowired
	private ControlRepository controlrepository;
	@Autowired
	private DestinoRepository destinorepository;
	@Autowired
	private GeneroRepository generorepository;
	@Autowired
	private HabitacionRepository habitacionrepository;
	@Autowired
	private HotelRepository hotelrepository;
	@Autowired
	private MonedaRepository monedarepository;
	@Autowired
	private NacionalidadRepository nacionalidadrepository;
	@Autowired
	private OrigenRepository origenrepository;
	@Autowired
	private PagoRepository pagorepository;
	@Autowired
	private RecepcionistaRepository recepcionistarepository;
	@Autowired
	private SeguroRepository segurorepository;
	@Autowired
	private TipohabitacionRepository tipohabitacionrepository;
	@Autowired
	private TipohotelRepository tipohotelrepository;
	@Autowired
	private TipopasajeroRepository tipopasajerorepository;
	@Autowired
	private PaqueteRepository paqueterepository;
	@Autowired
	private RelacionRepository relacionrepository;
	
	@Test
	public void contextLoads() {
		
		//cabina
		Cabina economy = new Cabina();
		economy.setId("Cab01");
		economy.setNombre("economy");
		
		Cabina premium = new Cabina();
		premium.setId("Cab02");
		premium.setNombre("premium economy");
		
		Cabina bussiness = new Cabina();
		bussiness.setId("Cab03");
		bussiness.setNombre("premium bussiness");
		
		economy = cabinarepository.save(economy);
		premium = cabinarepository.save(premium);
		bussiness = cabinarepository.save(bussiness);
		
		//control
		Control uno = new Control();
		uno.setId("Cont01");
		uno.setNombre("1 persona");
		
		Control dos = new Control();
		dos.setId("Cont02");
		dos.setNombre("2 personas");
		
		Control tres = new Control();
		tres.setId("Cont03");
		tres.setNombre("3 personas");
		
		uno = controlrepository.save(uno);
		dos = controlrepository.save(dos);
		tres = controlrepository.save(tres);

		//destino
		Destino hongkong = new Destino();
		hongkong.setId("Dest01");
		hongkong.setNombre("Hong Kong, China");
		
		Destino newjersey = new Destino();
		newjersey.setId("Dest02");
		newjersey.setNombre("New Jersey, EEUU");
		
		Destino brasilia = new Destino();
		brasilia.setId("Dest03");
		brasilia.setNombre("Brasilia, Brasil");
		
		Destino ba = new Destino();
		ba.setId("Dest04");
		ba.setNombre("Buenos Aires, Argentina");
		
		hongkong = destinorepository.save(hongkong);
		newjersey = destinorepository.save(newjersey);
		brasilia = destinorepository.save(brasilia);
		ba = destinorepository.save(ba);
		
		//recepcionista
		Recepcionista Jose = new Recepcionista();
		Jose.setId("Recep01");
		Jose.setNombre("Jose");
		Jose.setObservacion("atento");
		Jose.setTelefono("98348543");
		
		Recepcionista Antu = new Recepcionista();
		Antu.setId("Recep02");
		Antu.setNombre("Antu");
		Antu.setObservacion("cordial");
		Antu.setTelefono("98367543");
		
		Recepcionista Luis = new Recepcionista();
		Luis.setId("Recep03");
		Luis.setNombre("Luis");
		Luis.setObservacion("amable");
		Luis.setTelefono("98339543");
		
		Jose = recepcionistarepository.save(Jose);
		Antu = recepcionistarepository.save(Antu);
		Luis = recepcionistarepository.save(Luis);

		//relacion
		Relacion operador = new Relacion();
		operador.setId("Carg01");
		operador.setNombre("operador(a)");
		
		Relacion asesor = new Relacion();
		asesor.setId("Carg02");
		asesor.setNombre("asesor(a)");
		
		Relacion piloto = new Relacion();
		piloto.setId("Carg03");
		piloto.setNombre("piloto");
		
		Relacion aeromoza = new Relacion();
		aeromoza.setId("Carg04");
		aeromoza.setNombre("aeromoza");
		
		Relacion hotelero = new Relacion();
		hotelero.setId("Carg05");
		hotelero.setNombre("hotelero");
		
		Relacion recepcionista = new Relacion();
		recepcionista.setId("Carg06");
		recepcionista.setNombre("recepcionista");
		
		Relacion cliente = new Relacion();
		cliente.setId("Carg07");
		cliente.setNombre("cliente");
		
		operador = relacionrepository.save(operador);
		asesor = relacionrepository.save(asesor);
		piloto = relacionrepository.save(piloto);
		aeromoza = relacionrepository.save(aeromoza);
		hotelero = relacionrepository.save(hotelero);
		recepcionista = relacionrepository.save(recepcionista);
		cliente = relacionrepository.save(cliente);
		
		//origen
		Origen paris = new Origen();
		paris.setId("Ori01");
		paris.setNombre("Paris, Francia");
		
		Origen lima = new Origen();
		lima.setId("Ori02");
		lima.setNombre("Lima, Peru");
		
		paris = origenrepository.save(paris);
		lima = origenrepository.save(lima);
		
		//genero
		Genero m = new Genero();
		m.setId("Gener01");
		m.setNombre("masculino");
		
		Genero f = new Genero();
		f.setId("Gener02");
		f.setNombre("femenino");
		
		m = generorepository.save(m);
		f = generorepository.save(f);
		
		//habitacion
		Habitacion u = new Habitacion();
		u.setId("Habit01");
		u.setNroCamas(1);
		
		Habitacion d = new Habitacion();
		d.setId("Habit02");
		d.setNroCamas(2);
		
		Habitacion t = new Habitacion();
		t.setId("Habit03");
		t.setNroCamas(3);
		
		u = habitacionrepository.save(u);
		d = habitacionrepository.save(d);
		t = habitacionrepository.save(t);

		//moneda
		Moneda soles = new Moneda();
		soles.setId("Mone01");
		soles.setNombre("soles");
		
		Moneda dolar = new Moneda();
		dolar.setId("Mone02");
		dolar.setNombre("dolar");
		
		Moneda euro = new Moneda();
		euro.setId("Mone03");
		euro.setNombre("euro");
		
		soles = monedarepository.save(soles);
		dolar = monedarepository.save(dolar);
		euro = monedarepository.save(euro);

		//nacionalidad
		Nacionalidad peruana = new Nacionalidad();
		peruana.setId("Nacional01");
		peruana.setNombre("peruana");
		
		Nacionalidad argentina = new Nacionalidad();
		argentina.setId("Nacional02");
		argentina.setNombre("argentina");
		
		Nacionalidad española = new Nacionalidad();
		española.setId("Nacional03");
		española.setNombre("española");
		
		Nacionalidad italiana = new Nacionalidad();
		italiana.setId("Nacional04");
		italiana.setNombre("italiana");
		
		peruana = nacionalidadrepository.save(peruana);
		argentina = nacionalidadrepository.save(argentina);
		española = nacionalidadrepository.save(española);
		italiana = nacionalidadrepository.save(italiana);
		
		//pago
		Pago efectivo = new Pago();
		efectivo.setId("Pag01");
		efectivo.setNombre("efectivo");
		
		Pago visa = new Pago();
		visa.setId("Pag02");
		visa.setNombre("visa");
		
		Pago mastercard = new Pago();
		mastercard.setId("Pag03");
		mastercard.setNombre("mastercard");
		
		efectivo = pagorepository.save(efectivo);
		visa = pagorepository.save(visa);
		mastercard = pagorepository.save(mastercard);
		
		//seguro
		Seguro individual = new Seguro();
		individual.setId("Segur01");
		individual.setNombre("individual");
		
		Seguro grupal = new Seguro();
		grupal.setId("Segur02");
		grupal.setNombre("grupal");

		individual = segurorepository.save(individual);
		grupal = segurorepository.save(grupal);
		
		//tipo de habitacion
		Tipohabitacion camain = new Tipohabitacion();
		camain.setId("Tipohab01");
		camain.setNombre("cama individual");
		
		Tipohabitacion matri = new Tipohabitacion();
		matri.setId("Tipohab02");
		matri.setNombre("cama matrimonial");
		
		Tipohabitacion queen = new Tipohabitacion();
		queen.setId("Tipohab03");
		queen.setNombre("cama queen size");
		
		Tipohabitacion king = new Tipohabitacion();
		king.setId("Tipohab04");
		king.setNombre("cama king size");
		
		Tipohabitacion califor = new Tipohabitacion();
		califor.setId("Tipohab05");
		califor.setNombre("cama king california");
		
		camain = tipohabitacionrepository.save(camain);
		matri = tipohabitacionrepository.save(matri);
		queen = tipohabitacionrepository.save(queen);
		king = tipohabitacionrepository.save(king);
		califor = tipohabitacionrepository.save(califor);

		//tipo de hotel
		Tipohotel estre = new Tipohotel();
		estre.setId("Tipoho01");
		estre.setNombre("1 estrella");
		
		Tipohotel es = new Tipohotel();
		es.setId("Tipoho02");
		es.setNombre("2 estrellas");
		
		Tipohotel est = new Tipohotel();
		est.setId("Tipoho03");
		est.setNombre("3 estrellas");
		
		estre = tipohotelrepository.save(estre);
		es = tipohotelrepository.save(es);
		est = tipohotelrepository.save(est);

		//tipo de pasajero
		Tipopasajero adulto = new Tipopasajero();
		adulto.setId("Tipopasaj01");
		adulto.setNombre("adulto(s)");
		
		Tipopasajero niño = new Tipopasajero();
		niño.setId("Tipopasaj02");
		niño.setNombre("adulto y niño");
		
		Tipopasajero bebe = new Tipopasajero();
		bebe.setId("Tipopasaj03");
		bebe.setNombre("adulto y bebe");
		
		Tipopasajero tr = new Tipopasajero();
		tr.setId("Tipopasaj04");
		tr.setNombre("adulto niño y bebe");
		
		adulto = tipopasajerorepository.save(adulto);
		niño = tipopasajerorepository.save(niño);
		bebe = tipopasajerorepository.save(bebe);
		tr = tipopasajerorepository.save(tr);

		
		
	}

}
