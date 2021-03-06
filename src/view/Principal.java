package view;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		int matriz[][] = new int [3][5];
		
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){
				matriz[i][j] = (int) (Math.random() * 11);
			}
		}
		for(int i=0; i<3; i++){
			int vetor[] = new int[5];
			for(int x=0; x<5; x++){
				vetor[x] = matriz[i][x];
			}
			Thread t = new ThreadController(i, vetor);
			t.start();
			
		}		

	}

}
