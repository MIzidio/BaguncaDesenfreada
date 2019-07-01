package funcionarios;

public class Horista extends Funcionario{

	float valorHora, totalHoras;
	

	public Horista(String nome, String cpf, String setor) {
		super(nome, cpf, setor);
	}
	
	@Override
	public float calculaSalarioMensal(){
		return 0;
	}
	
	public float getTotalHoras(){
		return totalHoras;
	}
	
	public void setTotalHoras(float totalHoras){
		this.totalHoras = totalHoras;
	}
	
	public float getValorHora(){
		return this.valorHora;
	}
	
	public void setValorHora(float totalValor){
		this.valorHora = totalValor;
	}
	
}
