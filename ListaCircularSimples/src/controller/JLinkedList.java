package controller;

	public class JLinkedList {
		protected Node head; //node cabeça da lista
		protected Node tail; //node cauda da lista
		protected long size; //número de nodes da lista
		// Construtor default que cria uma lista vazia
		public JLinkedList(){
		head = null;
		tail = null;
		size = 0;
		}
		
		
		public boolean isEmpty() {
			return head == null;
		}

		public Node getFirst() throws UnderflowException  {
			if (isEmpty()) {
				throw new UnderflowException();
				}
			return head;
			}
		
		public Node getLast() throws UnderflowException {
			if (isEmpty()) {
				throw new UnderflowException();
			}
			return tail;
		}
		
		public void insertFirst(Node novoNode) {
			if (isEmpty()) {
				head = novoNode;
				tail = novoNode;
				size++;
				head.setNext(head);
			}
			novoNode.setNext(head);
			head = novoNode;
			tail.setNext(head);
			size++;
			}
		
		public void insertLast(Node novoNode) {
			if (isEmpty()) {
				insertFirst(novoNode);
			} else {
				novoNode.setNext(head);
				tail.setNext(novoNode);
				tail = novoNode;
				size++;
			}
		}
		
		public Node removeFirst() throws UnderflowException  {
			if (isEmpty()) {
				throw new UnderflowException();
			}
			Node removedItem = head;
			if (head == tail) {
				head = tail = null;
			} else {
				head = head.getNext();
				tail.setNext(head);
			}	
			size--;
			return removedItem;
		}
		
		public Node removeLast() throws UnderflowException  {
			if (isEmpty()) {
				throw new UnderflowException();
			}
			Node removedItem = tail;
			if (head == tail) {
				head = tail = null;
			} else {
				Node current = head;
				while (current.getNext() != tail) {
					current = current.getNext();
				}
				tail = current;
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
				Node current = head;
				while (current.getNext() != head ) {
					System.out.print(current.getElement().toString() + " ");
					current = current.getNext();
				}
				System.out.print(current.getElement().toString() + " ");
				System.out.println("\n");
			}
		}


		public void Josephus(int k) {
			for(long qnt = size; qnt>1;qnt--){
				Node current = head;
				for(int cont = 0; cont<k;cont++){
					current = current.getNext();
				}
				Node removedItem = current;
			}
		}
}