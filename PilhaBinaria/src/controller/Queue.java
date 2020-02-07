package controller;
public class Queue  
{  
	static StaticStack s1 = new StaticStack(15);
	static StaticStack s2 = new StaticStack(15); 
  
    public static void enQueue(int x)  
    {  
        while (!s1.isEmpty()) 
        {  
            s2.empilhar(s1.desempilhar());  
        }  
  
        s1.empilhar(x);  
  
        while (!s2.isEmpty())  
        {  
            s1.empilhar(s2.desempilhar());  
        }  
    }
    public static int deQueue()  
    {  
        if (s1.isEmpty())  
        {  
            System.out.println("Q is Empty");  
            System.exit(0);  
        }  
  
        int x = (int) s1.showTop();  
        s1.desempilhar();  
        return x;  
    }  
  
}  