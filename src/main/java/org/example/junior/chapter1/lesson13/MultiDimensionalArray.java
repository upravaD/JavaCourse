package org.example.junior.chapter1.lesson13;

import java.util.Random;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 13: "Многомерные массивы в Java".
 *
 * <h3> Многомерный массив в Java — это массив, состоящий из массивов разного размера в качестве элементов. Его также называют «массивом массивов», «рваным массивом» или «зубчатым массивом».
 * <h3> Двумерный массив в Java — это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив. Но гораздо проще его представить в виде таблицы, у которой задано количество строк (первое измерение) и количество столбцов (второе измерение). Двумерный массив, у которого все строки имеют равное количество элементов, называется прямоугольным.
 * <p><img height="253" title="Array" src="https://cdn.javarush.com/images/article/74510010-a2a6-4f1a-91a2-22a6ccf5a4b8/800.webp"></p>
 * <br>
 * <h3> Трёхмерный массив в Java - следуя здравому смыслу и логике языка Java, трёхмерным массивом можно назвать "массив массивов массивов" или "массив, каждым элементом которого является двумерный массив". Причём эти двумерные массивы могут быть разными.
 * <p><img height="329" title="Array" src="https://cdn.javarush.com/images/article/7740a988-d0ac-44dc-a545-afd09aaf7e03/800.webp"><p/>
 * Синтаксис:
 * <blockquote><pre>
 * {@code Data_type[dim1][dim2][]..[dimN] array_name = new data_type[size1][size2]….[sizeN];
 *
 *  Где "Data_type" — это тип элементов в массиве. Может быть примитивным или ссылочным.
 *  Количество пар скобок с "dim" внутри — размерность массива (в нашем случае — "N").
 *  "array_name" —  название массива.
 *  "size1...sizN" — количество элементов в каждом из измерений массива.
 * }
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/mnogomernye-massivy">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4557">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=BU-4vAlQwxc&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=8">YouTube</href>
 **/

public class MultiDimensionalArray {

    /**
     * Двумерный массив размером 3х3.
     */
    private final int[][] twoDimArray = new int[3][3];

    /**
     * Трехмерный массив размером 3х2 и глубиной 5.
     */
    public boolean[][][] parking = new boolean[3][2][5];

    /**
     * Всего мест на парковке.
     */
    private final int freePlaces = parking.length * parking[0].length * parking[0][0].length;

    /**
     * Метод вывода двумерного массива в консоль в виде матрицы.
     */
    public void printMatrix() {

        initMatrix(twoDimArray); //Инициализация массива.

        System.out.println("Матрица: ");
        System.out.println("-".repeat(50));

        for (int[] ints : twoDimArray) { //Цикл проходится по строкам.
            for (int anInt : ints) { //Цикл проходится по столбцам.

                System.out.print(anInt + " "); //Вывод строки матрицы в консоль.
            }
            System.out.println(); //Переход на новую строку
        }
    }

    /**
     * Метод инициализации двумерного массива.
     * @param array Целочисленный двумерный массив.
     */
    private void initMatrix(int[][] array) {

        int value = new Random().nextInt(10,20); //Значение ячейки массива.

        for (int i = 0; i < array.length; i++) { //Цикл проходится по строкам.
            for (int j = 0; j < array[i].length; j++) { //Цикл проходится по столбцам.

                array[i][j] = value * value++; //Сохранение значения в ячейку массива.
            }
        }
    }

    /**
     * Метод представляет собой парковку машин. На этой парковке есть 3 этажа, на каждом из которых можно поместить 2х5 = 10 машин. По умолчанию все ячейки пусты (false). {@code parkingLot[0][1][0]} - первый элемент это "Этаж", второй это "Сторона"(левая или правая), третий это "Номер парковочного места".
     */
    public void showParking() {

        randomInitParking(parking);//Приехало случайное количество машин и припарковались на разных этажах в разных ячейках.

        System.out.println("Парковка: ");
        System.out.println("-".repeat(50));

        int countOccupiedPlaces = 0; //Количество занятых мест.

        //Вывод массива в консоль.
        for (int i = 0; i < parking.length; i++) { //Этаж.
            for (int j = 0; j < parking[i].length; j++) { //Сторона.
                for (int k = 0; k < parking[i][j].length; k++) { //Место.

                    System.out.print("Этаж[" + i + "]сторона[" + j + "]место[" + k + "] = " + parking[i][j][k] + "\t");

                    if (parking[i][j][k]) { //Если место занято,
                        countOccupiedPlaces++; //то увеличиваем счетчик.
                    }
                }
                System.out.println();
            }
        }
        System.out.println("-".repeat(50));
        System.out.println("Всего приехало машин: " + countOccupiedPlaces);
        System.out.println("Осталось свободных парковочных мест: " + (freePlaces - countOccupiedPlaces));
    }

    /**
     * Метод инициализации трехмерного массива.
     * @param array Логический трехмерный массив.
     */
    private void randomInitParking(boolean[][][] array) {
        for (int i = 0; i <= freePlaces; i++) { //Цикл ограничен общим количеством мест на парковке.
            parking[new Random().nextInt(0, array.length)] //Этаж.
                   [new Random().nextInt(0, array[0].length)] //Сторона.
                   [new Random().nextInt(0, array[0][0].length)] //Место.
                   = true;
        }
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        MultiDimensionalArray multi = new MultiDimensionalArray();

        //Запуск методов.
        //printMatrix()
        System.out.println("=".repeat(50));
        multi.printMatrix();

        //showParking()
        System.out.println("=".repeat(50));
        multi.showParking();
    }
}