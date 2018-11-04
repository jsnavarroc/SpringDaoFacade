package co.com.ias.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import co.com.ias.model.Persona;

@Repository
public class PersonaDaoImpl extends JdbcDaoSupport implements IPersonaDao {

	@Autowired
	public PersonaDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public void create(Persona persona) {
		String sql = "INSERT INTO PERSONA (NOMBRES, APELLIDOS) VALUES (?, ?)";
		getJdbcTemplate().update(sql, new Object[] {persona.getNombres(),persona.getApellidos()});
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
