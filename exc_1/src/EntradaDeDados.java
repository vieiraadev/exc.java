import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        // Cria uma instância do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Exibe o número digitado pelo usuário
        System.out.println("Você digitou: " + numero);

        // Fecha o Scanner
        scanner.close();
    }
}
