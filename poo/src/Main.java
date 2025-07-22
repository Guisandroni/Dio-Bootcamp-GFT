import Domain.Employee;
import Domain.Manager;
import Domain.Salesman;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Domain.Person male = new Domain.Person("joao",12);
       // System.out.println("ele se chama " + male.getName() + " e tem " + male.getAge() + " anos");

        Manager manager = new Manager();
        Salesman salesman = new Salesman();

//        manager.setName("joao");
//        manager.setLogin("joao@gmail.com");
//        manager.setPassword("123");
//
//        System.out.printf( manager.getName() + "\n" + manager.getLogin() + "\n" + manager.getPassword());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de funcionario para exibir:");
        System.out.println("1-Manager");
        System.out.println("2-Salesman");
        int option = scanner.nextInt();
        Employee employee;

        switch (option){
            case 1 -> employee = new Manager();
            case 2 -> employee = new Salesman();
            default ->{
                System.out.println("Invalido");
                return;
            }
        }

        printEmployee(new Manager());
    }

    public static void printEmployee(Employee employee){
//        System.out.println("Teste PrintEmployee");
        /*if (employee instanceof Domain.Manager manager){
            employee.setName("joao");
            manager.setLogin("joao");
            manager.setPassword("123");

            System.out.println(employee.getName());
            System.out.println(manager.getLogin());
            System.out.println(manager.getName());

        }
        */ //formato para instanciar o objeto

        //outra forma passando parametros com case
        switch (employee){
            case  Manager manager ->{
                System.out.println("Manager");
                employee.setName("joao");
                manager.setLogin("joao");
                manager.setPassword("123");
                manager.setCommission(10);
                manager.setSalary(3500);
                manager.setAge(32);
                manager.setAddress("Sorocaba");
                manager.setCode("1332");


                System.out.println(employee.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getCommission());
                System.out.println(manager.getAddress());
                System.out.println(manager.getAddress());
                System.out.println(manager.getAge());
                System.out.println(manager.getFullSalary());
                System.out.println("================");


            }
            case Salesman salesman ->{
                System.out.println("Salesman");
                employee.setName("Lucas");
                salesman.setSalary(8500);
                salesman.setAge(35);
                salesman.setAddress("Ibiúna");
                salesman.setCode("3321");
                salesman.setPercentPerSold(12);


                System.out.println(employee.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getAge());
                System.out.println(salesman.getAddress());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getFullSalary());


            }
        }


    }

}

