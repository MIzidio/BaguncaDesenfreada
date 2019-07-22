package aulas;

public abstract class Avaliacao extends Aula {

	private static int numAvaliacao = 1;
	private double peso;
	
	public Avaliacao(double peso) {
		super("Avaliacao " + numAvaliacao++);	
		this.peso = peso;
	}
	
	public Avaliacao() {
		this(0.5);
	}
	
	public double getPeso() {
		return peso;
	}

	@Override
	public String getTipo() {
		return "Avaliacao";
	}
	
}