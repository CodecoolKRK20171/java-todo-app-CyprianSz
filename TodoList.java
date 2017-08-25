import java.util.ArrayList;


public class TodoList{

    public ArrayList<TodoItem> tasks;

    public TodoList() {
        this.tasks = new ArrayList<TodoItem>();
    }

    public void add(TodoItem task) {
        this.tasks.add(task);
    }

    public void archiveAll() {
        ArrayList<TodoItem> undoneTasks = new ArrayList<TodoItem>();

        for (TodoItem task : this.tasks) {
            if (task.isCompleted == false) { undoneTasks.add(task); }
        }

        this.tasks = undoneTasks;
    }
}
