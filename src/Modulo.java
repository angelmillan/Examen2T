import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**clase Módulo Qué tiene los siguientes atributos y métodos:
Nombre.
Horas de duración.
Un array para dos profesores que imparten el módulo.
Una colección de alumnos (objetos)

Un constructor que inicialice con el nombre y horas de duración como paráme-
tros.
Los correspondientes getters

Un método que devuelva una colección de alumnos menores de edad.
setters, uno para establecer a los alumnos matriculados y otro para establecer
los profesores. Para el caso de profesores, dicho método debe añadir a dos
profesores, por lo que los argumentos serán dos objetos de tipo Profesor.Sobreescribe el método toString() para que retorno un String con el siguiente
formato:
ALUMNOS:
lista de alumnos
PROFESORES:
lista de profesores
NOMBRE DEL MÓDULO
nombre mdulo
HORAS horas mdulo
 * 
 */

/**
 * @author matinal
 *
 */
public class Modulo {
	private String nombre;
	private int horasDuracion;
	private Profesor[] listaProfesores = new Profesor[2];
	private List<Alumno> listaDeAlumnos = new ArrayList<Alumno>();

	public Modulo(String nombre, int horasDuracion) {
		this.nombre = nombre;
		this.horasDuracion = horasDuracion;

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param horasDuracion el horasDuracion a establecer
	 */
	public void setHorasDuracion(int horasDuracion) {
		this.horasDuracion = horasDuracion;
	}

	/**
	 * @return the horasDuracion
	 */
	public int getHorasDuracion() {
		return horasDuracion;
	}

	/**
	 * @return the listaProfesores
	 */
	public void getListaProfesores() {
		System.out.println(listaProfesores[0]);
		System.out.println(listaProfesores[1]);
		return;
	}

	/**
	 * @param listaProfesores
	 *            the listaProfesores to set
	 */
	public void setListaProfesores(Profesor profesor1, Profesor profesor2) {
		this.listaProfesores[0] = profesor1;
		this.listaProfesores[1] = profesor2;
		
	}

	/**
	 * @param listaDeAlumnos
	 *            the listaDeAlumnos to set
	 */
	public void setListaDeAlumnos(Alumno alumno) {
		this.listaDeAlumnos.add(alumno);
	}
	
	/**
	 * @return el listaDeAlumnos
	 */
	public void getListaDeAlumnos() {
		for (Alumno alumno : listaDeAlumnos) 
			System.out.println(alumno);
		return;
	}

	public void getAlumnosMenoresDeEdad() {
		for (Alumno alumno : listaDeAlumnos) 
			if (alumno.getEdad() < 18) 
				System.out.println(alumno);
		return ;
	 }

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Modulo nombre= " + nombre + "\n" + "horasDuracion= " + horasDuracion + "\n"
				+ "listaProfesores=" + "\n" + Arrays.toString(listaProfesores) + "\n" + "listaDeAlumnos=" + "\n"
				+ listaDeAlumnos + "]";
	}

	/**
	 * 
	 */

}
