import java.util.Locale;
import java.util.Scanner;

public class exe011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta;

        System.out.print("Digite o valor de A: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = sc.nextDouble();

        delta = b * b - 4.0 * a *c;

        if (a == 0 || delta < 0.0) {
            System.out.println("Impossível de calcular");
        }else {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }


        sc.close();
    }
}
