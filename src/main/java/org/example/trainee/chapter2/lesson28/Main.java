package org.example.trainee.chapter2.lesson28; //Полный путь пакета.

import org.example.trainee.chapter2.lesson28.model.Person; //Импорт необходимого класса.
import org.example.trainee.chapter2.lesson28.model.*; //Импорт всех классов из пакета.

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 28: "Пакеты."
 *
 * <p>
 *  В Java пакеты используются для организации классов и интерфейсов в иерархическую структуру.
 *  Пакеты позволяют логически сгруппировать связанные классы,
 *  что облегчает управление и структурирование больших проектов.
 *
 *  <p>package org.example.trainee.chapter2.lesson28;</p>
 *  <p>
 *  org
 *   └── example
 *       └── trainee
 *           └── chapter2
 *               └── lesson28
 * </p>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/specs/jls/se18/html/jls-7.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/3948-kofe-breyk-165-paketih-na-jazihke-java-potokobezopasnihe-metodih-dlja-nachinajujshikh">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4573">SwiftBook</href>
 **/

public class Main {
    public static void main(String[] args) {

        // Создаем объект Person разными способами и устанавливаем значения его полей.
        Person person1 = new Person();
        person1.setName("Василий");
        person1.setAge(30);

        Person person2 = new Person("Петр", 35);

        // Выводим информацию о персоне.
        System.out.println("Первый объект: " + person1);
        System.out.println("Второй объект: " + person2);
    }
}