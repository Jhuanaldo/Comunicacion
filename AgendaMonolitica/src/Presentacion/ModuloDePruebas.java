package Presentacion;

import java.util.Scanner;

import Persistencia.Gestor_Agenda_cliente2;
import Persistencia.SocketServidor;

public class ModuloDePruebas {
	public static void main(String[]args){
		//El servidor siempre estará iniciado
		boolean continuar = true;

		Gestor_Agenda_cliente2 gac = new Gestor_Agenda_cliente2();
		

		while(continuar){
			
			System.out.println("Selecciona una operacion");
			Scanner leer = new Scanner(System.in);
			int opcion = leer.nextInt();
			
			switch(opcion){
			case 1:
				boolean encontrado = gac.login("Carmelo", "lascabrasvanalcampo");
				if(encontrado) System.out.println("\tEl usuario existe, log completado");
				else System.out.println("El usuario no existe");
				break;
			case 2:
				boolean registrado = gac.registrar("Otra vez Carmelo", "1234", "ejemplo555@hotmail.com");
				if(registrado) System.out.println("\tEl usuario ha sido registrado con exito");
				else System.out.println("El usuario no ha sido registrado");
				break;
			case 10:
				continuar=false;
				break;
			}
		}
		
		System.out.println("Fin");

	}

}
