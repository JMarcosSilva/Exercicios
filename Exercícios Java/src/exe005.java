import java.util.Locale;
import java.util.Scanner;

public class exe005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double vlr1, vlr2, total;

        System.out.print("Digite o Código da peça 1: ");
        cod1 = sc.nextInt();
        System.out.print("Digite o número de peças: ");
        qte1 = sc.nextInt();
        System.out.print("Didgite o valor por peça: ");
        vlr1 = sc.nextDouble();

        System.out.print("Digite o Código da peça 2: ");
        cod2 = sc.nextInt();
        System.out.print("Digite o número de peças: ");
        qte2 = sc.nextInt();
        System.out.print("Didgite o valor por peça: ");
        vlr2 = sc.nextDouble();

        total = (vlr1 * qte1) + (vlr2 * qte2);

        System.out.println("Código do produto 1: " + cod1);
        System.out.println("Código do produto 2: " + cod2);
        System.out.printf("Valor a pagar: %.2f", total);

        sc.close();
    }
}
