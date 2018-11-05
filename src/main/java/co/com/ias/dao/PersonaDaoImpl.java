package co.com.ias.dao;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		String sql = "INSERT INTO persona (NOMBRES, APELLIDOS) VALUES (?, ?)";
		getJdbcTemplate().update(sql, new Object[] {persona.getNombres(),persona.getApellidos()});
	}

	@Override
	public void update(Persona persona) {
		String sql = "UPDATE persona SET nombres = ?, apellidos = ? WHERE id = ? ";
		getJdbcTemplate().update(sql, new Object[] {persona.getNombres(),persona.getApellidos(), persona.getId()});
	}

	@Override
	public List<Persona> listAll() {
		String sql = "SELECT id, apellidos, nombres FROM persona ORDER BY nombres, apellidos";
		List <Persona> lista =  getJdbcTemplate().query(sql, new BeanPropertyRowMapper<Persona>(Persona.class));
		return lista;
	}

	@Override
	public Persona find(Integer id) {
		String sql = "SELECT id, apellidos, nombres FROM persona WHERE id = ?";
		Persona persona = getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<Persona> (Persona.class));
		return persona;
	}

	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM persona WHERE id = ?";
		getJdbcTemplate().update(sql, new Object[] {id});
	}

}
