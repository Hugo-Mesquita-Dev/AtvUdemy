import java.util.Scanner;

public class Q1 {

    /*
     * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
     * soma desses números com uma
     * mensagem explicativa, conforme exemplos.
     */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeiro valor: ");
        int a = sc.nextInt();
        System.out.println("Digite segundo Valor: ");
        int b = sc.nextInt();
        System.out.println("O resultado é : ");
        int SOMA = a + b;
        System.out.println(SOMA);

        sc.close();

    }
}
