import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AccountBank firstAccount = new AccountBank(12,"Joao da Silva",1000, 0 );
        Scanner scanner  = new Scanner(System.in);

        boolean optionsLoop = true ;
        System.out.println("Seja bem vindo a sua conta bancaria \n" + firstAccount.getNameHolder());

        while (optionsLoop) {

            System.out.println(" \n ==================");
            System.out.println("Selecione uma das opções: \n");
            System.out.println("1 - Consultar Saldo ");
            System.out.println("2 - Consultar Cheque Especial ");
            System.out.println("3 - Realizar Deposito ");
            System.out.println("4 - Sacar dinheiro ");
            System.out.println("5 - Pagar um boleto ");
            System.out.println("6 - Verificar se a conta esta usando cheque especial ");
            System.out.println("0 - Sair \n");
            System.out.println("==================");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Consultando saldo... \n");
                    firstAccount.showBalance();
                    break;

                case 2:
                    System.out.println("Consultando cheque especial \n");
                    firstAccount.showspecialCheck();
                    break;

                case 3:
                    System.out.println("Operação de deposito");
                    System.out.println("Informe o valor a ser depositado:");
                    double valueDeposit = scanner.nextDouble();
                    firstAccount.deposit(valueDeposit);
                    break;

                case 4:
                    System.out.println("Operação de saque");
                    System.out.println("Informe o valor a ser sacado:");
                    double valueWithdraw = scanner.nextDouble();
                    firstAccount.withdraw(valueWithdraw);
                    break;
                case 5:
                    System.out.println("Metodo para pagar boleto");
                    System.out.println("Informe o valor do boleto");
                    double valuePayBill = scanner.nextDouble();
                    firstAccount.payBill(valuePayBill);
                    break;
                case 6:
                    System.out.printf("Consultando se esta usando cheque especial");
                    firstAccount.specialCheckConsultation();
                    break;
                case 0:
                    System.out.println("Saindo da conta");
                    optionsLoop = false;
                    break;

            }
        }

    }
}