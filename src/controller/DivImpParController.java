package controller;

public class DivImpParController {

    public DivImpParController() {

    }

    public int[] pegarPares(int[] vetor1, int[] vetor2) {
        int[] aux = new int[vetor1.length + vetor2.length];
        int cont = 0;

        for (int num : vetor1) {
            if (num % 2 == 0) { // par
                aux[cont++] = num;
            }
        }

        for (int num : vetor2) {
            if (num % 2 == 0) { // par
                aux[cont++] = num;
            }
        }

        // cria vetor resultado do tamanho certo
        int[] resultado = new int[cont];
        for (int i = 0; i < cont; i++) {
            resultado[i] = aux[i];
        }

        return resultado;
    }

    // Pega só os números ímpares dos dois vetores juntos
    public int[] pegarImpares(int[] vetor1, int[] vetor2) {
        int[] aux = new int[vetor1.length + vetor2.length];
        int cont = 0;

        for (int num : vetor1) {
            if (num % 2 != 0) { // ímpar
                aux[cont++] = num;
            }
        }

        for (int num : vetor2) {
            if (num % 2 != 0) { // ímpar
                aux[cont++] = num;
            }
        }

        int[] resultado = new int[cont];
        for (int i = 0; i < cont; i++) {
            resultado[i] = aux[i];
        }

        return resultado;
    }
}
