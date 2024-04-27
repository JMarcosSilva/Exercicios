import java.util.Locale;
import java.util.Scanner;

public class exe004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int id;
        double horas, vlrHoras, salario;

        System.out.print("Digite o se ID: ");
        id = sc.nextInt();
        System.out.print("Digite suas horas trabalhadas: ");
        horas = sc.nextDouble();
        System.out.print("Digite o valor por hora trabalhada: ");
        vlrHoras = sc.nextDouble();

        salario = horas * vlrHoras;

        System.out.println("ID: " + id);
        System.out.printf("salario: %.2f%n", salario);

        sc.close();
    }
}
