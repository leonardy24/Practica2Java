package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.entidad.*;


public class ConsolaBanco {

	

	public static void main(String[] args) {
		
		HashMap<Integer, Gestor> listasGestores = new HashMap<>();
		
		HashMap<Integer, Cliente > listasClientes  = new HashMap<>();

	
	
		
				Scanner keyboard = new Scanner(System.in);
				
				Gestor g1 = null;
				Cliente c1 = null;
				
				int menuSeleccionado = -1;

				
				do {
					System.out.println("1. Crear Gestor");
					System.out.println("2. Ver estudiante");
					System.out.println("3. Agregar nota");
					System.out.println("4. Reiniciar notas");
					System.out.println("5. Mostrar notas");
					System.out.println("0. Salir\n");
					System.out.print("Opción: ");
					menuSeleccionado = keyboard.nextInt();

					switch (menuSeleccionado) {
					// sali
					case 0:
						System.out.println("Saliendo...");
						break;
					// crear un nuevo estudiante pidiendo los datos por teclado
					case 1:
						System.out.println("Crear estudiante");
						Gestor c1 = new gestor();
						System.out.print("Id del estudiante: ");
						int nuevoId = keyboard.nextInt();
						estudiante.setId(nuevoId);
						System.out.print("Edad del estudiante: ");
						int nuevaEdad = keyboard.nextInt();
						estudiante.setEdad(nuevaEdad);
						System.out.print("Teléfono del estudiante: ");
						String nuevoTelefono = keyboard.next();
						estudiante.setTelefono(nuevoTelefono);
						System.out.println("Estudiante creado con id: " + estudiante.getId());
						break;
					// mostrar info si estudiante es distinto de null
					case 2:
						if (estudiante != null) {
							System.out.println("Info del estudiante:");
							estudiante.mostrarInfo();
						} else {
							System.out.println("Todavía no hay estudiantes");
						}
						break;
					// añadir nota si estudiante es distinto de null
					case 3:
						System.out.print("Añadir nota: ");
						if (estudiante != null) {
							float nuevaNota = keyboard.nextFloat();
							estudiante.agregarNuevaNota(nuevaNota);
							System.out.println("Añadida nota");
						} else {
							System.out.println("Todavía no hay estudiantes");
						}
						break;
					// reiniciar notas si estudiante es distinto de null
					case 4:
						System.out.println("Reiniciar notas");
						if (estudiante != null) {
							estudiante.reiniciarNotas();
							System.out.println("Notas del estudiante reiniciadas...");
						} else {
							System.out.println("Todavía no hay estudiantes");
						}
						break;
					// mostrar lista de notas si estudiante es distinto de null (no estaba en los
					// ejercicios propuestos)
					case 5:
						if (estudiante != null) {
							estudiante.mostrarNotas();
						}
						break;
					default:
						System.out.println("Opción desconocida...");
						break;
					}

				} while (menuSeleccionado != 0);
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
