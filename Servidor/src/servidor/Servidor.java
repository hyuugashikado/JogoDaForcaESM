package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.DataInputStream;
import java.io.EOFException;

public class Servidor {
	
	ServerSocket servidor;
	ArrayList <Socket> jogadores = new ArrayList<>();
	ArrayList <DataInputStream> entrada = new ArrayList<>(); 
	
	public Servidor () throws IOException {
		
		servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		Socket novo_jogador;
		DataInputStream nova_entrada;

		novo_jogador = servidor.accept();	
		nova_entrada = new DataInputStream (novo_jogador.getInputStream());
				
		System.out.println("Nova conex�o com o cliente " +   
				novo_jogador.getInetAddress().getHostAddress()
				);
		
		//jogadores.add(novo_jogador);
		//entrada.add(nova_entrada);
		
		try{	
			while (novo_jogador.isConnected()){
				System.out.println(nova_entrada.readUTF());
			}
		}catch (EOFException e){
			System.out.println("Encerrando server");
			novo_jogador.close();
			servidor.close();
		}
		
		//jogadores.get(0).close();
	}
}