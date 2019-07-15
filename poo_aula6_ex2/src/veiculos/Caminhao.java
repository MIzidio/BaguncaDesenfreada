package veiculos;

public class Caminhao extends Veiculo{
	
	private int eixos;
	public float capacidade;

	public Caminhao(String modelo, int ano, float precoTabelaFipe, String placa, int eixos, float capacidade) {
		super("caminhão", modelo, placa, ano, precoTabelaFipe);
		setEixos(eixos);
		setCapacidade(capacidade);
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public float getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public float calculaIpva() {
		return calculaIpva(0.015f);
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nE: "+getEixos()+"\nC: "+getCapacidade()+"\n";
	}

}
