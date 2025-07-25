package main.java.set.ordenation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RegisterProduct {

    private Set<Product> setProductList = new HashSet<>();

    public void addNewProduct (    long code,
     String name,
     double price,
     int amount){
        var newProduct = setProductList.add(new Product(code,name,price,amount));

        System.out.println("Produto adicionado " + newProduct);
    }


    public Set<Product> showProductsToName(){
        Set<Product> productsToName = new TreeSet<>(setProductList);
        if(!setProductList.isEmpty()){
            return productsToName;
        } else {
           return (Set<Product>) System.out.printf("A lista esta vazia");
        }

    }

    public Set<Product> showProductsToPrice(){
        Set<Product> productsToPrice = new TreeSet<>(new Product.ComparatorToPrice());
        setProductList.addAll(setProductList);
        if(!setProductList.isEmpty()){
            return productsToPrice;
        } else {
            throw new RuntimeException("Lista esta vazia");
        }
    }


}
