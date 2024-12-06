import java.util.Scanner;

public class A2Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano:");
        int ano = scanner.nextInt();

        // Verificar ano bissexto
        String bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ?
                "É um ano bissexto" : "Não é um ano bissexto";

        System.out.println(bissexto);

        scanner.close();
    }
}