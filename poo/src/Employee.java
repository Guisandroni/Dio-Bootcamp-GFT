public sealed abstract class Employee permits Manager, Salesman {

    private String code;
    private String name;
    private String address;
    private int age;
    private double salary;

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
}
