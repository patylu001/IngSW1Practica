package com.fca.calidad;

import java.util.HashMap;

public interface AlumnoDAO {
	public void addAlumno(Alumno alumno);
	public void removeAlumno(Alumno alumno);
	public void updateAlumnoPromedio(Alumno alumno, Float promedio);
	public String getAlumnoName(String id);
	public HashMap<String, Alumno> getAllAlumno();
	
}