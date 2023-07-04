package org.example.junior.chapter1.lesson5;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 5: "Цикл For".
 *
 * <h3> Цикл {@code for} или "цикл со счётчиком", позволяет выполнить набор операций заданное количество раз. По сути это наиболее часто встречаемый вид цикла в Java и используется для различных задач, например для поиска элемента в массиве или для вычисления какого-либо выражения.
 * <br>
 * <br>Синтаксис:
 * <blockquote><pre>
 *     {@code fоr} (инициализация; условие; итерация) {
 *          тело цикла
 *     }
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html">Документация Oracle</href>
 * @see <a href="https://www.youtube.com/watch?v=U0eOhyyG14k&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=6">YouTube</href>
 **/

public class ForLoops {

    /**Счетчик итераций цикла.*/
    private long count = 0;

    /**
     * Конструктор класса.
     */
    public ForLoops() {
        System.out.println("=".repeat(50));
        System.out.println("Создан обьект класса 'ForLoops'!");
        System.out.println("=".repeat(50));
    }

    /**
     * Метод запуска цикла {@code for}.
     */
    public void loop() {
        long result = 0; //Счетчик общего кол-ва итераций цикла.
        for (int i = 0; i > -1; i++) { //Параметры цикла.
            if (i % 1_000_000 == 0) { //Условие: если остаток от деления стартового значения на целое число равен 0.
                System.out.println("i = " + i);
                count++; //Инкремент переменной.
            }
            result = i; //Вынос стартового значения за пределы цикла.
        }
        System.out.println("Всего итераций выполнило условие = " + count);
        System.out.println("Всего итераций = " + result);
        System.out.println("=".repeat(50));
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        ForLoops forLoops = new ForLoops();

        //Запуск методов.
        forLoops.loop();
    }
}
