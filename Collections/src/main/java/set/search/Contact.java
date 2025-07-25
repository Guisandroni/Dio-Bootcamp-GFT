package main.java.set.search;

import java.util.Objects;

public class Contact {
    private String name;
    private int numberPhone;


    public Contact(String name, int numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone){
        this.numberPhone=numberPhone;
    }

    @Override
    public String toString(){
        return name + numberPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return numberPhone == contact.numberPhone && Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberPhone);
    }
}
