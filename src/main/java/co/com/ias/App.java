package co.com.ias;

import co.com.ias.model.Persona;
import co.com.service.IPersonaService;
import co.com.service.PersonaServiceImpl;

public class App {
	public static void main(String[] args) {
		IPersonaService services = new PersonaServiceImpl();
		services.create(new Persona(1,"Johan","Navarro"));
	}
}
