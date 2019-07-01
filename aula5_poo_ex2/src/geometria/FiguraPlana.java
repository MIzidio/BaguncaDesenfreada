package geometria;

public class FiguraPlana {
	
	private String tipo;
	
	public FiguraPlana() {
		setTipo("Figura plana desconhecida");
	}
	
	public float calcularArea() {
		return 0.0f;
	}
	
	public float calcularPerimetro() {
		return 0.0f;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return  "Tipo: " + getTipo() + "\n" +
				"CPF: " + "" + "\n" +
				"Setor: " + "" + "\n" +
				"Salário Mensal: R$" + String.format("%.2f") + "\n";
	}
}
