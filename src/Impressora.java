
public class Impressora extends Thread{
	private Armazem valor;
	



	@Override
	public String toString() {
		return ""+valor+"";
	}

	public Impressora(Armazem valor) {
		super();
		this.valor = valor;
	}

	public void run(){
		for (int i = 0; i < 100; i++) {
            valor.get();
            System.out.println("Valor do contador : "+valor);
        }
        
	}
}
