import estrutura.*;

public class TesteEstruturas {
	public static void main(String[] args) {

		System.out.println("--- Teste 1 ---");
		try {
			PilhaSimples pilha = new PilhaAprimorada(3);
			pilha.empilha("10");
			pilha.empilha("20");
			pilha.empilha("30");
			pilha.empilha("40");
			System.out.println(pilha.desempilha());
			System.out.println(pilha.desempilha());
			System.out.println(pilha.desempilha());
			System.out.println(pilha.desempilha());

			System.out.println();
		} catch (PilhaVaziaException e) {
			System.out.println(e);
		} catch (PilhaCheiaException e) {
			System.out.println(e);
			System.out.println("Limite eh " + e.getLimite());
			System.out.println("Item eh " + e.getItem());
		}

		System.out.println();
		System.out.println("--- Teste 2 ---");

		try {
			PilhaSimples pilha = new PilhaAprimorada(3);
			pilha.empilha("10");
			pilha.empilha("20");
			pilha.empilha("30");
			System.out.println(pilha.desempilha());
			System.out.println(pilha.desempilha());
			System.out.println(pilha.desempilha());
			System.out.println(pilha.desempilha());

			System.out.println();
		} catch (PilhaVaziaException e) {
			System.out.println(e);
		} catch (PilhaCheiaException e) {
			System.out.println(e);
			System.out.println("Limite eh " + e.getLimite());
			System.out.println("Item eh " + e.getItem());
		}

		System.out.println();
		System.out.println("--- Teste 3 ---");
		
		try (PilhaRecurso pilha = new PilhaRecurso(5)) {
			pilha.empilha("Teste1");
			pilha.empilha("Teste2");
			pilha.empilha("Teste3");
			pilha.empilha("Teste4");
			pilha.empilha("Teste5");
			pilha.empilha("Teste6");
			System.out.println(pilha.desempilha());
		} catch(PilhaException e) {
			System.out.println(e);
		}
	}

}
