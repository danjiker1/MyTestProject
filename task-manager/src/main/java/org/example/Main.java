package org.example;

import java.util.ArrayList;

public class Main {
    static ArrayList<String> tasks = new ArrayList<>();
      
      public static void main(String[] args) {
        
        System.out.println("--- Менеджер задач ---");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Показать задачи");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход");


        addTask("Купить хлеб");
        addTask("Полить цветы");
        addTask("Покормить кота");

        System.out.println("Все задачи добавлены!");
    }
    static void addTask(String task) {
        tasks.add(task);
    }
}