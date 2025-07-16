import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //exercicios
        //1
        var scanner = new Scanner(System.in);
    System.out.println("Digite seu nome \n");

    var name = scanner.next();
    System.out.println("Informe sua data de nascimento \n");
    var age = scanner.nextInt();

    System.out.printf("Olá %s voce tem %s anos \n", name, age);

    //2
        System.out.println("\n Informe o tamanho do lado do quadradoem cm \n");
        var lado = scanner.nextInt();
        var areaQuadrado = lado * lado;
        System.out.printf("A area total do quadrado a respeito do %s lado informado é %s \n", lado,areaQuadrado);


     //3
        System.out.println("\n Informe o tamanho da base de um retangulo \n");
        var base = scanner.nextInt();
        System.out.println("\n Informe a altura de um retangulo \n");
        var altura = scanner.nextInt();
        var areaTriangulo = base * altura;
        System.out.printf("A area total do triangulo conforme a  %s base e %s altura informados é %s \n",base,altura,areaTriangulo);

        //4
        System.out.println("Ola primeira pessoa qual o seu nome?");

        var personOneName = scanner.next();
        System.out.println("e a sua idade?");
        var personOneAge = scanner.nextInt();

        System.out.println("Ola segunda pessoa qual o seu nome?");

        var personTwoName = scanner.next();
        System.out.println("e a sua idade?");
        var personTwoAge = scanner.nextInt();

        var diferencaIdade = personTwoAge - personOneAge;



        System.out.printf("A diferença de idades da %s e %s são de %s", personOneName, personTwoName, diferencaIdade);

        }
    }
