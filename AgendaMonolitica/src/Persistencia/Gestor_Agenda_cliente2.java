package Persistencia;

import java.util.ArrayList;

public class Gestor_Agenda_cliente2 {
	
	SocketCliente sc = new SocketCliente();
	
	//Suponiendo que alguien accede a esta opcion en la interfaz grafica (Presentacion)
	public boolean login(String user, String pass){
		
		ArrayList<String> componentes= new ArrayList<String>();
		componentes.add(user);componentes.add(pass);
		boolean encontrado = sc.realizarPeticion(componentes);
		
		return encontrado;
	}
	
	public boolean registrar(String user, String pass, String email){
		
		ArrayList<String> componentes= new ArrayList<String>();
		componentes.add(user);componentes.add(pass); componentes.add(email);
		boolean encontrado = sc.realizarPeticion(componentes);
		
		return encontrado;
	}
	
	public ArrayList<ArrayList<String>> mostrarContactos(){


		return null;
	}
	public boolean anadirContacto(String nombre, String apellidos, int tlfn, String email){


		return false;
	}
	public ArrayList<String> buscarContacto(String nombre){

		return null;
	}
	public boolean modificarNombre(String nombre, int telefono){


		return false;
	}
	public boolean modificarApellisdos(String apellidos, int telefono){


		return false;
	}
	public boolean modificarTelefono(int tlfn, int telefono){


		return false;
	}
	public boolean modificarEmail(String email, int telefono){


		return false;
	}
	public boolean eliminarContacto(String nombre, String apellidos, int tlfn, String email){


		return false;

	}
}
