package org.example.trainee.chapter1.lesson7;

import java.util.Random;
import java.util.Scanner;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 7: "Ввод данных. Класс Scanner".
 *
 * <h3> Класс {@code Scanner} (полное имя {@code java.util.Scanner}) умеет считывать данные из разных источников: консоль, файлы, интернет. Если мы хотим, чтобы он считывал данные с клавиатуры, мы должны передать ему объект {@code System.in} в качестве параметра – источника данных.
 * <br>
 * <br>Синтаксис:
 * <blockquote><pre>
 *     {@code Scanner myScanner = new Scanner(} параметр источника данных{@code );}
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/klass-scanner">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4551">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=yeFFw8Eh3vQ&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=3">YouTube</href>
 **/
public class InputScanner {
    /**
     * Экземпляр класса {@code Scanner} с параметром {@code System.in} для ввода с клавиатуры.
     **/
    public Scanner scanner = new Scanner(System.in);

    /**
     * Метод бесконечно генерирует случайное выражение сложения двух случайных чисел, где пользователю нужно ввести правильный ответ. Если ответ не правильный, то программа завершается.
     **/
    public void calculate() {
        boolean exit = true; //Маркер выхода из цикла.
        int wins = 0; //Счетчик побед.

        System.out.println("Введите ответ: ");
        while (exit) { //Условие цикла.
            int x = new Random().nextInt(100); //Первое слагаемое.
            int y = new Random().nextInt(100); //Второе слагаемое.
            int result = x + y; //Результат сложения.

            System.out.print(x + " + " + y + " = ");
            int userAnswer = scanner.nextInt(); //Ответ пользователя.

            if (result == userAnswer) { //Если число пользователя равно результату сложения.
                System.out.println("Поздравляем!!! Вы угадали!");
                wins++;
            } else { //Если число пользователя не совпало с результвтом сложения.
                System.out.println("Увы и ах!!! Вы проиграли!");
                exit = false; //Маркер цикла меняется на противоположный.
            }
        }
        System.out.println("=".repeat(50));
        System.out.println("Вы победили " + wins + " раз.");
        System.out.println("Спасибо за игру!");
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        InputScanner inputScanner = new InputScanner();

        //Запуск методов.
        inputScanner.calculate();
    }
}
