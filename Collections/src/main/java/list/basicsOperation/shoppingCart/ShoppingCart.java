package main.java.list.basicsOperation.shoppingCart;

public class ShoppingCart {
    private String name;
    private double value;
    private int amount;

    public ShoppingCart(String name, double value, int amount){
        this.name=name;
        this.value=value;
        this.amount=amount;
    }

    public String getName(){
        return name;
    }

    public double getValue(){
        return value;
    }

    public int getAmount(){
        return amount;
    }

    @Override
    public String toString() {
        return "name: " + name + ", " + "Value: " +  value + ", "+ "Amount: " + amount;
    }
}

