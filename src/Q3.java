import java.util.Scanner;

public class Q3 {

    /*
     * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
     * calcule e mostre a diferença do produto
     * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C *
     * D).
     */

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primerio valor: ");
        int a = sc.nextInt();
        System.out.println("Digite segundo valor: ");
        int b = sc.nextInt();
        System.out.println("Digite terceiro valor: ");
        int c = sc.nextInt();
        System.out.println("Digite quarto valor: ");
        int d = sc.nextInt();
        System.out.println("O resultado da diferença da expressão é:  ");
        int diferença = (a * b - c * d);
        System.out.println(diferença);
        sc.close();
    }
}
