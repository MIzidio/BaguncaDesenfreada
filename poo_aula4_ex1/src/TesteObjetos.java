import listaLigada.*;

public class TesteObjetos {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		lista.adicionarItemNoFinal(2);
		lista.adicionarItemNoFinal(3);
		lista.adicionarItemNoFinal(4);
		lista.adicionarItemNoFinal(5);
		lista.imprimeLista();
		lista.removerItem(4);
		lista.imprimeLista();
		System.out.println(lista.buscarItem(4));
		System.out.println(lista.buscarItem(3));
		lista.removerItem(100);
		lista.imprimeLista();
		lista.inserirItem(1);
		lista.imprimeLista();
		lista.inserirItem(4);
		lista.imprimeLista();
		lista.inserirItem(12);
		lista.imprimeLista();

	}

}
