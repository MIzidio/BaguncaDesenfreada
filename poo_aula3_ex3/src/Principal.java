import loteria.*;

public class Principal {

	public static void main(String[] args) {
		
		int[] numeros = {1,2,3};
		NumeroLoteria aposta = new NumeroLoteria(numeros);
		System.out.println("Sua aposta = " + aposta);		
		
		int n = 10;
		
		int i;
		for(i = 0; i < n; ++i) {
			
			NumeroLoteria sorteio = new NumeroLoteria();
			System.out.println("o numero sorteado = " + sorteio);
			
			if(sorteio.ganhou(aposta))
				System.out.println("Ganhou!");
			else
				System.out.println("Não foi dessa vez...");
		}
	}

}
