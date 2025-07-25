package main.java.set.search;

import java.util.HashSet;
import java.util.Set;

public class ListTask {

    private Set<Task> setTaksList = new HashSet<>();


    public void addNewTask(String description, String status){
       var taskNew =  setTaksList.add(new Task (description,status));

       System.out.println("Nova tarefas adicionada:" + taskNew);
    }
    public void removeTask(


    ){}

    public void showTask(){
        System.out.println( setTaksList );
    }
    public void tellTaskList(){}

    public void toObtainFinishTask(){}
    public void toObtainPendingTask(){}
    public void toMarkFinishTask(){}
    public void toMarkPendingTask(){}
    public void cleanList(){}




}
