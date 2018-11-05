package co.com.ias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ias.dao.IPersonaDao;
import co.com.ias.model.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {
    
	@Autowired
	private IPersonaDao daoPersona;


	@Override
	public void create(Persona persona) {
		daoPersona.create(persona);
	}

	@Override
	public void update(Persona persona) {
		daoPersona.update(persona);
	}

	@Override
	public List<Persona> listAll() {
		return daoPersona.listAll();
	}

	@Override
	public Persona find(Integer id) {
		return daoPersona.find(id);
	}

	@Override
	public void delete(Integer id) {
		daoPersona.delete(id);
	}

}
