import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // entrada
        Scanner teclado = new Scanner(System.in);

        System.out.print("digite dois numeros para somar: ");
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();

        System.out.print("digite sua idade: ");
        // leio um inteiro digitado pelo usuario
        int idade = teclado.nextInt();

        System.out.print("digite sua altura: ");
        // leio um numero com virgula digitado pelo usuario
        double altura = teclado.nextDouble();

        System.out.print("digite seu nome: ");
        // leio um texto digitado
        String nome = teclado.next();

        boolean habilitado = true;

        // logica
        double soma = a + b;

        // saida
        System.out.println("Soma: " + soma);
    }
}