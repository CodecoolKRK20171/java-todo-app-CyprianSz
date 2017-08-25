import java.util.Scanner; // pozamykać ten skaner gdzie potrzeba
import java.util.ArrayList;
//import java.io.*; // zaimportować tylko to co potrzebne (Chyba 'Str')


public class View {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> possibleCommands = new ArrayList<>();

    public View() {
        possibleCommands.add("list");
        possibleCommands.add("add");
        possibleCommands.add("mark");
        possibleCommands.add("archive");
        possibleCommands.add("exit");
    }

    public String takeUserChoice() {
        String choice;

        do {
            System.out.println("\nPlease specify a command [list, add, mark, archive, exit]: ");
            choice = input.next().toLowerCase();
        } while (!possibleCommands.contains(choice));

        return choice;
    }

    public String takeTaskContent() {
        System.out.println("\nEnter task content: ");
        return input.next();
    }

    public String takeNumberToMark() {
        String choice = "";

        do {
            System.out.println("\nEnter proper number to mark: ");
            choice = input.next();
        } while (!choice.matches("^([1-9][0-9]*)$"));

        return choice;
    }

    public void printThatCompleated(TodoItem task) {
        System.out.println("\n" + task.content + " is compleated");
    }

    public void printThatArchived() {
        System.out.println("\nAll completed tasks got deleted.");
    }

    public void printAllTasks(TodoList toDoList) {
        Integer index = 1;

        System.out.println("\nYou saved the following to-do items: ");

        for (TodoItem task : toDoList.tasks) {
            String mark = task.isCompleted ? "X" : " ";
            System.out.println(index + "." + " [" + mark + "] " + task.content);
            index += 1;
        }
    }
}
