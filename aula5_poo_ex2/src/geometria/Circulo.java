package geometria;

public class Circulo extends FiguraPlana {
	
	private float raio;
	private static final float pi = 3.1415f;
	
	
	public Circulo(float raio) {
		setTipo("Circulo");
		this.raio = raio;
	}
	
	@Override
	public float calcularArea() {
		return pi*raio*raio;
	}
	
	@Override
	public float calcularPerimetro() {
		return pi*raio*2.0f;
	}
	
	
	
}
