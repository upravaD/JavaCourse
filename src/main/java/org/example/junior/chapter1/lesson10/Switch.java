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
     * Экземпляр класса {@code Scanner} с параметром для ввода с клавиатуры.
     **/
    public Scanner scanner = new Scanner(System.in);

    /**
     * Переменная, которая хранит в себе возраст пользователя.
     **/
    private int userAge;

    /**
     * Конструктор класса.
     **/
    public Switch() {}

    /**Метод*/
    public void checkUserAge() {

    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        Switch switchObj = new Switch();

        //Запуск методов.
        switchObj.checkUserAge();
    }
}
