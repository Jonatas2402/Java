//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Locale;

import java.util.Scanner;

public class Main {
    /*Para executar o java é preciso declarar uma função.*/
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        //OP. Aritmeticas
        System.out.println(10+ 5); //Adição
        System.out.println(10 - 5); //Subtração
        System.out.println(10 * 2);//Multiplicação
        System.out.println(10 / 2);//Divisão
        System.out.println(3 % 2);//Resto da divisão

        /*Variáveis  e tipos*/
        //número inteiro
        byte idade = 10;
        System.out.println("Minha idade é:"+idade+ " anos" );
        short dsad = 1513;
        int dsada = 12513;
        long sadas = 1516316;
        //números reais
        double altura = 1.721513;
        float temperatura = 43.5f;
        System.out.printf("%.2f%n", altura); /*Para delimitar as casas decimaso
        utilizasse "%2(para duas casas decimais)f%n" e declaramos a variável*/
        System.out.printf("%.2f%n", altura);
        System.out.printf("RESULTADO = %.2f metros%n", altura);
        //caracter
        char sexo = 'F';
        //Booleano
        boolean escolha = true;
        //String
        String nome = "jonatas Silva";
        System.out.println("Meu nome é "+ nome);

        //Exercicio

        String product = "computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%s, which price is $: %.2f %n", product, price);
        System.out.printf("%s, which price is $: %.2f %n", product2, price2);

        System.out.printf("Record: %d years old, code %d and %s", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        System.out.printf("US decimal point: %.3f %n", measure);

        //entrada de dados
        Scanner sc = new Scanner(System.in);//Decalrando a variável Scanner e associando ela ao teclado no console.
        String x ;
        System.out.println("Digite alguma coisa: ");
        x = sc.next();

        System.out.println("Você digitou: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        double a;
        a = sc.nextDouble();
        System.out.println("Número real: " + a);

        char j;
        j = sc.next().charAt(0);//Para ler o primeiro caracter de uma String.
        System.out.println("Você digitou: " + j);
        sc.close();
    }
}