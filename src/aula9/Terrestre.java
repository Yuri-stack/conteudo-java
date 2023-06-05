package aula9;

public class Terrestre extends Transporte {
	private int numeroRodas;
	protected float velocidade;

	public Terrestre(int capacidade, int numeroRodas, float velocidade) {
		super(capacidade);
		// Transporte.capacidade;
		this.numeroRodas = numeroRodas;
		this.velocidade = velocidade;
	}
	
	public Terrestre() {
		super();
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		// Transporte.visualizar();
		System.out.println("Número de rodas: " + this.numeroRodas);
		System.out.println("Velocidade: " + this.velocidade + "Km");
	}
	
}
