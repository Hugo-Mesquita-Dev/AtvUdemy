import java.util.Locale;
import java.util.Scanner;

public class Q2 {
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
