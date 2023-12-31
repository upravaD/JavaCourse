package org.example.trainee.chapter1.lesson8;

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
     * Экземпляр класса {@code Scanner} с параметром {@code System.in} для ввода с клавиатуры.
     **/
    public Scanner scanner = new Scanner(System.in);

    /**
     * Простой метод для демонстрации работы цикла {@code do-while}. Стартовое число увеличивается на единицу каждую итерацию цикла. Пользователь вводит число, которое является последним числом цикла.
     **/
    public void start() {
        System.out.print("Введите число: ");

        int startNumber = 0; //Стартовое значение.
        int userNumber = scanner.nextInt(); //Значение пользователя.

        do {
            System.out.println(startNumber);
            startNumber++; //Увеличение стартового числа на единицу.

        } while (startNumber != userNumber); //Если стартовое значение становится равно значению пользователя, то цикл завершается.

        System.out.println("Программа завершена.");
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        DoWhile doWhile = new DoWhile();

        //Запуск методов.
        doWhile.start();
    }
}
