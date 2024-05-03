import java.util.Scanner;

public class exe010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, notaFinal;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite o segunda nota: ");
        nota2 = sc.nextDouble();

        notaFinal = nota1 + nota2;

        System.out.printf("Nota final: %.1f%n", notaFinal);

        if (notaFinal < 60) {
            System.out.println("REPROVADO! Sua nota final foi abaixo da média de 60.0 pontos.");
        } else{
            System.out.println("APROVADO! Sua nota final foi acima da média de 60.0 pontos.");
        }
        sc.close();
    }
}
