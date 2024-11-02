import javax.swing.plaf.synth.SynthOptionPaneUI;
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
        //Senha
        int senha = 2002, login;
        login = sc.nextInt();

        while (login != senha){
            System.out.println("Senha Invalida!");
            login = sc.nextInt();
        }
        System.out.println("Senha Correta!");
        //Posto de gasolina
        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;

        int tipo = sc.nextInt();
        while (tipo != 4){
            if (tipo == 1){
                alcool = alcool + 1;
            }else if (tipo == 2){
                gasolina = gasolina + 1;
            }else if (tipo == diesel){
                diesel = diesel + 1;
            }
            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Gasolina " + gasolina);
        System.out.println("alcool " + alcool);
        System.out.println("diesel " + diesel);

        //estrutura For (Para)
        int n = sc.nextInt();//atribui a quantidade de repetições da nossa aplicação.
        int adicao = 0;//Vai receber o valor de cada repetição e somar todos.
        for (int j = 0; j < n; j++){ //(inicio ; condição ; incremento;)
           int atr = sc.nextInt();//Valor para ser somado à adição.
           adicao = adicao + atr; //Recebe o valor e soma com o último atribuido a ele.
        }
        System.out.println(adicao);//Mostra o resultado da soma.
        sc.close();
        //Testes de mesa
        int ano = 3;
        int ano2 = 0;
        for (int cont = 0; cont < ano; cont++){
            System.out.print(cont + ",");
            ano2 = ano2 + 5;
            System.out.println(ano2);
        }
        //proximo
        int x2 = 4;
        int y2 = x2 + 2;
        for (int cont2 = 0; cont2 < x; cont2++){
            System.out.println(x2 + " " + y2);
            y2 = y2 + cont2;
        }
        //do while
        /*Sintaxe*/

    }
}
