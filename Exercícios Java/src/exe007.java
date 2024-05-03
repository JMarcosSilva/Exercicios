import java.util.Scanner;

public class exe007 {
    public static void main(String[] args) {
        int n = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Número Negativo");
        }else{
            System.out.println("número Positivo");
        }
        sc.close();
        
    }
}
