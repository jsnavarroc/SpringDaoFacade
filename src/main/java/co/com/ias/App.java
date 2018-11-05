package co.com.ias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ias.model.Persona;
import co.com.ias.service.IPersonaService;
import co.com.ias.service.PersonaServiceImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IPersonaService services = (IPersonaService) context.getBean(PersonaServiceImpl.class);
		//services.create(new Persona(2,"Laura","Castillo"));
		//services.update(new Persona(10,"Sebastian","Cano"));
		//Persona x = services.find(10); System.out.println(x.getNombres());
		//services.deleteUpdate(13);
		//services.listAll().forEach(x -> System.out.println(x.getNombres()+"-"+x.getId()));
	}
}
