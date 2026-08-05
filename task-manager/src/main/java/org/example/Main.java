package org.example;

import java.util.ArrayList;

public class Main {
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("--- Менеджер задач ---");

        // Добавляем задачи
        addTask("Купить хлеб");
        addTask(""); // Попытка добавить пустую строку
        addTask("Полить цветы");

        showTasks();
    }

    static void addTask(String task) {
        // Проверка: если строка пустая или null, не добавляем
        if (task == null || task.trim().isEmpty()) {
            System.out.println("Ошибка: Нельзя добавить пустую задачу!");
            return;
        }
        tasks.add(task);
        System.out.println("Добавлено: " + task);
    }

    static void showTasks() {
        System.out.println("--- Список задач ---");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}