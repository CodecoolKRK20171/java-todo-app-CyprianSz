import java.lang.IndexOutOfBoundsException;


public class Controller {

    private View view = new View();

    public void addNewTask(TodoList toDoList) {
        String content = view.takeTaskContent();
        TodoItem newTask = new TodoItem(content);
        toDoList.add(newTask);
    }

    public void markTaskAsCompleated(TodoList toDoList) {
        String choice;
        TodoItem task;

        try {
            view.printAllTasks(toDoList);
            choice = view.takeNumberToMark();
            int choiceInt = Integer.parseInt(choice);
            task = toDoList.tasks.get(choiceInt - 1);
            task.markAsCompleated();
            view.printThatCompleated(task);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("No task with such number !");
        }
    }

    public void archiveAllCompleatedTasks(TodoList toDoList) {
        toDoList.archiveAll();
        view.printThatArchived();
    }
}
