import java.util.ArrayList;

public class TaskManager {
    private ArrayList <Task> TaskList;

    public TaskManager(){
        TaskList = new ArrayList <Task>();
    }

    public void addTask(String name, String description){
        Task task = new Task(name, description);
        TaskList.add(task);
    }

    public void showAll(){
        for (int i = 0; i < TaskList.size(); i++){
            System.out.println(TaskList.get(i));
        }
    }

    public void showTask(int id){
        for (Task task : TaskList){
            if (task.getId() == id){
                System.out.println(task);
                break;
            }
        }
    }

    public void removeTask(int id){
        for (int i = 0; i < TaskList.size(); i++){
            if (TaskList.get(i).getId() == id){
                TaskList.remove(id);
            }
        }
    }
}
