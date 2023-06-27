package org.example.junior.chapter1.lesson3;

/**

 Java for beginners.
 Chapter 1: "Основы Java".
 Lesson 3: "Строки в Java. Ссылочные типы данных."

 **/

//Класс строковых переменных.
public class Strings {

    //Виды инициализации переменных.
    private String name = "Andrey"; //Создание простой строки.
    private String surname = "Fedorov";
    private String fullName = null; //Дефолтное значение переменной.
    private String city = new String("Samara"); //Создание обьекта String в Heap (память JavaRuntime).
    private String country = new String("Russia");

    //Конструктор класса
    public Strings() {
        System.out.println("Создан обьект класса 'Strings'!");
    }

    public static void main(String[] args) {

        //Создание класса переменных.
        Strings strings = new Strings();
        System.out.println("=".repeat(50));

        //Сложение строк.
        //Сравнение строк.
        //Конвертация типов.
        //Извлечение подстроки из строки.
        //Работа с регистром.
    }
}
