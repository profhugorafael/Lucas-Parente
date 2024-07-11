import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // digito meu nome
        // recebo uma mensagem de boas vindas

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Boas vindas, " + nome);
        System.out.println("Nome: " + nome + ", Altura: "  + altura + ", Idade: " + idade);
    }
}