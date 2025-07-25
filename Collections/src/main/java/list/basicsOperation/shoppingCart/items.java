package main.java.list.basicsOperation.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class items{

    private List<ShoppingCart> listItems ;

    public items(){
        this.listItems = new ArrayList<>();
    }

    public void addItem(String name, double value, int amount){
        listItems.add(new ShoppingCart(name,value,amount));
        System.out.println("Itens adicionados ao carrinho");
    }

    public void removeItem(String name){
        List<ShoppingCart> removeItems = new ArrayList<>();
        for (ShoppingCart s : listItems){
            if(s.getName().equalsIgnoreCase(name)){
                removeItems.add(s);
            }



        }

        System.out.println("Removendo items: " + listItems.removeAll(removeItems));
    }

    public int findNumberItems(){
       return listItems.size();
    }

    public void findAllItems(){
        System.out.println(listItems);

    }

    public static void main(String[] args) {
        items listItems  = new items();


        listItems.addItem("Melancia", 10.50,2);

        listItems.addItem("Melancia", 10.50,30);

        listItems.addItem("Ovo", 12.00,10);

        listItems.findAllItems();

        System.out.println("Quantidade de items: " + listItems.findNumberItems());

        listItems.removeItem("Melancia");

        listItems.findAllItems();

        System.out.println("Quantidade de items: " + listItems.findNumberItems());

    }
}
