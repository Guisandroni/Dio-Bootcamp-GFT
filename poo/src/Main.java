//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Person male = new Person("joao",12);
       // System.out.println("ele se chama " + male.getName() + " e tem " + male.getAge() + " anos");

        Manager manager = new Manager();
        Salesman salesman = new Salesman();

        manager.setName("joao");
        manager.setLogin("joao@gmail.com");
        manager.setPassword("123");

        System.out.printf( manager.getName() + "\n" + manager.getLogin() + "\n" + manager.getPassword());

        printEmployee();
    }

    public static void printEmployee(){
        System.out.println("teste employee");
    }

}

