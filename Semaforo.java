import java.util.ArrayList;
import java.util.Random;

public class Semaforo {

	ArrayList<Cliente> fila = new ArrayList<>();
	boolean randomiza = false;
	int vezes = 0;
	int contador = 0;
	
	public void executar() {
		
		Barbeiro b = new Barbeiro();
		Cliente cliente;
		
		for(;;) {
			b.executa();
			
			if(b.getCliente() == null && fila.size() >= 1) {
				b.setCliente(fila.get(0));				
				fila.remove(0);
			}
			
			if(fila.size() < 3) {
				if(!randomiza) {
					   Random rand = new Random();
				       vezes = rand.nextInt((4 - 1) + 1) + 1;
				       randomiza = true;
				}
				
				contador++;
				if(contador >= vezes) {
					randomiza = false;
					contador = 0;
					cliente = new Cliente();
					fila.add(cliente);
				}
			}
				
			// Limpar tela
			for (int i = 0; i < 25; i++) {
				System.out.println("");
			}
			
			// Interface
			System.out.println("Tamanho da fila: "+fila.size());
			System.out.println("Barbeiro ocupado: "+b.isTrabalhando());
			System.out.print  ("Fila: ");
			for (int i = 0; i < 3; i++) {
				if(i < fila.size())
					System.out.print(" [X] ");
				else
					System.out.print(" [ ] ");
			}
			
		}		
	}
}