import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

  static ArrayList<String> tasks = new ArrayList<String>();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Welconme to the TODoList App");
    System.out.println();

    while (true) {
      System.out.println("Please select one of the following options");
      System.out.println("__________________________________________");
      System.out.println("1. Add a task");
      System.out.println("2. Delete a task");
      System.out.println("3. List tasks");
      System.out.println("4. Quit");

      System.out.print("Enter your choice: ");
      String choice = scanner.nextLine();

      switch (choice) {
        case "1":
          addTask(scanner);
          break;
        case "2":
          deleteTask(scanner);
          break;
        case "3":
          listTasks();
          break;
        case "4":
          System.out.println("Goodbye!!!");
          scanner.close();
          return;
        default:
          System.out.println("Invalid Input. Please try again");
      }
    }
  }

  public static void addTask(Scanner scanner) {
    System.out.println("Enter a task you want to add: ");
    String task = scanner.nextLine();
    tasks.add(task);
    System.out.println("Task '" + task + "' has been added to the list");
  }

  public static void deleteTask(Scanner scanner) {
    listTasks();
    if (tasks.isEmpty()) {
      return;
    }
    System.out.print("Enter the number of the task you want to delete: ");

    try {
      int taskToDelete = Integer.parseInt(scanner.nextLine()) - 1;
      if (taskToDelete >= 0 && taskToDelete < tasks.size()) {
        tasks.remove(taskToDelete);
        System.out.println("Task '" + (taskToDelete + 1) + "' has been removed.");
      } else {
        System.out.println("Task '" + (taskToDelete + 1) + "' does not exist.");
      }
    } catch (NumberFormatException e) {
      System.out.println("Invalid input. try again");
    }
  }

  public static void listTasks() {
    if (tasks.isEmpty()) {
      System.out.println("There are no active tasks.");
    } else {
      System.out.println("Here are the tasks you have: ");
      for (int i = 0; i < tasks.size(); i++) {
        System.out.println("Task #" + (i + 1) + ". " + tasks.get(i));
      }
    }
  }
}
