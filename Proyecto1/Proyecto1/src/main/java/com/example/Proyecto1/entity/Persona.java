package com.example.Proyecto1.entity;

import java.sql.Date;
import java.sql.Time;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Proyecto1.repository.OrganizaciónRepository;


public class Persona {
	private String nombre;
	private String apellido;
	public String nombreEvento;
	
	@RequestMapping(value= "/db_proyecto1/{id}", method = RequestMethod.GET)
	public Organización getEventoPorId(@PathVariable ("id") Integer id){ return OrganizaciónRepository.findById(id).get();}
	
	public String nombreOrganización;
	private Date fecha;
	private Time hora;
	private Boolean activo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombreEvento() {
		return nombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	public String getNombreOrganización() {
		return nombreOrganización;
	}
	public void setNombreOrganización(String nombreOrganización) {
		this.nombreOrganización = nombreOrganización;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
	

}
	public class Turno {
	 public Time hora;
	 public Date fecha;
	 public Boolean activo;
	 
	 
}
