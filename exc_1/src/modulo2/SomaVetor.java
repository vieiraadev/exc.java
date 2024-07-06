package modulo2;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int n = scanner.nextInt();

        int[] vetor = new int[n];
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é " + soma);

        scanner.close();
    }
}
