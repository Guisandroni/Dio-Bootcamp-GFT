package Domain;

public non-sealed class Manager extends Employee {

    private String login;
    private String password;
    private double commission;


    public Manager(String code, String name, String address, int age, double salary, double commission, String login, String password, double fullSalary) {
        super(code,name,address,age,salary,fullSalary);
        this.commission=commission;
        this.login=login;
        this.password=password;
    }

    public Manager(){
        super();

    }

    @Override
    public String getCode(){
        return "MN" + this.code;
    }

    @Override
    public double getFullSalary() {
        return (salary * commission / 100);
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(final String login){
        this.login=login;
    }

    public String getPassword(){
        return password;
    }
public void setPassword(final String password){
        this.password=password;
}
    public double getCommission(){
        return commission;
    }

    public void setCommission(double commission){
        this.commission=commission;
    }
}
