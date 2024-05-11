import java.util.Locale;
import java.util.Scanner;

/**
 * exe014
 */
public class exe014 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int idade, soma = 0, cont = 0;


        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        while (idade >= 0) {
            soma = soma + idade;
            cont = cont + 1;
            System.out.print("Digite a sua idade: ");
            idade = sc.nextInt();            
        }

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        } else {
            System.out.println("Impossivel calcular");
        }

        sc.close();
    }
}