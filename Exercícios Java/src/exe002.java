import java.util.Locale;
import java.util.Scanner;

public class exe002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, R, PI = 3.14159;

        System.out.print("Digite o valor do raio: ");
        R = sc.nextDouble();

        A = PI * (R * R);

        System.out.printf("O valor da área é: %.4f%n", A);

        sc.close();


    }
}
