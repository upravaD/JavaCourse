package org.example.trainee.chapter2.lesson21;

import java.util.Random;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 21: "Ключевое слово {@code static}".
 *
 * <p> В языке программирования Java ключевое слово {@code static} означает, что конкретный член принадлежит самому типу, а не экземпляру этого типа. Это означает, что мы создадим только один экземпляр этого статического члена, который будет общим для всех экземпляров класса. Мы можем применить ключевое слово к переменным, методам, блокам и вложенным классам. </p>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/modifikator-static-java">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4565">SwiftBook</href>
 **/

public class StaticCounter {
    public static void main(String[] args) { //Статический метод.

        //Цикл создания случайного количества объектов с выводом в консоль.
        for (int i = 0; i < new Random().nextInt(100); i++) {
            new POJO().printCount();
        }
    }
}

/**
 * <p> Plain Old Java Object - старый добрый Java-объект: простой объект класса, который не унаследован от какого-то специфического класса и не реализует никаких служебных интерфейсов сверх тех, которые нужны для бизнес-модели. </p>
 */
class POJO {

    /**
     * Целочисленная переменная-счетчик.
     */
    public static int count; //Статическая переменная.

    static { //Статический блок инициализации.
        count = 0;
    }

    /**
     * Конструктор класса увеличивает на 1 переменную-счетчик.
     */
    public POJO() {
        count++;
    }

    /**
     * Метод класса, который выводит в консоль значение переменной-счетчика.
     */
    public void printCount() {
        System.out.println("Количество созданных обьектов: " + count);
    }
}
