import java.util.Scanner;

public class exe013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        y = sc.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("Você digitou em ordem crescente");
            } else {
                System.out.println("Você digitou em ordem decrescente");
            }

            System.out.print("Digite um número: ");
            x = sc.nextInt();
            System.out.print("Digite um número: ");
            y = sc.nextInt();
        }

        sc.close();

    }
}
