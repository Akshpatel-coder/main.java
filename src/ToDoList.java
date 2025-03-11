

    public class ToDoList {
        private String[] tasks = new String[10];
        private int taskCount = 0;

        // Method to add a task
        public void addTask(String task) {
            if (taskCount < 10) {
                tasks[taskCount] = task;
                taskCount++;
                System.out.println("Task added: " + task);
            } else {
                System.out.println("To-Do List is full");
            }
        }

        // Method to remove a task
        public void removeTask(String task) {
            for (int i = 0; i < taskCount; i++) {
                if (tasks[i].equals(task)) {
                    tasks[i] = tasks[taskCount - 1];
                    taskCount--;
                    System.out.println("Task removed: " + task);
                    return;
                }
            }
            System.out.println("Task not found");
        }

        // Method to list tasks
        public void listTasks() {
            System.out.println("To-Do List:");
            for (int i = 0; i < taskCount; i++) {
                System.out.println(tasks[i]);
            }
        }

        public static void main(String[] args) {
            ToDoList toDoList = new ToDoList();
            toDoList.addTask("Buy milk");
            toDoList.addTask("Walk the dog");
        }
    }