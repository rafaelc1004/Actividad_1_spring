package cl.instituto.java;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Alumno {
	
	
	@Min(0)
	private int id;
	@Size(min = 3, max = 20)
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Alumno(int id, String nombre, LocalDate fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Alumno() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
