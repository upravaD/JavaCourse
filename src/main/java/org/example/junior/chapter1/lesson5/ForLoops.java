package org.example.junior.chapter1.lesson5;

/**
 *
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 2: "Цикл For".
 *
 * <h3> Цикл {@code for} или "цикл со счётчиком", позволяет выполнить набор операций заданное количество раз. По сути это наиболее часто встречаемый вид цикла в Java и используется для различных задач, например для поиска элемента в массиве или для вычисления какого-либо выражения.
 * <br>
 * <br>Синтаксис:
 * <blockquote><pre>
 *     fоr (инициализация; условие; итерация) {
 *          тело цикла
 *     }
 * </pre></blockquote>
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html">Документация Oracle</href>
 * @author upravaD
 * @version JDK 18
 *
 **/
public class ForLoops {

    private long count = 0;

    public ForLoops() {
    }

    public void loop() {
       long result = 0;
        for (int i = 0; i > -1; i++) {
            if (i % 1_000_000 == 0) {
                System.out.println("i = " + i);
                count++;
            }
            result = i;
        }
        System.out.println("Всего итераций выполнило условий = " + count);
        System.out.println("Всего итераций = " + result);
    }
    public static void main(String[] args) {
       ForLoops forLoops = new ForLoops();
       forLoops.loop();
    }
}
