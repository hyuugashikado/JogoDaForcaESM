package jogodaForcaESM;
import java.io.IOException;
import java.util.ArrayList;

import servidor.*;
public class JogoDaForcaESM {

	private ArrayList <Jogador> jogadores = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		Servidor server = new Servidor();
		ArrayList <Jogador> jogadores = new ArrayList<>();
		
	}
	
	public void jogadorEntrou (Jogador j){
		jogadores.add(j);
	}

}
