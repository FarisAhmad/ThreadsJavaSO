
public class Armazem  {
	public int valor;
	private boolean disponivel;
	
	
  

	@Override
	public String toString() {
		return ""+valor+"";
	}

	public synchronized void set(int valor) {
        while (disponivel == true) {
            try {
                
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.valor = valor;
       
        disponivel = true;
        notifyAll();
    }
    
    public synchronized int get() {
        while (disponivel == false) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        disponivel = false;
        notifyAll();
        return this.valor;
    }
	
}
