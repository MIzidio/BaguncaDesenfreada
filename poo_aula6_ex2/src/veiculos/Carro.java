package veiculos;

public class Carro extends Veiculo {
	
	private int numPortas;
	
	public Carro(String modelo, int ano, float precoTabelaFipe, String placa, int numPortas) {
		super("Carro", modelo, placa, ano, precoTabelaFipe);
		setNumPortas(numPortas);
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	@Override
	public float calculaIpva() {
		return calculaIpva(0.03f);
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nPortas: "+getNumPortas()+"\n";
	}
	

}
