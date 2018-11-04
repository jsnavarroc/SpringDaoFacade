package co.com.service;

import java.util.List;

import co.com.ias.dao.IPersonaDao;
import co.com.ias.dao.PersonaDaoImpl;
import co.com.ias.model.Persona;

public class PersonaServiceImpl implements IPersonaService {

	private IPersonaDao dao;

	
	public PersonaServiceImpl() {
		dao = new PersonaDaoImpl();
	}

	@Override
	public void create(Persona persona) {
		dao.create(persona);
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
