package app;

import java.util.Scanner;
import app.Adm;

public abstract class Cadastro implements InterfaceCadastro {
	
	private String logIn = "0";

	//Encapsulamentos(get/set)
	public String getLogIn() {
		return logIn;
	}
	public void setLogIn(String logIn) {
		this.logIn = logIn;
	}
	
	
	//------Metodos------
	//checa se o cadastro existe
	@Override
	public boolean checaCadastro(String logIn) {
		if( (!getLogIn().isEmpty() && logIn == getLogIn()) || logIn.equals("adm")) {
			return true;
		}
		return false;
	}

	//faz Cadastro de usuario
	@Override
	public void fazCadastro() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome:");		
		String logIn = sc.next();
		
		if( !logIn.isEmpty() && !logIn.equals("adm") ) {
		//cria acc
			setLogIn(logIn);
		} else if(logIn.equals("adm")) {
			System.out.println("adm é um usuário especial e não pode ser criado, tente novamente: ");
			fazCadastro();
		} else {
			System.out.println("Login inválido, tente novamente");
			fazCadastro();
		}
	}
	
}

