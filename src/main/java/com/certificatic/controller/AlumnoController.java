package com.certificatic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.certificatic.model.Alumno;

@Named
@RequestScoped
public class AlumnoController {

	private Alumno alumno;
	
	
	private static List<Alumno> alumnos = new ArrayList<>();
	
	public AlumnoController() {
		alumno = new Alumno();
	}
	
	
	public void guardar() {
		System.out.println("Alumno: " + alumno);
		alumnos.add(alumno);
		
		alumno = new Alumno();	
	}
	
	public void eliminarAlumno(Alumno alumno) {
		System.out.println("::: A eliminar " + alumno);
		alumnos.remove(alumno);
		
		System.out.println("::: Eliminado");
		
	}
	
	


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}


	public List<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	

	

}
