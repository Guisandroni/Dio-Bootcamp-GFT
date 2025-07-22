package Domain;

public sealed abstract class Employee permits Manager, Salesman {
    //protected mesma coisa que private, porem permite passar parametros de forma direta
    protected String code;
    protected String name;
    protected String address;
    protected int age;
    protected double salary;
    protected  double fullSalary;

    public Employee(String code, String name, String address, int age, double salary, double fullSalary) {
        this.code=code;
        this.name=name;
        this.address=address;
        this.age=age;
        this.salary=salary;
        this.fullSalary=fullSalary;
    }

    public Employee() {

    }



    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getCode(){
        return code;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setName (String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setCode(String code){
        this.code=code;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public abstract double getFullSalary();

    public double getFullSalary(double extra){
        return this.getFullSalary() + extra;
    }
}
