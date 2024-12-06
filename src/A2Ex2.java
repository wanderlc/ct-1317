import java.util.Scanner;

 public class A2Ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do atleta:");
        int idade = scanner.nextInt();

        // Descobrir a categoria
        String categoria = idade < 18 ? "Juvenil" :
                (idade >= 18 && idade <= 40) ? "Adulto" : "Master";

        System.out.printf("A idade é %d e a categoria é: %s\n", idade, categoria);

        scanner.close();
    }
}