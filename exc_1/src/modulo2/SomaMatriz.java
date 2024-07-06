package modulo2;

import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] soma = new int[3][3];

        System.out.println("Digite os elementos da primeira matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("A soma das matrizes é:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
