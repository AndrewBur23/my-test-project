import java.util.*;


public class FirstList {
    public static void main(String[] args) {
        Set<String> tasks = new HashSet<>();
        tasks.add("Learning Java");
        tasks.add("Go for a walk");
        tasks.add("Doing homework");

        if (tasks.contains("Doing homework")) {
            System.out.println("I will not be busy");
        }

        Iterator<String> iter = tasks.iterator();
        System.out.println("Today tasks: ");
        while (iter.hasNext()) {
            String currentTask = iter.next();
            System.out.println(currentTask);

            if (currentTask.equals("Go for a walk")) {
                iter.remove();
                System.out.println("Task 'Go for a walk' is completed and deleted ");
            }
        }
        System.out.println("Tasks remaining: " + tasks.size());
    }
}