package co.com.ias.service;

import java.util.List;

import co.com.ias.model.Persona;

public interface IPersonaService {
	void create(Persona persona);
	void update(Persona persona);
	List <Persona> listAll();
	Persona find(Integer id);
	void delete (Integer id );
	void deleteUpdate(Integer id);

}
