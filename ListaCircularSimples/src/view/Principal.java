package view;

import controller.JLinkedList;
import controller.Node;
import controller.UnderflowException;

public class Principal{

public static void main(String args[]) {
JLinkedList lista = new JLinkedList();
//try {
lista.insertFirst(new Node("D"));
lista.insertFirst(new Node("S"));
lista.insertFirst(new Node("B"));
lista.insertLast(new Node("E"));
lista.insertLast(new Node("C"));
//lista.removeFirst(); //pode lançar UnderflowException
//lista.removeLast(); //pode lançar UnderflowException
//} catch (UnderflowException e) {
//System.out.println("ERRO: Impossível remover!");
//e.printStackTrace();
//}
lista.show();
}

}