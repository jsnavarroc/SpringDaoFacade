package co.com.ias.dao;

import java.util.List;

import co.com.ias.model.Persona;

public class PersonaDaoImpl implements IPersonaDao {

	@Override
	public void create(Persona persona) {
		System.out.println("--Persona Creada--");
		System.out.println(persona.getId());
		System.out.println(persona.getNombres());
		System.out.println(persona.getApellidos());
	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Persona> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}
