public class Barbeiro{

	private boolean trabalhando;
	private Cliente cliente;
	
	// 
	private int tempoCorte = 500; 		// Tempo para cada corte
	private int contInterno = 0;
	
	public Barbeiro(){
		trabalhando = false;
	}
	
	public void executa() {
		
		if(contInterno < 2) {
			
			try {
				trabalhando = true;
				Thread.sleep(tempoCorte);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			contInterno++;
		}else if(contInterno == 2) {
			trabalhando = false;
			cliente = null;
			contInterno = 0;
		}
	}
	
	public final boolean isTrabalhando() {
		return trabalhando;
	}
	public final void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	public final Cliente getCliente() {
		return cliente;
	}

	public final void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	
}
