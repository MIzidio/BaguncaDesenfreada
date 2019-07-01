package geometria;

public class Triangulo extends Poligono {
	
	public Triangulo(float A, float B, float C) {
		super(new float[] {A, B, C});
		setTipo("triangulo");
	}
	
	public float calcularArea() {
		float p = calcularPerimetro()/2.0f;
		
		return (float)Math.sqrt(p*(p-lados[0])*(p-lados[1])*(p-lados[2]));
	}
	
}
