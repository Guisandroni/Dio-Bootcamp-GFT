package main.java.set.basicsOperation;

import java.util.Objects;

public class Guest {
    private String name;
    private int codInvite;


    public Guest(String name , int codInvite){
        this.name=name;
        this.codInvite=codInvite;
    }


    public int getCodInvite() {
        return codInvite;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name + "," + codInvite + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return codInvite == guest.codInvite && Objects.equals(name, guest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, codInvite);
    }
}
