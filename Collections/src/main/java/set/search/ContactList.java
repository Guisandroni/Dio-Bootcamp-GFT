package main.java.set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactList {

    private Set<Contact> setContactList = new HashSet<>();


    public ContactList(){
        this.setContactList = new HashSet<>();
    }

    public void addNewContact(String name, int numberPhone){
       var contact = setContactList.add(new Contact(name,numberPhone));
        System.out.println("Contato adicionado");
    }

    public Set<Contact> searchContactToName (String name){
        Set<Contact> contactsToName = new HashSet<>();

        for (Contact c : setContactList){
            if(c.getName().startsWith(name) ){
                contactsToName.add(c);
            }
        }

        return contactsToName;
    }

    public void showContactList (){
        System.out.println(setContactList);
    }

    public Contact updateContact(String name, int newNumberPhone){
        Contact contactReflesh = null;
        for (Contact c : setContactList){
            if(c.getName().equalsIgnoreCase(name)){
                c.setNumberPhone(newNumberPhone);
                contactReflesh = c;
                System.out.println("Contato atualizado");
                break;
            }
        }

        return contactReflesh;
    }

    public static void main(String[] args) {
        ContactList listContact = new ContactList();

        listContact.addNewContact("joao",967829);

        listContact.addNewContact("maria",97784);

        listContact.addNewContact("max",98982);

        listContact.addNewContact("ben1",929182);

        listContact.showContactList();

        var toName = listContact.searchContactToName("max");

        var reflesh =listContact.updateContact("maria", 1111);

        System.out.println(toName);
        System.out.println(reflesh);

        listContact.showContactList();


    }
}
