import veiculos.*;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo[] veiculos = new Veiculo[2];
		
		veiculos[0] = new Carro("Fusca", 1990, 8000, "ABC-1234", 2);
		veiculos[1] = new Caminhao("GM", 2010, 18000, "ZZZ-1334", 6, 200);
		
		int i;
		for(i = 0; i < veiculos.length; ++i) {
			System.out.println(veiculos[i].toString());
			System.out.println(veiculos[i].calculaIpva()+"\n");
		}

	}

}
