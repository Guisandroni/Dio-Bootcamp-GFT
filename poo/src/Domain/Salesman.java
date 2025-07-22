package Domain;

public non-sealed class Salesman extends Employee {
    private double percentPerSold;


    public Salesman(String code, String name, String address, int age, double salary, double percentPerSold, double fullSalary) {
        super(code,name,address,age,salary, fullSalary);
        this.percentPerSold=percentPerSold;
    }


    public Salesman(){
        super();
    }

    @Override
    public String getCode(){
        return "SL" + this.code;
    }

    @Override
    public double getFullSalary() {
        return (salary * percentPerSold / 100);
    }

    public double getPercentPerSold(){
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold){
        this.percentPerSold=percentPerSold;
    }
}
