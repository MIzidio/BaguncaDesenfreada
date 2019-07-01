package geometria;

public class Quadrado extends Retangulo {

	public Quadrado(float lado) {
		super(new float[] {lado, lado, lado, lado});
		setTipo("quadrado");
	}
	
}
