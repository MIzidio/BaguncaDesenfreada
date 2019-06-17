package loteria;

import java.util.Random;

public class NumeroAleatorio {
	
	public static int getAleatorio() {
		
		int i = new Random().nextInt(10);
		return i;
	}

}
