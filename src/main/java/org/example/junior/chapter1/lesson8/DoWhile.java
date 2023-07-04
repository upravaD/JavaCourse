package org.example.junior.chapter1.lesson8;

import java.util.Scanner;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 8: "Цикл do-while".
 *
 * <h3> В Java есть еще одна разновидность цикла {@code while} — цикл {@code do-while}. Он очень похож на {@code while} и тоже состоит всего из двух частей: {@code «условие»} и {@code «тело цикла»}. Тело цикла выполняется снова и снова, пока условие равно {@code true}.
 * <br>
 * <br>Синтаксис:
 * <blockquote><pre>
 *    {@code     do {
 *      команда;
 *     } while (условие);}
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/quests/lectures/questsyntaxpro.level04.lecture05">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4552">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=U0eOhyyG14k&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=6">YouTube</href>
 **/
public class DoWhile {

    /**
     * Экземпляр класса {@code Scanner} с параметром для ввода с клавиатуры.
     **/
    public Scanner scanner = new Scanner(System.in);

    /**
     * Переменная, которая хранит в себе данные введенные пользователем.
     **/
    private int userChoice;

    /**
     * Конструктор класса.
     **/
    public DoWhile() {}

    /**
     * Метод выводит в консоль примитивный перечень действий. В зависимости от выбора пользователя меняется результат и останавливается если пользователь выбрал соответствующий пункт.
     **/
    public void showMenu() {
        System.out.println("Выберите вариант действий: ");
        System.out.println("=".repeat(50));
        do {
            //Представление меню.
            System.out.println("1. Приветствие.");
            System.out.println("2. Написать что-нибудь.");
            System.out.println("3. Покинуть программу.");
            System.out.println("=".repeat(50));
            System.out.print("Ваш выбор: ");
            userChoice = scanner.nextInt(); //Выбор пользователя.

            if (userChoice == 1) { //Если пользователь ввел число 1.
                System.out.println("Привет!");
                System.out.println("=".repeat(50));
            }
            if (userChoice == 2) { //Если пользователь ввел число 2.
                System.out.println("Пишу что-то оригинальное.");
                System.out.println("=".repeat(50));
            }
        } while (userChoice != 3); //Цикл завершается если пользователь ввел число 3.
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        DoWhile doWhile = new DoWhile();

        //Запуск методов.
        doWhile.showMenu();
    }
}
