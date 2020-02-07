package controller;

import java.util.concurrent.Semaphore;

public class ThreadProcesso extends Thread{
	private int IdProcesso;
	private Semaphore semaforo;
	
	public ThreadProcesso(int IdProcesso, Semaphore semaforo) {
		this.IdProcesso = IdProcesso;
		this.semaforo = semaforo;
	}
	
	public void run() {
		ProcessoRodando();
		try {
			semaforo.acquire();
			ProcessoTerminou();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
		
	}

	private void ProcessoRodando() {
		int tempo =(int)((Math.random()*116001)+4000);
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("O processo # "+IdProcesso+ " demorou " +tempo/1000+" segundos");
	}
	
	private void ProcessoTerminou() {
		System.out.println(" O processo # "+IdProcesso+" terminou");
		
	}

}
