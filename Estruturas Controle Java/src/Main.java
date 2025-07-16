import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Selecione uma opção de 1 a 7");
        int option = scanner.nextInt();
        switch (option){
            case 1 :
                System.out.println("Seleciona opção 1 - Estrutura de repetição for \n");
                for ( int i=0 ; i < 10; i++){
                    System.out.println("Exibindo valores de i \n");
                    System.out.println(i);
                }
                break;
            case 2 :
                System.out.println("Selecionada opção 2 \n");
                System.out.println("Olá como voce se chama? \n");
                String name = scanner.next();
                System.out.println("Qual a sua idade? \n");
                int age = scanner.nextInt();

                if (age >= 18){
                    System.out.printf("Caro %s voce tem %s e pode tirar sua cnh \n", name,age);
                } else{
                    System.out.printf("Caro %s voce tem %s e nao pode tirar sua cnh \n", name,age);
                }
                break;
            case 3:
                System.out.println("Selecionada opção 3 - Estrutura de repetição while");

               int i = 0;

               do {
                System.out.println(i);
                i ++;

                }
               while (i<10);


                   break;

            //exercicios
            case 4:

                System.out.println("Exericio da tabuada");

                System.out.println("Digite um valor");
                int numberTabuada = scanner.nextInt();
                System.out.printf("Tabuada do %s \n", numberTabuada);

               int p = 1;
                do {

                    int valorTabuada = numberTabuada * p;
                    System.out.printf("%s x %s = %s \n",numberTabuada,p,valorTabuada);
                    p++;

                }

                while ( p < 11);


            case 5:
                System.out.println("Exericio IMC");

                System.out.println("Digite sua altura \n");
                double alturaPessoa = scanner.nextDouble();
                System.out.println("Digite seu peso \n");
                int pesoPessoa = scanner.nextInt();

                double imc = pesoPessoa / (alturaPessoa * alturaPessoa);
                System.out.printf("O seu IMC é: %s \n", imc);
                if(imc <= 18.5){
                    System.out.println("Individuo abaixo do peso");

                } else if (imc >= 18.6 && imc <=24.9) {
                    System.out.println("Individuo com peso ideal");
                } else if (imc >= 25.0 && imc <=29.9){
                    System.out.println("Individuo levemente acima do peso");
                } else if (imc >= 30.0 && imc <=34.9){
                    System.out.println("Individuo com obesidade grau I");
                }else if (imc >= 35.0 && imc <=39.9){
                    System.out.println("Individuo com obesidade grau II");
                }else if (imc >= 40.0){
                    System.out.println("Individuo com obesidade grau III");
                } else {
                    System.out.println("Imc com valores invalidos");
                }



            case 6:
                //USUARIO ENTRA COM UM VALOR E OUTRO VALOR MAIOR QUE O PRIMEIRO
                // E ESCOLHE EM PAR OU IMPAR
                System.out.println("Exercicio de numeros pares e impares");

                System.out.println("Digite um numero");
                int numberScaleOne = scanner.nextInt();
                System.out.println("Digite um numero maior que o anterior");
                int numberScaleTwo = scanner.nextInt();

                System.out.println("Escolha 1 para par e 2 para impar");
                int optionNumber = scanner.nextInt();

                int c = numberScaleOne;
                switch (optionNumber){
                    case 1: //par
                        System.out.printf("Listando os numeros pares entre %s e %s \n",numberScaleOne,numberScaleTwo);

                        for( ;c <= numberScaleTwo; c ++) {
                            if(c%2 == 0){
                                continue;
                            }

                            System.out.println(c);
                        }




                        break;

                    case 2: //impar

                        System.out.printf("Listando os numeros impare entre %s e %s \n",numberScaleOne,numberScaleTwo);

                        for( ;c <= numberScaleTwo; c++) {
                            if(c%3 == 0){
                                continue;
                            }

                            System.out.println(c);
                        }
                        break;

                }

            case 7:
                System.out.println("Exercicio resto da divisão");

                System.out.println("Digite um numero qualquer");
                int numberInputDiv = scanner.nextInt();
                boolean verifica = true;
                while(verifica){
                    System.out.println("Informes outros numeros para a divisão");
                    int anotherNumbersDiv = scanner.nextInt();
                    if (anotherNumbersDiv < numberInputDiv){
                        System.out.printf("Continue informando demais numeros maiores que %s \n", numberInputDiv);
                        continue;
                    }
                    double resultDiv = anotherNumbersDiv % numberInputDiv;
                    verifica = resultDiv == 0;
                    System.out.printf("%s % %s = %s \n", verifica,numberInputDiv,resultDiv);
                }



                break;


        }



        }
    }
