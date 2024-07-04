package modulo2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int termos = scanner.nextInt();

        int num1 = 0, num2 = 1;
        System.out.print("Sequência de Fibonacci: " + num1 + ", " + num2);

        for (int i = 2; i < termos; i++) {
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }
}
