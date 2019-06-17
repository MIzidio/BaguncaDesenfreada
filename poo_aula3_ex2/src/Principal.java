import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaixaAtendimento caixa[] = new CaixaAtendimento[5];
		
		int j;
		for(j = 0; j < caixa.length; ++j) {
			caixa[j] = new CaixaAtendimento(j+1);
		}
		
		int i = new Random().nextInt(5) + 1;
		
		caixa[i].chamaProximoFila();
		caixa[i].chamaProximoFila();
		caixa[i].chamaProximoFila();
		caixa[i].chamaProximoFila();
		caixa[i].chamaProximoFila();
		
	}

}
