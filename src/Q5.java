import java.util.Locale;
import java.util.Scanner;

public class Q5 {

    /*
     * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
     * valor unitário de cada peça 1, o
     * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
     * Calcule e mostre o valor a ser pago.
     */

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da peça: ");
        int codigoPeca1 = sc.nextInt();
        System.out.println("Digite o código da segunda peça: ");
        int codigoPeca2 = sc.nextInt();
        System.out.println("Digite a quantidade primeira peça: ");
        int numeroPeca1 = sc.nextInt();
        System.out.println("Digite a quantidade da segunda peça: ");
        int numeroPeca2 = sc.nextInt();
        System.out.println("Digite o valor da peça: ");
        Double valorPeca1 = sc.nextDouble();
        System.out.println("Digite o valor da segunda peça: ");
        Double valorPeca2 = sc.nextDouble();
        System.out.println("O valor total a pagar é: ");
        Double pagar = numeroPeca1 * valorPeca1 + numeroPeca2 * valorPeca2;
        System.out.printf("%.2f%n", pagar);
        sc.close();

    }
}
