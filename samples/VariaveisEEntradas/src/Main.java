import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando um scanner
        Scanner keyboard = new Scanner(System.in);

        String nome = keyboard.nextLine();
        System.out.println("Seja bem-vindo(a) " + nome);

        // peco pro usuario digitar a e b
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        // calculo a soma de a e b
        int soma = a + b;

        // apresento a soma na tela
        System.out.println("Soma: " + soma);

        double altura = keyboard.nextDouble();
        System.out.println("Altura digitada: " + altura);
    }
}