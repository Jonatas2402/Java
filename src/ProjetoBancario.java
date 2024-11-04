import java.util.Scanner;

public class ProjetoBancario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Nome: ");
        String nomeCliente = leitura.nextLine();
        System.out.print("Tipo de conta: ");
        String tipoConta = leitura.nextLine();
        System.out.print("Saldo Inicial:R$ ");
        double saldoInicio = leitura.nextDouble();

        int opcao = 0;

        System.out.println("***************************");
        System.out.println("\nnome do cliente: " + nomeCliente);
        System.out.println("tipo de conta: " + tipoConta);
        System.out.println("saldo em conta: " + saldoInicio);
        System.out.println("\n*****************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("seu saldo é R$: " + saldoInicio);
            } else if (opcao == 2){
                System.out.print("digite o valor que deseja transferir R$: ");
                double transf = leitura.nextDouble();
                saldoInicio = saldoInicio - transf;
                System.out.print("seu saldo ficou R$: " + saldoInicio);
            } else if (opcao == 3){
                System.out.println("Você recebeu uma transferência de R$: ");
                double receb = leitura.nextDouble();
                saldoInicio = saldoInicio + receb;
                System.out.println("seu saldo ficou R$: " + saldoInicio);
            }
        }
        leitura.close();
    }
}
