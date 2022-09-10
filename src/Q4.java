import java.util.Locale;
import java.util.Scanner;

public class Q4 {

    /*
     * Fazer um programa que leia o número de um funcionário, seu número de horas
     * trabalhadas, o valor que recebe por
     * hora e calcula o salário desse funcionário. A seguir, mostre o número e o
     * salário do funcionário, com duas casas
     * decimais
     */

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("DIgite seu numero do Crachá: ");
        int numeroCracha = sc.nextInt();
        System.out.println("Digite quantas horas de trabalho: ");
        Double horaTrabalho = sc.nextDouble();
        System.out.println("Digite o valor de trabalho por hora: ");
        Double valorTrabalho = sc.nextDouble();
        System.out.println("Seu salário atual é: ");
        Double salario = horaTrabalho * valorTrabalho;
        System.out.printf("Salário = %.2f%n", salario);
        sc.close();
    }
}
