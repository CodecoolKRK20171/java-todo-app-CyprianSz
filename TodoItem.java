public class TodoItem{

    public String content;
    public boolean isCompleted;

    public TodoItem(String content, boolean isCompleted) {
        this.content = content;
        this.isCompleted = isCompleted;
    }

    public void markAsCompleated() {
        this.completed = true;
    }
}
