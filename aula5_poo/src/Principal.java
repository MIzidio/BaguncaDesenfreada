import funcionarios.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario[] funcionarios = new Funcionario[5];
		
		funcionarios[0] = new Efetivo("Fulano", "99999999","Vendas");
		((Efetivo)funcionarios[0]).setSalario(9000);
		((Efetivo)funcionarios[0]).setHorasExtras(10);
		
		funcionarios[1] = new Horista("Fulano2", "88888888","Atendente");
		((Horista)funcionarios[1]).setTotalHoras(170);
		((Horista)funcionarios[1]).setValorHora(10);
		
		Efetivo e2 = new Efetivo("Jose", "777777777", "Vendas");
		e2.setSalario(8000);
		e2.setHorasExtras(30);
		funcionarios[2] = e2;
		
		for(Funcionario f: funcionarios) {
			System.out.println(f);
		}
		
	}

}
