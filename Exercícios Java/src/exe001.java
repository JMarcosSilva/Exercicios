import java.util.Locale;
import java.util.Scanner;

public class exe001 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.print("Digite o valor do terreno por metro quadrado: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preço = area * metroQuadrado;

        System.out.printf("Área do terreno: %.2f\n", area);
        System.out.printf("Preço total do terreno: %.2f", preço);

        sc.close();
    }
}