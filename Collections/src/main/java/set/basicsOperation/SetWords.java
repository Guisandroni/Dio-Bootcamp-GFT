package main.java.set.basicsOperation;

import java.util.HashSet;
import java.util.Set;

public class SetWords {
    private Set<String> setWord;


    public SetWords(){
        this.setWord= new HashSet<>();
    }

    public void addNewWord(String word){
        var wordUnique = setWord.add(word);
        System.out.println("Palavra adicionada" + wordUnique);
    }

    public void removeWord(String word){
        String setRemoveWord = null;

        for (String w : setWord){
            setRemoveWord = w;
            System.out.println("Palavra removida" + setRemoveWord);
            break;
        }

        setWord.remove(setRemoveWord);
    }

    public void verifyWords(String setVerifyWord){

          if(setWord.contains(setVerifyWord)){
            System.out.println("Sim esta no hashSet");
        } else {
            System.out.println("Não esta no hashSet");
        }

        //usar como setWord.verifyWorlds("morango");




    }

    public void showWords(){
        System.out.println(setWord);
    }

}
