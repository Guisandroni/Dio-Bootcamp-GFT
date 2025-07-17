public class AccountBank {

    public AccountBank(int numberAccount, String nameHolder, double balance ){
        this.numberAccount = numberAccount;
        this.nameHolder= nameHolder;
        this.balance=balance;

    }

    private String nameHolder;

    private int numberAccount;

    private double balance;

    public String getNameHolder(){
        return nameHolder;
    }

    public int getNumberAccount(){
        return numberAccount;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double value){
        if (value > 0) {

            balance += value;
            System.out.printf("O valor de R$ %s foi depositado com sucesso", value);



        } else {
            System.out.println("Valores a serem depositados são inválidos");
        }
    }

    public void showBalance(){
        System.out.printf("Saldo atual: R$ "+ balance);
    }

    public void withdraw (double withdraw){
        if ( withdraw > 1 && balance >= withdraw){
            balance -= withdraw;
            System.out.printf("Deposito no valor de %s efetuado com sucesso", withdraw);
        } else {
            System.out.println("Valor invalido ou saldo insuficiente");
        }
    }

}
