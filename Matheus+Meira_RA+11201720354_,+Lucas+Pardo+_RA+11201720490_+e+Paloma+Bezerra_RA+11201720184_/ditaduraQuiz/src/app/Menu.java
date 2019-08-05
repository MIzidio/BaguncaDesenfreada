package app;
import java.util.Scanner;


public class Menu extends Cadastro {
	Scanner sc = new Scanner(System.in);

	private String nome;
	
	public Menu() {
		int opcao;
		System.out.println("--------- Menu ---------");
		System.out.println("1) Login:"
						+ "\n2) Cadastro:"
						+ "\n3) Sair");
		System.out.println("------------------------");
		opcao = sc.nextInt();
		getOpcao(opcao);
			
	}
	//Construtores
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//----------
	
	@Override
	public void getOpcao(int opcao) {		
		//log and play
		if(opcao == 1) {
			System.out.println("Digite seu nome: ");
			setNome( sc.next() );
			System.out.println(getNome());
			if( checaCadastro(getNome())) {
				if(getNome().equals("adm")) {
					System.out.println("Deseja adicionar alguma questão, adm ? Digite 1 para sim e 0 para não");
					int simOuNao = sc.nextInt();
					if(simOuNao == 1) {
						Adm adm = new Adm();
						adm.adicionaQuestao();
					} else {
						App.questions();
					}
				} else {
					App.questions();
				}

			}
			else {
				getOpcao(5);
			}
		}
		//sign up
		else if(opcao == 2) {
			System.out.println("Escolha um nome e logo após o jogo irá iniciar ");
			fazCadastro();
			App.questions();
		}
		//exit
		else if(opcao == 3)
			System.exit(0);
		else {
			System.out.println("Digite uma opção novamente: ");
			opcao = sc.nextInt();
			getOpcao(opcao);
		}
	}
//-------------
	
}
