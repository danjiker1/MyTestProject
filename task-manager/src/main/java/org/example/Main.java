package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Менеджер задач вторичный ---");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Показать задачи");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход");

        addTask();
        showTask();
        deleteTask();
        exitTask();
    }

    // Методы должны быть внутри класса, но снаружи main
    static void addTask() {
        System.out.println("Добавить задачу");
    }

    static void showTask() {
        System.out.println("Показать задачу");
    }

    static void deleteTask() {
        System.out.println("Удалить задачу");
    }

    static void exitTask() {
        System.out.println("Выход");
    }
}