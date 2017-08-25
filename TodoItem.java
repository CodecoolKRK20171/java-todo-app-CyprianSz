public class TodoItem{

    public String content;
    public boolean isCompleted;

    public TodoItem(String content) {
        this.content = content;
        this.isCompleted = false;
    }

    public void markAsCompleated() {
        this.isCompleted = true;
    }
}
