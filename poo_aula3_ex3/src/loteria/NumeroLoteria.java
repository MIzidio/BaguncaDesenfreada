package loteria;

public class NumeroLoteria {

	private int[] numeros;
	
	public NumeroLoteria() {
		
		numeros = new int[3];
		
		int i;
		for(i = 0; i < numeros.length; ++i) {
			numeros[i] = NumeroAleatorio.getAleatorio();
		}
	}
	
	public NumeroLoteria(int[] numeros) {
		
		this.numeros = new int[numeros.length];
		
		int i;
		for(i = 0; i < numeros.length; ++i) {
			this.numeros[i] = numeros[i]; 
		}
	}
	
	public String toString() {
		String ret = "";
		
		int i;
		for(i = 0; i < numeros.length; ++i) {
			ret = ret + String.format(" %2d", numeros[i]);
		}
		
		return ret;
	}
	
	public boolean ganhou(NumeroLoteria nLoteria) {
		
		int i;
		for(i = 0; i < numeros.length; ++i) {
			if(numeros[i] != nLoteria.numeros[i])
				return false;
		}
		
		return true;
	}
}
