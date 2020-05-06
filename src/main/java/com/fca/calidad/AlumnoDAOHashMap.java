package com.fca.calidad;
import java.util.HashMap; // import the HashMap class

public class AlumnoDAOHashMap implements AlumnoDAO{

	private HashMap<String,Alumno> dbAlumnos = new HashMap<String, Alumno>();
	
	AlumnoDAOHashMap()
	{
		dbAlumnos = new HashMap<String, Alumno>();
	}

	public void addAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		dbAlumnos.put(alumno.getId(), alumno);
	}

	public void removeAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		dbAlumnos.remove(alumno.getId());
	}

	public void updateAlumnoPromedio(Alumno alumno, Float promedio) {
		// TODO Auto-generated method stub
		Alumno a = dbAlumnos.get(alumno.getId());
		a.setAverage(promedio);
		dbAlumnos.put(alumno.getId(), a);
	}

	public String getAlumnoName(String id) {
		// TODO Auto-generated method stub
		String result = "";
		if (dbAlumnos.get(id) != null)
			result = dbAlumnos.get(id).getName() + " " + dbAlumnos.get(id).getLastName();
		return result;
	}

	public HashMap<String, Alumno> getAllAlumno() {
		// TODO Auto-generated method stub
		return dbAlumnos;
	}

	public Alumno getAlumno(String id)
	{
		return dbAlumnos.get(id);
	}

	

	
	
}
