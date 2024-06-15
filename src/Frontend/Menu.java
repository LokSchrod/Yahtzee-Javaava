package Frontend;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static int lerInt(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            System.out.print(mensagem);
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        return valor;
    }

    public static void pause() {
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }
}
