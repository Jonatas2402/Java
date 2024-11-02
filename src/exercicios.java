import java.util.Scanner;
public class exercicios {
    public static void main(String[] args) {
        //exercicios for
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for (int i = 0; i < N; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b + 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }
        sc.close();
        //
        String nome = "Jonatas Silva";
        for (int A = 0; A < 3; A++){
            System.out.println(nome);
        }
    }
}
