package controller;

public class JDLinkedList {
	protected DNode head; //node cabeça da lista
	protected DNode tail; //node cauda da lista
	protected long size; //número de nodes da lista
	// Construtor default que cria uma lista vazia
	public JDLinkedList(){
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
	
	public void insertFirst(DNode novoNode) {
		if (isEmpty()) {
			head = novoNode;
			tail = novoNode;
			head.setNext(head);
			head.setPrevious(head);
			size++;
		} else {
			novoNode.setNext(head);
			head.setPrevious(novoNode);
			head = novoNode;
			tail.setNext(head);
			head.setPrevious(tail);
			size++;
		}
	}
	
	public void insertLast(DNode novoNode) {
		if (isEmpty()) {
			insertFirst(novoNode);
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
	
	public DNode removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		DNode removedItem = tail;
		if (head == tail) {
			head = tail = null;
		} else {
			tail.getPrevious().setNext(head);
			tail = tail.getPrevious();
			head.setPrevious(tail);
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
	
	public void Josephus(int k) {//exer 14
		DNode current = head;
		for(long qnt = size; qnt>1;qnt--){
			for(int cont = 0; cont<k;cont++){
				current = current.getNext();
			}
			current.getNext().setPrevious(current.getPrevious());
			current.getPrevious().setNext(current.getNext());
			current = current.getNext();
			}
		System.out.print(current.getNext().getElement().toString() + " ");
		}
		
	}
