package org.example.junior.chapter1.lesson6;

import java.util.Random;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 6: "Операторы If и Else".
 *
 * <h3> Оператор {@code if} является основным оператором выбора в Java и позволяет выборочно изменять ход выполнения программы - и это одно из основных отличий между программированием и простым вычислением.
 * Оператор {@code if} начинается с ключевого слова {@code if}. Ключевое слово {@code if} должно сопровождаться логическим выражением, заключённым в круглые скобки.
 * <br>
 * <br>Синтаксис:
 * <blockquote><pre>
 *     Простая форма:
 *
 *     {@code if} ({@code условие}) {  //Если условие истинно, то выполняется оператор.
 *        {@code оператор};
 *     }
 *
 *     Обработка ложного условия:
 *
 *     {@code if} ({@code условие}) { //Если условие истинно, то выполняется оператор {@code if}.
 *        {@code оператор};
 *     } {@code else} {      //Если условие ложно, то выполняется оператор {@code else}.
 *        {@code оператор};
 *     }
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/quests/lectures?quest=QUEST_JAVA_SYNTAX&level=4">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4550">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=z4AcfYGvgYA&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=4">YouTube</href>
 **/

public class IfElse {

    /**
     * Числовая переменная.
     */
    private final int myInt = 25;

    /**
     * Генератор рандомных чисел.
     * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html">Документация Oracle</href>
     * */
    public int random = new Random().nextInt(myInt*2);

    /**
     * Конструктор класса.
     */
    public IfElse() {
    }

    /**
     * Метод выводит в консоль разный результат, в зависимости от параметра.
     * @param random случайное целое число.
     */
    public void randomResult(int random) {

        if (myInt > random) {
            System.out.println("Рандомное число меньше.");

        } else if (myInt < random) {
            System.out.println("Рандомное число больше.");

        } else {
            System.out.println("Условия не были выполнены.");
        }
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        IfElse ifElse = new IfElse();

        //Запуск методов.
        ifElse.randomResult(ifElse.random);
    }
}
