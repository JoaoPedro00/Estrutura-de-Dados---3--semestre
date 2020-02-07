package controller;

public class JDLinkedLista2 {
	protected DNode head; //node cabeça da lista
	protected DNode tail; //node cauda da lista
	protected long size; //número de nodes da lista
	// Construtor default que cria uma lista vazia
	public void JDLinkedList2(){
	head = null;
	tail = null;
	size = 0;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public DNode getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return head;
	}
	
	public DNode getLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return tail;
	}
	
	
	public void inserir(DNode novoNode) {
		if (isEmpty()) {
			inserir(novoNode);
		} else {
			tail.setNext(novoNode);
			novoNode.setPrevious(tail);
			tail = novoNode;
			tail.setNext(head);
			head.setPrevious(tail);
			size++;
		}
	}
	
	public DNode removeFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		DNode removedItem = head;
		if (head == tail) {
			head = tail = null;
		} else {
			head.getNext().setPrevious(tail);
			head = head.getNext();
			tail.setNext(head);
		}
		size--;
		return removedItem;
	}
	
	public void show() {
		if (isEmpty()) {
			System.out.println("Lista vazia!");
		} else {
			System.out.print("A lista é: ");
			DNode current = head;
			while (current.getNext() != head) {
				System.out.print(current.getElement().toString() + " ");
				current = current.getNext();
			}
			System.out.print(current.getElement().toString() + " ");
			System.out.println("\n");
		}
	}
		
	}
