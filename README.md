To-Do List Application


Description
The To-Do List Application is a simple, console-based Java program designed to help users manage their tasks efficiently. Users can add new tasks, delete existing tasks, view the list of all tasks, and exit the program when they are done.

Features
Add a Task: Add a new task to the list.
Delete a Task: Remove a task by specifying its number.
List Tasks: View all tasks currently in the list.
Quit: Exit the application.


How to Use

Compile the program using the Java compiler:
javac ToDoListApp.java

Run the program:
java ToDoListApp

Follow the menu options displayed in the console:
Enter 1 to add a task.
Enter 2 to delete a task by its number.
Enter 3 to list all tasks.
Enter 4 to quit the program.

Provide inputs as prompted by the program.
Code Structure
addTask:
  Reads user input and adds a new task to the tasks list.
  Confirms the addition by displaying the task to the user.
deleteTask:
  Displays all tasks with their corresponding indices.
  Prompts the user for a task number to delete.
  Validates the input and removes the specified task if valid.
listTasks:
  Displays all tasks in the tasks list.
  If no tasks exist, informs the user that the list is empty.

Main Program:
Displays a menu of options to the user.
Continuously loops until the user chooses to quit.


Example Execution
Sample Output

Welcome to the To-Do List App.
Please select one of the following options:
__________________________________________
1. Add a task
2. Delete a task
3. List the tasks
4. Quit

Enter your choice: 1
Enter the task you want to add: Buy groceries
Task 'Buy groceries' has been added to the list.

Please select one of the following options:
__________________________________________
1. Add a task
2. Delete a task
3. List the tasks
4. Quit

Enter your choice: 3
Here are your tasks:
Task #1. Buy groceries

Enter your choice: 4
Goodbye!!!

Requirements
Java Development Kit (JDK) 8 or higher.
A terminal or IDE to run the program.

Notes
Ensure valid inputs when prompted (e.g., numbers for task indices).
The program provides feedback for invalid inputs to guide users.

License
This project is free to use and modify.
