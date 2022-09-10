import java.util.Locale;
import java.util.Scanner;

public class Q6 {

    /*
     * Fazer um programa que leia três valores com ponto flutuante de dupla
     * precisão: A, B e C. Em seguida, calcule e
     * mostre:
     * a) a área do triângulo retângulo que tem A por base e C por altura.
     * b) a área do círculo de raio C. (pi = 3.14159)
     * c) a área do trapézio que tem A e B por bases e C por altura.
     * d) a área do quadrado que tem lado B.
     * e) a área do retângulo que tem lados A e B
     */

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Considere PI = 3,14");
        Double pi = 3.14;
        System.out.println("Digite o primeiro vaolor: ");
        Double a = sc.nextDouble();
        System.out.println("Difite o segundo valor : ");
        Double b = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        Double c = sc.nextDouble();

        // CALCULAR AREA:
        // AREA DO TRIANGULO
        Double triangulo = a * c / 2.0;
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        // AREA DO CIRCULO
        Double circulo = pi * c * c;
        System.out.printf("CIRCULO: %.3f%n", circulo);
        // AREA DO TRAPEZIO
        Double trapezio = (a + b) / 2 * c;
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        // AREA DO QUADRADO
        Double quadrado = b * b;
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        // AREA DO RETANGULO
        Double retangulo = a * b;
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
