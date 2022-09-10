import java.util.Locale;
import java.util.Scanner;

public class Q2 {

    /*
     * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
     * valor da área deste círculo com quatro
     * casas decimais conforme exemplos.
     * Fórmula da área: area = π . raio2
     * Considere o valor de π = 3.14159
     */

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Considere o PI = 3,14");
        Double pi = 3.14;
        System.out.println("Digite o valor do raio: ");
        Double Raio = sc.nextDouble();
        System.out.println("O valor da Área do circulo é:");
        Double area = pi * Math.pow(Raio, 2);
        System.out.printf("Área=%.4f%n", area);

        sc.close();
    }
}
