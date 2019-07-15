package veiculos;

import java.time.Year;

public abstract class Veiculo implements Pagamento {

	private String tipo, modelo, placa;
	private int ano;
	private float precoTabelaFipe;
	
	public Veiculo(String tipo, String modelo, String placa, int ano, float precoTabelaFipe) {
		setTipo(tipo);
		setModelo(modelo);
		setAno(ano);
		setPlaca(placa);
		setPrecoTabelaFipe(precoTabelaFipe);
	}
	
	@Override
	public String toString() {
		return "T: "+getTipo()+"\nM: "+getModelo()+"\nA: "+getAno()+"\nP: "+getPlaca()+"\nPreço: "+getPrecoTabelaFipe();
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getPrecoTabelaFipe() {
		return precoTabelaFipe;
	}

	public void setPrecoTabelaFipe(float precoTabelaFipe) {
		this.precoTabelaFipe = precoTabelaFipe;
	}
	
	protected float calculaIpva(float aliquota) {
		if(Year.now().getValue()-getAno() > 20)
			return 0.0f;
		else
			return getPrecoTabelaFipe()*aliquota;
	}
	
}
