package main.java.list.basicsOperation;

import java.util.ArrayList;
import java.util.List;

public class ListTask{
    private List<Task> taskList;


    public ListTask(){
        this.taskList = new ArrayList<>();
    }


    public void addTask(String description){
        taskList.add(new Task(description));
        System.out.println("Tarefa adicionada com sucesso!");
    }

   public void addNewListTask(String description){
       List<Task> newList = new ArrayList<>();
       newList.add(new Task (description));
       newList.add(new Task (description));
       newList.add(new Task (description));
       newList.add(new Task (description));

       taskList.addAll(newList);
   }

    public void removeTask(String description){
        List<Task> removeTask = new ArrayList<>();
        for (Task t: taskList){
            if(t.getDescription().equalsIgnoreCase(description)){
                removeTask.add(t);
            }
        }
        System.out.println("Removendo tarefas:" + taskList.removeAll(removeTask));


        /*
        * Outra forma
        * taskList.removeIf(Task->Task.getDescription().equalIgnoreCase(description))
        * usando o metodo removeIf direto
        * */
    }

    public int findAllNumberTasks(){
      return  taskList.size();

    }

    public void findDescriptionTask(){
        System.out.println(taskList);
    }


    public static void main(String[] args) {
        ListTask listTask = new ListTask();

        listTask.addTask("tarefa 1");
        listTask.addTask("Tarefa 2");

        listTask.findDescriptionTask();
        listTask.addNewListTask("teste");
       System.out.println("Quantidade de tarefas na lista: " + listTask.findAllNumberTasks());




    }


}
