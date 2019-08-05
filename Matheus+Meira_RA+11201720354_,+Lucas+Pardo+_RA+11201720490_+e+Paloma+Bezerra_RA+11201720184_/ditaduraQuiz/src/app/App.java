package app;
import java.util.Scanner;
import app.Question;

public class App {
	public static Question questions[] = new Question[10];
	public static int contadorDePerguntas=3;
	
	//banco de perguntas
		public static void questions() {
			
			String q0= "Quando come�ou a ditadura no Brasil? Como este per�odo ficou conhecido?\n";
			String o0="a)1967 e Momentos Tristes "
					+ "\nb)1966 e Conflito Interno "
					+ "\nc)1964 e Anos de Chumbo "
					+ "\nd)1962 e Escurid�o Democr�tica \n";
			
			String q1= "Em 1970, durante a ditadura, aconteceu um fato usado pela ditadura como propaganda."
					+ " Que fato foi esse?\n";
			String o1= "a)A ditadura enfraquecida "
					+ "\nb)O Brasil ganhou o tricampeonato mundial de futebol "
					+ "\nc)A constru��o de Bras�lia \n";
			
			String q2="Quanto era a divida externa brasileira no governo de Figueiredo?\n";
			String o2= "a)136 bilh�es de d�lares "
					+ "\nb)115 bilh�es de d�lares "
					+ "\nc)58 bilh�es de d�lares "
					+ "\nd)100 bilh�es de d�lares \n";				
			
			questions[0] = new Question(q0,o0,"c","facil");
			questions[1] = new Question(q1,o1,"b","media");
			questions[2] = new Question(q2,o2,"d","facil");
			
			takeTest(questions);
		}
	
	//executa o jogo
		
		public static void takeTest(Question[] questions) {
			int score = 0;
			Scanner resposta =  new Scanner(System.in);
			
			for(int i=0; i<contadorDePerguntas; i++) {
				//manda o print de cada pergunta
				System.out.println(questions[i].nivel);
				System.out.println(questions[i].prompt);
				System.out.println(questions[i].options);
				
				String answer = resposta.nextLine();
				//conta os acertos
				if(answer.equals(questions[i].answer)){
					score++;
				}
			}
			System.out.println("Pontua��o: "+score+"/"+contadorDePerguntas);
			score=0;
	}
}
