import java.util.Scanner;

public class Treino {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite sua opção para o cobrador [P/C]:");
		String opcao = in.nextLine();
		ICobrador cobrador;
		if(opcao.equals("P")) {
			System.out.println("Digite seu nome:");
			String nome = in.nextLine();
			cobrador = new CobradorPessoa(nome);
		} else {
			cobrador = new CobradorComputador();
		}
		
		System.out.println("Digite sua opção para o goleiro [P/C]:");
		String opcao2 = in.nextLine();
		IGoleiro goleiro;
		if(opcao2.equals("P")) {
			System.out.println("Digite seu nome:");
			String nome = in.nextLine();
			goleiro = new GoleiroPessoa(nome);
		} else {
			goleiro = new GoleiroComputador();
		}
		
		Penalty p = new Penalty(goleiro, cobrador);
		
		int acertosCobrador = 0;
		int defesas = 0;
		
		for (int i = 0; i < 3; i++)
			if (p.cobrar())
				acertosCobrador++;
			else
				defesas++;
			
		System.out.println("[" + ((Jogador) cobrador).getNome() + "] Gols = " + acertosCobrador 
						+ "  [" + ((Jogador) goleiro).getNome() + "] Defesas = " + defesas);
	}

}