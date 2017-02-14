/** 
 * clase Alumno Qué tiene los siguientes atributos y métodos:
Nombre
Apellidos
Edad
Un constructor que inicialice dichos atributos.
Los correspondientes getters
Sobreescribe el método toString() para que retorno un String con el siguiente
formato:
APELLIDOS: apellidos alumno ::: NOMBRE: nombre alumno ::: EDAD: edad alumno

 */

/**
 * @author angelmillan@me.com
 * @versio 1.0
 */

public class Alumno {

	private String nombre;
	private String apellido;
	private int edad;

	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Alumno(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return el apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @return la edad
	 */
	public int getEdad() {
		return edad;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

}
