import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra :)");
        String palavra = sc.nextLine();

        char[] caracteres = palavra.toCharArray();

        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - i - 1];
            caracteres[caracteres.length - i - 1] = temp;
        }

        String palavraInvertida = new String(caracteres);
        System.out.println("Esta é sua palavra invertida: " + palavraInvertida + " :D");
    }
}
