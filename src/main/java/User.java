public class User {
    private String name;
    private TaskList tasks;

    public User(String name) {
        this.name = name;
        this.tasks = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.addTask(task);
    }

    public void markTaskCompleted(String description) {
        tasks.markTaskCompleted(description);
    }

    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        tasks.printTasks();
    }
}


