package modulo1;

import java.util.Scanner;
import java.util.Arrays;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("Vetor ordenado:");
        for (int i : vetor) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
