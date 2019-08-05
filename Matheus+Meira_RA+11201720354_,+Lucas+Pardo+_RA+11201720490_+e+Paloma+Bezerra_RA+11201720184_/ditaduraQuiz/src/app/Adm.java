package app;
import java.util.Scanner;
public class Adm extends App {
	Scanner sc = new Scanner(System.in);
		public void adicionaQuestao() {
		String pergunta;
		String opcoes;
		String resposta;
		String dificuldade;
		
		
		int i;
		for(i=contadorDePerguntas; i<=questions.length; ++i) {
			if(contadorDePerguntas == 10) {
				System.out.println("O questionário está cheio");
				App.questions();
			} else if(questions[i]==null) {
			
				System.out.println("Escreva a pergunta");
				pergunta = sc.next();
				
				System.out.println("escrevas as opcoes na forma 1)<opcao1> \nb)<opcao2> ...");
				opcoes = sc.next();
				
				System.out.println("escreva qual a resposta correta");
				resposta = sc.next();
				
				System.out.println("coloque o nivel de dificuldade. Ex:facil, dificil, ....");
				dificuldade = sc.next();
				
				questions[i] = new Question(pergunta,opcoes,resposta,dificuldade);
				contadorDePerguntas++;
				
				System.out.println("deseja jogar ? digite 1 para sim e 0 para não");
				int jogar = sc.nextInt();
				if(jogar == 1) {
					App.questions();
					System.exit(0);
				}
			}
		}
	}
		
}