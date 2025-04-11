import java.util.Scanner;

public class CalculadoraSimples{
    public static void main(String[] args){
        //Declaração de variáveis
        int n1, n2, total;

        //o otavio esteve aqui

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");

        //Entradas
        System.out.println("Soma Simples: ");
        System.out.print("Informe N1: ");
        n1 = entrada.nextInt();
        System.out.print("Informe N2: ");
        n2 = entrada.nextInt();

        //Processamento
        total = n1 + n2;

        //Saída
        System.out.println(n1 + " + " + n2 + " = " + total);

         System.out.print("1 - Soma ");
         System.out.println("2 - Subtração");
         System.out.println("3 - Sair);");

         //Menu
         System.out.println("1 - soma ");
         System.out.println("2 -Subtração ");
         System.out.println("3 - Sair");

    }
}