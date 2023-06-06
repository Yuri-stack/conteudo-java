package extras;

public class TriAtleta extends Pessoa implements Atleta{
	
	public TriAtleta(String nome) {
		super(nome);
	}
	
	@Override
    public void aquecer() {
        System.out.println("\nAquecendo...");
    }

    @Override
    public void pedalar() {
        System.out.println("\nPedalando..."); 
    }

    @Override
    public void correr() {
        System.out.println("\nCorrendo...");  
    }

    @Override
    public void nadar() {
        System.out.println("\nNadando...");
    }
    
    public void falar() {
    	System.out.println("Hello World");
    }
}
