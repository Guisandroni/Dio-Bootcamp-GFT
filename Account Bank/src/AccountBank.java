public class AccountBank {

    public AccountBank(int numberAccount, String nameHolder, double balance , double specialCheck){
        this.numberAccount = numberAccount;
        this.nameHolder= nameHolder;
        this.balance=balance;
        this.specialCheck = getSpecialCheck();

    }

    private String nameHolder;

    private int numberAccount;

    private double balance;

    private double specialCheck;

    public double getSpecialCheck(){
        if (balance <= 500){
            specialCheck = 50;
        } else{
            specialCheck += balance * 0.5;
        }

        return specialCheck;
    }

    public String getNameHolder(){
        return nameHolder;
    }

    public int getNumberAccount(){
        return numberAccount;
    }

    public double getBalance(){
        if(balance <=0){
            return balance += specialCheck;
        } else{
            return balance;
        }

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

    public void showspecialCheck (){
        System.out.println("Saldo do Cheque Especial: R$ " + specialCheck);
    }

    public void payBill(double payBill){
        if (payBill > 1 && balance >= payBill){
            balance -= payBill;
            System.out.printf("Boleto pago com sucesso, valor de R$", payBill);
        } else{
            System.out.println("Valores invalidos");
        }

    }

    public boolean specialCheckConsultation(){
        if (balance <0){
            System.out.println("Esta usando saldo do cheque especial");
            return true;
        } else {
            System.out.println("Não está usando o cheque especial");
            return false;
        }
    }



}
