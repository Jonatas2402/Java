import java.util.Scanner;
public class exercicios {
    public static void main(String[] args) {
        //exercicios for
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de avaliações?: ");
        int N = sc.nextInt();//Número de repetições.


        for (int i = 0; i < N; i++){
            System.out.print("Digite a AV1°: ");
            double a = sc.nextDouble();
            System.out.print("Digite a AV2°: ");
            double b = sc.nextDouble();
            System.out.print("Digite a AV3°: ");
            double c = sc.nextDouble();

            double media = (a + b + c ) / 3.0;

            System.out.printf("%.1f%n", media);
            if (media < 6.0){
                System.out.println("REPROVADO");
            } else if (media >=6.0){
                System.out.println("APROVADO");
            }
        }
        sc.close();
    }
}
