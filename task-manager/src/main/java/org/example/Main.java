package org.example;

public class Main {
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("--- Список задач ---");


        showTasks();
    }

    // Метод вывода списка задач
    static void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }
}