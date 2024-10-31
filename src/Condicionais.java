import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        //Estruturas condicionaias if else
        Scanner sc = new Scanner(System.in);
        int horas;
        System.out.println("Qunatas horas?: ");
        horas = sc.nextInt();
        if (horas <=12){
            System.out.println("Bom dia");
        }else if (horas <= 18) {
            System.out.println("Boa tarde");
        }else {
            System.out.println("Boa noite");
        }
        //Exercicios
        int numero, numero2;
        System.out.println("digite dois número: ");
        numero = sc.nextInt();
        numero2 = sc.nextInt();
        if (numero % numero2 == 0 || numero2 % numero == 0){
            System.out.println("SÃO MULTIPOS");
        }else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }
        //swich case
        int diaSemana;
        System.out.println("Digite um número de 1 a 4: ");
        diaSemana = sc.nextInt();
        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            default:
                System.out.println("Número não reconhecido");
                break;
        }
        sc.close();

        //Condição ternária

        int A, B, c;
        A = 12;
        B = 5;
        c = (A < B)? 31: 40;
        System.out.println(c);
    }
}
