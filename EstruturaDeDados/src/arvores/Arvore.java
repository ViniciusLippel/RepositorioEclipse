package arvores;

import java.util.Stack;

public class Arvore {
	private Nodo raiz;
	private Stack<Nodo> pilha;
	
	public void Inserir(Nodo novo) {
		if(raiz == null) {
			raiz = novo;
		}
		else {
			Nodo aux = raiz;
			while(aux != null) {
				if(novo.getNumero()<aux.getNumero()) {
					if(aux.getEsquerda() == null) {
						aux.setEsquerda(novo);
						break;
					}
					aux = aux.getEsquerda();
				}
				else
					if(aux.getDireita() == null) {
						aux.setDireita(novo);
						break;
					}
					aux = aux.getDireita();
			}
		}
	}
	
	public Nodo Pesquisar(int nro) {
		Nodo aux = raiz;
		while(aux != null) {
			if(aux.getNumero() == nro)
				return aux;
			else if(nro<aux.getNumero())
				aux = aux.getEsquerda();
			else
				aux = aux.getDireita();
		}
		return null;
	}
	
	public static void Listar(Nodo inicio) {
		if(inicio == null) {
			return;
		}
		Listar(inicio.getEsquerda());
		System.out.println(inicio.getNumero());
		Listar(inicio.getDireita());
	}
	
	public Nodo PrimeiroNodo() {
		if(raiz != null) {
			Nodo aux = raiz;
			pilha.push(aux);
			while(aux.getEsquerda() != null) {
				aux = aux.getEsquerda();
				pilha.push(aux);
			}
			return aux;
		}
		return null;
	}
	
	public Nodo ProximoNodo() {
		Nodo aux = (Nodo)pilha.pop();
		if(aux.getDireita() != null) {
			aux = aux.getDireita();
			pilha.push(aux);
			while(aux.getEsquerda() != null) {
				aux = aux.getEsquerda();
				pilha.push(aux);
			}
			return aux;
		}
		else {
			if(pilha.size() > 0)
				return (Nodo)pilha.peek();
			return null;
		}
	}
	
	public Nodo Subsequente(Nodo nodo) {
		if(nodo.getEsquerda().getDireita()!=null)
			return nodo.getEsquerda().getDireita();
		else
			return nodo.getEsquerda();
	}
	
	public Nodo Substituir(Nodo nodo) {
		nodo = Subsequente(nodo);
		return nodo;
	}
	
	public void Remover(Nodo nodo) {
		Nodo aux = nodo;
		if(aux == null)
			return;
		else {
			if(aux == raiz) {
				if(aux.getEsquerda() == null && aux.getDireita() == null)
					raiz = null;
				else if(aux.getDireita()!=null ^ aux.getEsquerda()!=null) {
					if(aux.getDireita()!=null)
						raiz = aux.getDireita();
					else
						raiz = aux.getEsquerda();
				}
				else
					raiz = Substituir(raiz);
			}
			else {
				if(aux.getEsquerda() == null && aux.getDireita() == null) {
					Nodo paiAux = aux.getPai();
					if(paiAux.getEsquerda()==aux)
						paiAux.setEsquerda(null);
					else
						paiAux.setDireita(null);
				}
				else if(aux.getDireita()!=null ^ aux.getEsquerda()!=null) {
					Nodo paiAux = aux.getPai();
					Nodo filhoAux;
					if(aux.getDireita()!=null)
						filhoAux = aux.getDireita();
					else
						filhoAux = aux.getEsquerda();
					if(paiAux.getEsquerda()==null)
						paiAux.setEsquerda(filhoAux);
					else
						paiAux.setDireita(filhoAux);
				}
				else
					nodo = Substituir(nodo);
			}
		}
	}
}
