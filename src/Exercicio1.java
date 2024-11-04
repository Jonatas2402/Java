import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gerador = new Random().nextInt(100);//Gera um numero aleatoria entre 0 e 100
        int tentativa = 0;
        int numeroDigitado = 0;

        while (tentativa < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = sc.nextInt();
            tentativa++;
            if (numeroDigitado == gerador) {
                System.out.print("Parabéns você acertou");
                break;
            } else if (numeroDigitado < gerador) {
                System.out.println("O número digitado foi menor que o número gerado.");
            } else {
                System.out.println("O número digitado foi maior que o número gerado.");
            }
            if (tentativa != gerador) {
                System.out.println("O número era: " + gerador);
            }
        }
    }
}
