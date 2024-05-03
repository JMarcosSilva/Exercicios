import java.util.Scanner;

public class exe009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Digite um número: ");
        a = sc.nextInt();
        System.out.print("Digite outro número: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }
            

        sc.close();
    }
    
}