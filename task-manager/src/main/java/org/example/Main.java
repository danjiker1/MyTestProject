package org.example;

import java.util.ArrayList;

public class Main {
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("--- Менеджер задач ---");

        // Здесь мы только добавляем задачи
        addTask("Купить хлеб");
        addTask("Полить цветы");
        addTask("Покормить кота");

        System.out.println("Все задачи добавлены!");
    }

    // Метод добавления задачи
    static void addTask(String task) {
        tasks.add(task);
    }
}