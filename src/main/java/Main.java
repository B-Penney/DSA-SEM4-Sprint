public class Main {
    public static void main(String[] args) {

        User[] users = new User[2];
        users[0] = new User("Beth-Ann");
        users[1] = new User("Tyler");

        users[0].addTask("Finish project");
        users[0].addTask("Make vet appointment");

        users[1].addTask("Buy new fishing line");
        users[1].addTask("Fix Skidoo");

        users[0].markTaskCompleted("Finish project");
        users[1].markTaskCompleted("Fix Skidoo");

        for (User user : users) {
            user.printTasks();
            System.out.println();
        }
    }
}
