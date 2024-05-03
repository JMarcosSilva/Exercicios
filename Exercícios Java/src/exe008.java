import java.util.Scanner;

public class exe008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        if (n%2 == 0) {
            System.out.println("Número par");
        }else{
            System.out.println("Número ímpar");
        }
        sc.close();
    }
}
