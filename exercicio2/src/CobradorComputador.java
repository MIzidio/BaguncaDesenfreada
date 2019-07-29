
public class CobradorComputador extends Jogador implements ICobrador{

	public CobradorComputador() {
		super("Computador");
	}
	
	@Override
	public int chutar() {
		System.out.println("O jogador "+getNome()+" escolheu seu lado");
		return (int)(Math.random()*3)+1;
	}
	
}
