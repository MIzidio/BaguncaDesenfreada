
public class CaixaAtendimento {
	
	private int identificador, senha = 1;
	
	public CaixaAtendimento(int identificador) {
		this.identificador = identificador;
	}
	
	public void chamaProximoFila() {
		System.out.println("Senha " + senha + " Caixa: " + identificador );
		senha++;
	}
}
