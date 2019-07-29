
public class GoleiroComputador extends Jogador implements IGoleiro {
	
	public GoleiroComputador() {
		super("Computador");
	}
	
	@Override
	public int defender() {
		System.out.println("O jogador "+getNome()+" escolheu seu lado");
		return (int)(Math.random()*3)+1;
	}

}
