package org.example.junior.chapter1.lesson10;

import java.util.Scanner;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 10: "Оператор switch".
 *
 * <h3> Оператор {@code switch} в Java - это условный оператор, который дает возможность сравнивать переменную со списком значений.
 * <br>
 * <br>Синтаксис:
 * <blockquote><pre>
 *     Простая форма:
 *
 *     {@code switch (ВыражениеДляВыбора) {
 *            case  (Значение1):
 *                Код1;
 *                break;
 *            case (Значение2):
 *                Код2;
 *                break;
 * ...
 *            case (ЗначениеN):
 *                КодN;
 *                break;
 *            default:
 *                КодВыбораПоУмолчанию;
 *                break;
 *        }}
 *
 *      Начиная с Java 14, {@code switch} позволяет использовать лямбда-стрелку
 *      для "сопоставления" {@code case} с кодом:
 *
 *      {@code switch (number) {
 *          case 1 -> вызываемМетод("one");
 *          case 2 -> вызываемМетод("two");
 *          default -> вызываемМетод("many");
 *      }}
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/operator-switch-v-java">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4554">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=n2XGGlzQs48&list=PLEgFBkSxIsb9mXu1BIlV8fILz4TaaXVYu&index=20">YouTube</href>
 **/

public class Switch {

    /**
     * Экземпляр класса {@code Scanner} с параметром {@code System.in} для ввода с клавиатуры.
     **/
    public Scanner scanner = new Scanner(System.in);

    /**
     * Метод выводит в консоль примитивный перечень действий. В зависимости от выбора пользователя меняется результат.
     **/
    public void showMenu() {

        int userChoice; //Выбор пользователя.

        //Заголовок меню.
        System.out.println("Добро пожаловать в наш ресторан!");
        System.out.println("Чего изволите?");
        System.out.println("=".repeat(50));

        do {
            //Содержимое меню.
            System.out.println("1. Покушать.");
            System.out.println("2. Побухать.");
            System.out.println("3. Покинуть ресторан.");
            System.out.println("=".repeat(50));
            System.out.print("Ваш выбор: ");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> { //Если пользователь ввел число 1.
                    System.out.println("Приятного аппетита!");
                    System.out.println("=".repeat(50));
                    System.out.println("Что-нибудь еще?");
                }
                case 2 -> { //Если пользователь ввел число 2.
                    System.out.println("Приятного вечера!");
                    System.out.println("=".repeat(50));
                    System.out.println("Что-нибудь еще?");
                }
                case 3 -> System.out.println("До свидания!");
                default -> System.out.println("Ошибка ввода.");
            }
        } while (userChoice != 3); //Цикл завершается если пользователь ввел число 3.
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        Switch switchObj = new Switch();

        //Запуск методов.
        switchObj.showMenu();
    }
}