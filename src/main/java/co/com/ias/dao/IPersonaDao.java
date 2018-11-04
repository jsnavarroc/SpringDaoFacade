package co.com.ias.dao;

import java.util.List;

import co.com.ias.model.Persona;

public interface IPersonaDao {
	
	void create(Persona persona);
	void update(Persona persona);
	List <Persona> listAll();
	Persona find(Integer id);
	void delete (Integer id );
	
}
