package listaLigada;

public class ListaLigada {
	
	private LinkedNode first = null;
	
	public void adicionarItemNoFinal(int item) {
		
		LinkedNode novoNo = new LinkedNode();
		novoNo.data = item;
		novoNo.next = null;
		
		if(first == null) {
			
			first = novoNo;
			
		} else {
			
			LinkedNode atual = first;
			
			while(atual.next != null)
				atual = atual.next;
			
			atual.next = novoNo;
		}
		
	}
	
	public void removerItem(int item) {
		
		if(first != null && first.data == item) {
			
			first = first.next;
			
		} else {
			
			LinkedNode atual = first;
			while(atual.next != null && atual.next.data != item) {
				atual = atual.next;
			}
			
			if(atual.next != null)
				atual.next = atual.next.next;
		}
	}
	
	public void imprimeLista() {
		
		LinkedNode atual = first;
		
		while(atual != null) {
			System.out.printf("%4d", atual.data);
			atual = atual.next;
		}
		System.out.println();
	}
	
	public boolean buscarItem(int item) {
			
			LinkedNode atual = first;
			while(atual != null && atual.data != item) 
				atual = atual.next;
				
			if(atual != null) 
				return true;
				
		
		return false;
		
	}
	
	public void inserirItem(int item) {
		
		LinkedNode novoNo = new LinkedNode();
		novoNo.data = item;
		novoNo.next = null;
		
		if(first == null) {
			first = novoNo;
		} else if (first.data > item) {
			novoNo.next = first;
			first = novoNo;
		} else {
			
			LinkedNode atual = first;
			while(atual.next != null && atual.next.data <= item) 
				atual = atual.next;
			
			novoNo.next = atual.next;
			atual.next = novoNo;
		}
		
		
	}

}
