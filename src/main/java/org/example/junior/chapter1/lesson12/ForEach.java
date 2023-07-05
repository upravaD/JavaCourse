package org.example.junior.chapter1.lesson12;

import org.example.junior.chapter1.lesson11.Arrays;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 12: "Цикл {@code for-each} в Java".
 *
 * <h3> {@code For-each} — это разновидность цикла {@code for}, которая используется, когда нужно обработать все элементы массива или коллекции. {@code For each} с английского так и переводится — “для каждого”. Собственно, само словосочетание {@code for-each} в этом цикле не используется. Цикл {@code for-each} можно применить к массивам и любым классам, которые реализуют интерфейс {@code java.lang.Iterable}.
 * <br>
 * <br>Синтаксис:
 * <blockquote><pre>
 *      {@code for ('тип итерационной переменной' 'имя итерационной переменной' : имя массива) {
 *     Тело цикла;
 * }}
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/massivy-java">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4556">SwiftBook</href>
 **/

public class ForEach {

    /**
     * Массив целых чисел.
     **/
    int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    /**
     * Массив строковых значений.
     */
    String[] strings = {"H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d", "!"};

    /**
     * Конструктор класса.
     **/
    public ForEach() {
    }

    /**
     * Метод считает сумму целых чисел в массиве.
     * @param array массив целых чисел.
     * @return сумма в виде целого числа. 
     */
    public int numbersSum(int[] array) {
        int sum = 0;
        for (int number: numbers) {
            sum = sum + number;
        }
        return sum;
    }

    /**
     * Метод формирует одну строку из массива строк.
     */
    public String makeString(String[] array) {
        String result;
//        for (String str :
//                ) {
//
//        }
        return "";
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        

        //Запуск методов.
        
    }
}
