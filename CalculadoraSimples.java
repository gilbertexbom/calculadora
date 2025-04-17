import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        // Declaração de variáveis
        int n1, n2, total, op;

        // Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        // Apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");

        // Menu
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Sair");

        // Opção do usuário
        System.out.print("Opção: ");
        op = entrada.nextInt();

        if (op == 1) {
            // Entrada
            System.out.println("\nSoma Simples:");
            System.out.print("Informe N1: ");
            n1 = entrada.nextInt();
            System.out.print("Informe N2: ");
            n2 = entrada.nextInt();

            total = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + total);

        } else if (op == 2) {
            // Entrada
            System.out.println("\nSubtração:");
            System.out.print("Informe N1: ");
            n1 = entrada.nextInt();
            System.out.print("Informe N2: ");
            n2 = entrada.nextInt();

            total = n1 - n2;
            System.out.println(n1 + " - " + n2 + " = " + total);

        } else if (op == 3) {
            // Sair
            System.out.println("\nForte abraço!");
        } else {
            // Opção inválida
            System.out.println("\nOpção " + op + " incorreta!");
        }

       
    }
}
