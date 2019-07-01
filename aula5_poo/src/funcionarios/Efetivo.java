package funcionarios;

public class Efetivo extends Funcionario {
	
	float salario;
	float horasExtras = 0;
	
	public Efetivo(String nome, String cpf, String setor){
		super(nome,cpf,setor);
	}
	
	@Override
	public float calculaSalarioMensal() {
		return salario + horasExtras*salario/160*1.5f;
	}
	
	public float getSalario(){
		return salario;
	}
	
	public void setSalario(float salario){
		this.salario = salario;
	}	
	
	public float getHorasExtras(){
		return horasExtras;
	}	
	
	public void setHorasExtras(float horasExtras){
		this.horasExtras = horasExtras;
	}	
}
