import java.util.Scanner;
public class Funcoes {
    public static void main(String[] args) {
        //São usadas para uma finalidade especifica,
        //Math.sqrt(); Essa funçaõ serve para achar a raiz quadrada de um número.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha tr~es números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a ,b, c);

        showResul(higher);
        sc.close();
    }
    public static int max(int x, int y, int z) {
        /*Esta função vai ver entre as três variaveis qual o maior valor entre elas*/
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z){
            aux = y;
        }else {
            aux = z;
        }
        return aux;
    }
    public static void showResul(int value){
        //Essa função simplesmente imprime o resoltado na tela.
        System.out.println("higher= " + value);
    }
}
