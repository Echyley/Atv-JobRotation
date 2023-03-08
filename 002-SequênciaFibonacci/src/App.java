import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("Informe qualquer número :)");
        numero = sc.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " é um número de Fibonacci ;D");
        } else {
            System.out.println("O número " + numero + " não está na sequência de Fibonacci :(");
        }
    }

    // Verifica se o número existe na sequencia de Fibonacci.
    public static boolean isFibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (b < numero) {
            int c = a + b;
            a = b;
            b = c;
        }
        return (b == numero);
    }
}
