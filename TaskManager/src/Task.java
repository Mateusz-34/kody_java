public class Task {
    private static int number = 1;
    private int id;

    private String name;
    private String description;
    private Boolean isDone;

    public Task(String name, String description){
        this.id = number++;
        this.name = name;
        this.description = description;
        this.isDone = false;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String output = "ID = " + id + ", tytul = " + name + ", opis = " + description + ", czywykonane = ";

        if (isDone){
            return output + "zrobione";
        } else {
            return output + "do wykonania";
        }
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setDone(Boolean isDone){
        this.isDone = isDone;
    }
}
