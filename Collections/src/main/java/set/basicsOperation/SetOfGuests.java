package main.java.set.basicsOperation;

import java.util.HashSet;
import java.util.Set;

public class SetOfGuests {
    private Set<Guest> setGuest ;

    public SetOfGuests(){
        this.setGuest= new HashSet<>();
    }

    public void addToNewGuest(String name, int codInvite){
        setGuest.add(new Guest(name,codInvite));
        System.out.println("Convidado adicionado com sucesos");
    }

    public void removeGuestCodGuest(int codInvite){
        Guest setRemoveGuest = null;
        for (Guest g : setGuest){
            if(g.getCodInvite() == codInvite){
                setRemoveGuest = g;
                System.out.println("Convidado removido");
                break;
            }
        }
        setGuest.remove(setRemoveGuest);
    }

    public int tellGuests(){
      return   setGuest.size();
    }

    public void showGuests(){
        System.out.println(setGuest);
    }

    public static void main(String[] args) {

        SetOfGuests setGuests = new SetOfGuests();

        System.out.println("Quantidade de convidados na lista: " + setGuests.tellGuests());

        setGuests.addToNewGuest("joao",1324);
        setGuests.addToNewGuest("Cleo",1424);
        setGuests.addToNewGuest("Max",114);
        System.out.println("Quantidade de convidados na lista: " + setGuests.tellGuests());

        setGuests.showGuests();
        setGuests.removeGuestCodGuest(114);

        setGuests.showGuests();
    }
}
