package org.example;

public class Main {
    public static void main(String[] args) {

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