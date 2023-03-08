import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int indice = 13, soma = 0, k = 0;

        System.out.println("Digite um valor para K.");
        k = sc.nextInt();

        while (k < indice){
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("Com o valor atribuido a k, o resultado da soma é: " + soma);
    }
}
