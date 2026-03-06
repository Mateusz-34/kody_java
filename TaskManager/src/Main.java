public class Main {
    public static void main(String[] args) {
        TaskManager TaskList = new TaskManager();
        TaskList.addTask("Isc do domu", "Po lekcjach isc do domu");
        TaskList.addTask("Zjesc obiad", "Na dlugiej przerwie zjesc obiad");
        TaskList.showAll();
        TaskList.showTask(1);
        TaskList.showTask(2);
        TaskList.removeTask(1);
        TaskList.showAll();
    }
}