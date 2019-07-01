package funcionarios;

public class Funcionario {

	String nome, cpf, setor;
	float salarioFixo = 1000;
	
	
	public float calculaSalarioMensal(){
		return 0.0f;
	}
	
	public Funcionario(String nome, String cpf, String setor){
		setNome(nome);
		setCPF(cpf);
		setSetor(setor);
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCPF(){
		return cpf;
	}
	
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	
	public String getSetor(){
		return setor;
	}
	
	public void setSetor(String setor){
		this.setor = setor;
	}
	
	public String toString(){
		return "Nome: " + getNome() + "\n" +
				"CPF: " + getCPF() + "\n" +
				"Setor: " + getSetor() + "\n" +
				"Salário Mensal: R$" + String.format("%.2f", calculaSalarioMensal()) + "\n";
	}

}
