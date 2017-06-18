
public class Contador extends Thread {
	private Armazem valor;
	
	

	@Override
	public String toString() {
		return ""+valor+"";
	}

	public Contador(Armazem valor) {
		super();
		this.valor = valor;
	}

	public void run(){
		for (int i = 0; i < 100; i++) {
            valor.set(i);
        }
	}
}
