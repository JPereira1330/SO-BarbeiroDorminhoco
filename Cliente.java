public class Cliente {

	private boolean cortando;
	public int id;
	
	public Cliente() {
		cortando = false;
	}
	
	public final boolean isCortando() {
		return cortando;
	}

	public final void setCortando(boolean cortando) {
		this.cortando = cortando;
	}
	
	
}
