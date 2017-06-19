
public class Exec {

	public static void main(String[] args) {
		 Armazem valorCompartilhado = new Armazem();
		    Contador contador = new Contador(valorCompartilhado);
		   
		    Impressora impressora = new Impressora(valorCompartilhado);
		   
		 
		    contador.start();
		    impressora.start();
		}
}
