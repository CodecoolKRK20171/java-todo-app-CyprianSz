public class TodoList{

    public ArrayList<TodoItem> tasks;

    public TodoList() {
        this.tasks = new ArrayList<TodoItem>();
    }

    public void add(TodoItem task) {
        this.tasks.add(task);
    }

    public void archive_all() {
        ArrayList<TodoItem> undoneTasks = new ArrayList<TodoItem>();

        for (TodoItem task : this.tasks) {
            if (task.isCompleted == false) { undoneTasks.add(task) }
        }

        this.tasks = undenTasks;
    }
}
