package br.edu.fateczl.pilhaI;

public class pilhaInt {

	no topo;
	
	public pilhaInt() {
		topo = null;
	}
	
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void push (int e){
		no elemento = new no ();
		elemento.dado = e;
		if (isEmpty()) {
			topo = elemento;
		}
		else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	public int pop () throws Exception {
		if (isEmpty()) {
			throw new Exception ("Não há elementos na pilha.");
		}
			int valor = topo.dado;
			topo = topo.proximo;
			return valor;
	}
	
	public int top () throws Exception {
		if (isEmpty()) {
			throw new Exception ("Não há elementos na pilha.");
		}
		return topo.dado;
	}	
	
	
	public int size () {
		int cont = 0;
		if(!isEmpty()){
			no auxiliar = topo;
			cont = 1;
			while(auxiliar.proximo != null){
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}
	
	public void mostra (pilhaInt p) {
		System.out.println("A ordem atual da pilha é: ");
		if (!isEmpty()) {
			pilhaInt auxiliar = new pilhaInt();
			auxiliar = p;
			int po = auxiliar.size();
			while (auxiliar.isEmpty() == false) {
				try{
					System.out.println("A Posição " + po + " da pilha é: "+auxiliar.pop());
					po--;
				}catch (Exception e){
					e.printStackTrace();
				}
				
			}
			
		}
	}

}
