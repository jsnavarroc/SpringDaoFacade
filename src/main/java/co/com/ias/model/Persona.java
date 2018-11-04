package co.com.ias.model;

public class Persona {
	private int id;
	private String Nombres;
	private String Apellidos;
	
	
	public Persona() {
	}


	public Persona(int id, String nombres, String apellidos) {
		this.id = id;
		Nombres = nombres;
		Apellidos = apellidos;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombres() {
		return Nombres;
	}


	public void setNombres(String nombres) {
		Nombres = nombres;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + "]";
	} 
	
	
	
	
}
