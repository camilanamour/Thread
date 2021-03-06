package controller;

public class ThreadController extends Thread{
	
	private int matriz [][] = new int [3][5];
	private int numero;
	
	public ThreadController(int numero, int matriz[][]){
		this.numero = numero;
		this.matriz = matriz;
	}
	
	@Override
	public void run() {
		CalculaSoma();
	}

	private void CalculaSoma() {	
	
		int soma = 0;
		for(int x=0; x<5; x++){
			soma+=matriz[this.numero][x];
		}
		System.out.println("TID #" + getId() + ": " + soma);
		
	}

}
