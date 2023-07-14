package org.example.trainee.chapter1.lesson11;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 11: "Массивы в Java".
 *
 * <h3> Массив — это структура данных, в которой хранятся элементы одного типа. Его можно представить, как набор пронумерованных ячеек, в каждую из которых можно поместить какие-то данные (один элемент данных в одну ячейку). Доступ к конкретной ячейке осуществляется через её номер. Номер элемента в массиве также называют индексом.
 * <br>
 * <br>Синтаксис:
 * <blockquote><pre>
 *      {@code тип данных[] название массива = new тип данных[длина массива];}
 * </pre></blockquote>
 *
 * <img height="200" title="Array" src="https://cdn.javarush.com/images/article/acba6bd7-9fa3-49d8-8376-29eee1cf837b/800.webp">
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/massivy-java">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4555">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=8VMxbOiiqCY&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=7">YouTube</href>
 **/

public class Arrays {

    /**
     * Массив из целых чисел.
     **/
    public int[] array;

    /**
     * Метод ручной инициализации массива с помощью блока инициализации.
     **/
    public void lazyInit() {
        System.out.println("Блок инициализации: ");
        {
            array = new int[10];
            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
            array[3] = 4;
            array[4] = 5;
            array[5] = 6;
            array[6] = 7;
            array[7] = 8;
            array[8] = 9;
            array[9] = 10;
        }
    }

    /**
     * Метод инициализации массива с помощью фигурных скобок.
     * @return проинициализированный массив из целых чисел.
     **/
    public int[] simpleInit() {
        System.out.println("Инициализация с помощью фигурных скобок: ");
        int[] arrayTemp = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        return array = arrayTemp;
    }

    /**
     * Метод инициализации массива с помощью цикла {@code for}.
     * @see org.example.trainee.chapter1.lesson5.ForLoops
     * @return проинициализированный массив из целых чисел.
     **/
    public int[] cycleInit() {
        System.out.println("Инициализация с помощью цикла: ");
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 100;
        }
        return array;
    }

    /**
     * Метод выводит данные массива в консоль.
     * @param array массив целых чисел.
     **/
    public void printArray(int[] array) {
        System.out.println("Длина массива: " + array.length);
        System.out.println("Содержимое массива: " + java.util.Arrays.toString(array));
        System.out.println("=".repeat(50));
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        Arrays arraysObj = new Arrays();

        //Запуск методов.
        //1
        arraysObj.lazyInit();
        arraysObj.printArray(arraysObj.array);
        //2
        arraysObj.printArray(arraysObj.simpleInit());
        //3
        arraysObj.printArray(arraysObj.cycleInit());
    }
}