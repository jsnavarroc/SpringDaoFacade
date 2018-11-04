package co.com.ias.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ias.model.Persona;

@Repository
public class PersonaDaoImpl implements IPersonaDao {
	@Autowired
	private DataSource dataSource;

	@Override
	public void create(Persona persona) {
		String sql = "INSERT INTO PERSONA (NOMBRES, APELLIDOS) VALUES (?, ?)";

		try (Connection cx = dataSource.getConnection()) {
			PreparedStatement ps = cx.prepareStatement(sql);
			ps.setString(1, persona.getNombres());
			ps.setString(2, persona.getApellidos());
			ps.executeUpdate();
			ps.close();
			System.out.println("--Persona Creada--");
			System.out.println(persona.getId());
			System.out.println(persona.getNombres());
			System.out.println(persona.getApellidos());
		} catch (Exception e) {
			throw new RuntimeException(e+"\n ##Falla en la conccion##");
		}


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
