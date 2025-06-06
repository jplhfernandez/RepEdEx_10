package view;

import java.util.Arrays;

import controller.DivImpParController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = {15, 8, 23, 4, 23, 15, 42, 42, 5, 0, 23, 15, 42};
		int vetor2[] = {12, 7, 35, 22, 22, 5, 9, 41, 12, 2};
		DivImpParController imp_par = new DivImpParController();
		int par[] = imp_par.pegarPares(vetor, vetor2);
		int impar[] = imp_par.pegarImpares(vetor, vetor2);
		System.out.println("O vetor par: " + Arrays.toString(par));
		System.out.println("O vetor impar: " + Arrays.toString(impar));
	}

}
