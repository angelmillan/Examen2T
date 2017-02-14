import java.util.Scanner;

//importa las bibliotecas que creas necesaria.
public class Curso {

	public static void main(String[] arg) {
		Alumno alumno1 = new Alumno("joaquinto", "pocas luces", 13);
		Alumno alumno2 = new Alumno("alvaro", "elistillo de clase", 15);
		Alumno alumno3 = new Alumno("antonio", "pedante sabelotodo", 43);
		Alumno alumno4 = new Alumno("beatriz", "aprueba todo", 23);
		Alumno alumno5 = new Alumno("carmen", "brillante brillante", 17);
		Profesor profesor1 = new Profesor("augusto", "mecargotodo", true);
		Profesor profesor2 = new Profesor("pedrito", "machacón", false);

		// crea un objeto de tipo modulo

		Modulo modulo = new Modulo("programación", 4);

		// añade los alumnos y los profesores

		modulo.setListaProfesores(profesor1,profesor2);
		modulo.setListaDeAlumnos(alumno1);
		modulo.setListaDeAlumnos(alumno2);
		modulo.setListaDeAlumnos(alumno3);
		modulo.setListaDeAlumnos(alumno4);
		modulo.setListaDeAlumnos(alumno5);

		// lee desde la clase scanner el nombre del módulo
		// y las horas del mismo, dichas horas deben estar comprendidas entre
		// 3 a 8
		// usa una expresión regular para controlar el dato introducido
		// tanto para que sea un entero y esté en ese rango de valor
		// igual con el nombre del módulo, deben ser solo letras
		// NO puede lanzarse una excepción por introducir un valor no entero
		// en el caso que la cantidad introducida no corresponda al rango
		// anterior
		// o no sea una cadena de letras el nombre del módulo
		// se establecerá 6 horas en caso de una lectura errónea
		// y DEFAULT como nombre del ciclo en caso incorrecto
		
		// he decicido volver a intertar la entrada en vez de poner valores por defecto
		
		
		Scanner in = new Scanner(System.in);
		boolean correcto = false;
		String nombreModulo = "";
		String horasModulo = "";
		while (correcto == false){
			System.out.println("Introduce nombre del módulo");
			nombreModulo = in.next();
			if (nombreModulo.matches("[A-Za-záéíóúüÁÉÍÓÚÜ]+"))
			correcto=true;
			else
			System.out.println("Nombre incorrecto, vuelve a intentarlo");
		}
		
		correcto = false;
		
		while (correcto == false){
			System.out.println("Introduce horas del módulo Mínimo 3 - Máximo 8");
			horasModulo = in.next();
			if (horasModulo.matches("[3-8]"))
			correcto=true;
			else
			System.out.println("Horas incorrectas, vuelve a intentarlo");
		}
		in.close();
		
		modulo.setNombre(nombreModulo);
		modulo.setHorasDuracion(Integer.parseInt(horasModulo));
		System.out.println("Modulo = " + modulo.getNombre() + "\n" + "Horas de duracion = " + modulo.getHorasDuracion() + " horas");
		System.out.println("\nAlumnos del modulo: ");
		modulo.getListaDeAlumnos();
		System.out.println("\nProfesores del modulo:");
		modulo.getListaProfesores();
		System.out.println("\nAlumnos Menores de edad:");
		modulo.getAlumnosMenoresDeEdad();
		
		// imprime la referencia del módulo
		// imprime la lista de alumnos
		// imprime la lista alumnes menores de edad
		// imprime la lista de profesores

	}
}
