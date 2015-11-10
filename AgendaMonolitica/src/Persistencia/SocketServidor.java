package Persistencia;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SocketServidor {
	private static ServerSocket servidor;
	private static Socket clienteNuevo;
	
	public static void main(String[]args){
		try {
//			while(true){
				servidor = new ServerSocket(4500);
				clienteNuevo = servidor.accept();
				System.out.println("\nSocket establecido...");
				
				//Recibir
				ObjectInputStream entrada = new ObjectInputStream(clienteNuevo.getInputStream());
				ArrayList<String> msg_server = (ArrayList<String>)entrada.readObject();
				
				System.out.print("El cliente pide ");
				for(int i=0;i<msg_server.size();i++){
					System.out.print(">>"+msg_server.get(i)+"<<  ");
				}

				//Enviar
				ObjectOutputStream resp = new ObjectOutputStream(clienteNuevo.getOutputStream());
				resp.writeObject(true);
				clienteNuevo.close();
//			}

		} catch (IOException e) {
			System.err.println("Server Error: " + e.getMessage());
			System.err.println("Localized: " + e.getLocalizedMessage());
			System.err.println("Stack Trace: " + e.getStackTrace());
			System.err.println("To String: " + e.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close(){
		try {
			clienteNuevo.close();
			servidor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
