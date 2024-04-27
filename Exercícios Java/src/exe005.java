import java.util.Locale;
import java.util.Scanner;

public class exe005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int prod1, prod2, uni1, uni2;
        double vlr1, vlr2, total;

        System.out.println("Digite o Código da peça 1: ");
        prod1 = sc.nextInt();
        System.out.println("Digite o número de peças: ");
        uni1 = sc.nextInt();
        System.out.println("Didgite o valor por peça: ");
        vlr1 = sc.nextDouble();

        System.out.println("Digite o Código da peça 2: ");
        prod2 = sc.nextInt();
        System.out.println("Digite o número de peças: ");
        uni2 = sc.nextInt();
        System.out.println("Didgite o valor por peça: ");
        vlr2 = sc.nextDouble();

        total = (vlr1 * uni1) + (vlr2 * uni2);

        System.out.printf("Total a pagar: %.2f", total);

        sc.close();
    }
}
