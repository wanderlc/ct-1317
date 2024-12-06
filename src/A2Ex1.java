import java.util.Scanner;

public class A2Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int primeiro = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo numero:");
        int segundo = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o terceiro numero:");
        int terceiro = Integer.parseInt(scanner.nextLine());

        // Encontrar o maior número
        int maior = (primeiro >= segundo && primeiro >= terceiro) ? primeiro :
                (segundo >= primeiro && segundo >= terceiro) ? segundo : terceiro;

        System.out.println("O número maior é " + maior);

        scanner.close();
    }
}