public class App{
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller();
        TodoList toDoList = new TodoList();
        boolean proceed = true;

        while (proceed) {
            String choice = view.takeUserChoice();

            if (choice.equals("list")) {
                view.printAllTasks(toDoList);
            } else if (choice.equals("add")) {
                controller.addNewTask(toDoList);
            } else if (choice.equals("mark")) {
                controller.markTaskAsCompleated(toDoList);
            } else if (choice.equals("archive")) {
                controller.archiveAllCompleatedTasks(toDoList);
            } else if (choice.equals("exit")) {
                proceed = false;
            }
        }
    }
}
