public class ToDoList {

    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false; // Tasks are pending by default
    }

    // Marks the task as completed.
    public void markCompleted() {
        this.completed = true;
    }

    // Getter for description.
    public String getDescription() {
        return description;
    }

    // Getter for the completion status.
    public boolean isCompleted() {
        return completed;
    }

    // Returns a string representation of the task.
    @Override
    public String toString() {
        return description + " [" + (completed ? "Completed" : "Pending") + "]";
    }
}
