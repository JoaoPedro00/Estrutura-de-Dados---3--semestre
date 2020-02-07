package controller;

import controller.UnderflowException;
import controller.Node;

/** Lista simplesmente encadeada/ligada **/
public class JLinkedList {
protected Node head; 
public JLinkedList(){
head = null;
}

	public boolean isEmpty() {
		return head == null;
	}
	
	public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return head;
	}

	public Node getLast() throws UnderflowException {
		if (isEmpty()) {
		throw new UnderflowException();
		}
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		return current;
		}
	
	public void insertFirst(Node novoNode) {
		novoNode.setNext(head);
		head = novoNode;
		}
	
	public void insertLast(Node novoNode) {
		if (isEmpty()) {
			insertFirst(novoNode);
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			novoNode.setNext(null);
			current.setNext(novoNode);
		}
	}
	
	public Node removeFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedItem = head;
		head = head.getNext();
		return removedItem;
	}

	public Node removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		Node removedItem = current;
		if (head == current) {
			head = current = null;
		} else {
			Node atual = head;
			while (atual.getNext() != current) {
				atual = atual.getNext();
			}
			current = atual;
			atual.setNext(null);
		}
		return removedItem;
	}
	
	public void show() {
		if (isEmpty()) {
			System.out.println("Lista vazia!");
		} else {
			System.out.print("A lista é: ");
			Node current = head;
			while (current != null) {
				System.out.print(current.getElement().toString() + " ");
				current = current.getNext();
			}
			System.out.println("\n");
		}
	}
	
	public Object busca(int posicao){
		Node current = head;
		int i = 0;
		while (i != posicao) {
			current = current.getNext();
			i++;
		}
		return current;
	}
}