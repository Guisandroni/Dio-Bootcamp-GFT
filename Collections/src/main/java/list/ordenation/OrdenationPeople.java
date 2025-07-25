package main.java.list.ordenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenationPeople {

    private final List<People> listOrdenationPeople;

    public OrdenationPeople(){
        this.listOrdenationPeople = new ArrayList<>();
    }

    public void toAddPeople (String name, int age, double height){
        listOrdenationPeople.add(new People(name,age,height));
        System.out.println("Pessoa adicionada com sucesso:" + listOrdenationPeople.toString());
    }
    
    public List<People> ordenationToAge(){
        List<People> peopleToAge = new ArrayList<>(listOrdenationPeople);
        Collections.sort(peopleToAge); //ordena a lista de pessoas pelo compareble, collections.sort chama o metodo
        return peopleToAge;
    }

    public List<People> ordenationToHeight(){
        List<People> peopleToHeight = new ArrayList<>(listOrdenationPeople);
        Collections.sort(peopleToHeight, new People.ComparatorToHeight());
        return peopleToHeight;
    }
    public void OrdenationToDescendat(){

    }

    public static void main(String[] args) {
        OrdenationPeople listPeople = new OrdenationPeople();

        listPeople.toAddPeople("Joao", 12 , 1.50);

        listPeople.toAddPeople("Lucas", 11 , 1.60);
        listPeople.toAddPeople("Alex", 23 , 1.80);

        listPeople.toAddPeople("Max", 23 , 1.90);

        listPeople.toAddPeople("Ben", 21 , 1.65);


       var age = listPeople.ordenationToAge();
       var height = listPeople.ordenationToHeight();

       System.out.println(age);
       System.out.println(height);
    }
}
