import java.util.Scanner;
public class Repeticao {
    public static void main(String[] args) {
        /*while: enquanto a condição for verdadeira ele continua repetindo o código.
        * se o valor for veradeiro ele retorna para avaliar um novo valor, até ter uma condição falsa.*/
        Scanner sc = new Scanner(System.in);
        int numero ;
        numero = sc.nextInt();
        int soma = 0;
        while (numero != 0){
            soma = soma + numero; /*Nesse exemplo soma recebe o valor atribuido mais o valor acrecentado pelo usuário na variável numero.*/
            numero = sc.nextInt();
        }
        System.out.println("A soma dos valores é: " + soma);

        //exercicio
        int x = 0, y = 4;

        while (x < 3){//enquanto x for menor que 3 ele irá se repetir, nesse caso se repetirar 3 vezes por x ser 0.
            x = x + 1;//Toda vez que se repetir o valor 1 é atribuído ao valor de x.
            y = y + 2;//Toda vez que se repetir o valor 2 é atribuído ao valor de y.
            System.out.println(x + "-"+ y );
        }
        //Exercicios
        int a = 4, b = 0, i = 0;

        while (i < a){
            i = i + 1;
            b = b + 1;
            System.out.println(i + "-" + b);
        }
        //Senha
        int senha = 2002, login;
        login = sc.nextInt();

        while (login != senha){
            System.out.println("Senha Invalida!");
            login = sc.nextInt();
        }
        System.out.println("Senha Correta!");


        //estrutura For (Para)
        int n = sc.nextInt();//atribui a quantidade de repetições da nossa aplicação.
        int adicao = 0;//Vai receber o valor de cada repetição e somar todos.
        for (int j = 0; j < n; j++){ //(inicio ; condição ; incremento;)
           int atr = sc.nextInt();//Valor para ser somado à adição.
           adicao = adicao + atr; //Recebe o valor e soma com o último atribuido a ele.
        }
        System.out.println(adicao);//Mostra o resultado da soma.
        sc.close();
        // exercico de contagem com for
        for (int k = 2 ; k < 20; k = k + 2){
            System.out.println("O valores multiplos de 2:" + k);
        }
    }
}
