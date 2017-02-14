/**
 * clase Profesor Qué tiene los siguientes atributos y métodos:
Nombre
Primer apellido.
Si es profesor es definitivo o sustituto.
Un constructor que inicialice dichos atributos.
Los correspondientes getters
Sobreescribe el método toString() para que retorno un String con el siguiente
formato:
APELLIDO: apellido profesor ::: NOMBRE: nombre profesor ::: DEFINITIVO
(true o false)
 * 
 */

/**
 * @author matinal
 *
 */
public class Profesor {
	private String nombre;
	private String primerApellido;
	private boolean definitivo;

	/**
	 * @param nombre
	 *            es un String
	 * @param primerApellido
	 *            es un String
	 * @param sustituto
	 *            es un boolean
	 */
	public Profesor(String nombre, String primerApellido, boolean definitivo) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.definitivo = definitivo;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return el primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @return el boolean sustituto true para sustituto fañse para fijo
	 */
	public boolean definitivo() {
		return definitivo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", primerApellido=" + primerApellido + ", definitivo=" + definitivo + "]";
	}

}
