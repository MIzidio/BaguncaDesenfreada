package geometria;

public class Retangulo extends Poligono {
	
	public Retangulo(float altura, float largura) {
		super(new float[] {altura, largura, altura, largura});
		setTipo("Retangulo");
	}

	@Override
	public float calcularArea() {
		return lados[0] * lados[1];
	}
	
}
