package org.example.junior.chapter1.lesson12;

import java.util.Arrays;

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
     * Метод считает сумму целых чисел в массиве.
     * @param array Массив целых чисел.
     * @return Сумма в виде целого числа.
     */
    public int numbersSum(int[] array) {
        int sum = 0;
        for (int number: array) { //Для каждого элемента массива array.
            sum = sum + number;
        }
        return sum;
    }

    /**
     * Метод формирует одну строку из массива строк.
     * @param array Массив строк.
     * @return Строка склеенная из ячеек массива.
     */
    public String makeString(String[] array) {
        String result = "";
        for (String str : array) { //Для каждого элемента массива array.
            result = result.concat(str);
        }
        return result;
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        ForEach forEach = new ForEach();

        //Запуск методов.
        //numbersSum()
        System.out.println("=".repeat(50));
        int sum = forEach.numbersSum(forEach.numbers);
        System.out.println("Массив чисел: " + Arrays.toString(forEach.numbers));
        System.out.println("Сумма всех чисел массива: " + sum);

        //makeString()
        System.out.println("=".repeat(50));
        String str = forEach.makeString(forEach.strings);
        System.out.println("Массив строк: " + Arrays.toString(forEach.strings));
        System.out.println("Все ячейки массива в одной строке: " + str);
    }
}