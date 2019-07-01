package geometria;

public class Poligono extends FiguraPlana {
	
	protected float[] lados;
	
	public Poligono(float[] lados) {
		this.lados = new float[lados.length];
		
		int i;
		for(i = 0; i < lados.length; ++i)
			this.lados[i] = lados[i];
		
		setTipo("poligono");
	}
	
	@Override
	public float calcularPerimetro() {
		float perimetro = 0.0f;
		
		int i;
		for(i = 0; i < lados.length; ++i)
			perimetro = perimetro + lados[i];
		
		return perimetro;
	}
	
}
