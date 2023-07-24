package org.example.trainee.chapter2.lesson28; //Полный путь пакета.

import org.example.trainee.chapter2.lesson28.model1.Person; //Импорт необходимого класса.


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
 *  &nbsp                org                               <br>
 *  &ensp                 └── example                      <br>
 *  &emsp&emsp&emsp            └── trainee                 <br>
 *  &#09&nbsp                       └── chapter2           <br>
 *  &#09&emsp&emsp&emsp&nbsp             └── lesson28      <br>
 * </p>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/specs/jls/se18/html/jls-7.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/3948-kofe-breyk-165-paketih-na-jazihke-java-potokobezopasnihe-metodih-dlja-nachinajujshikh">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4573">SwiftBook</href>
 **/

public class Packages {
    public static void main(String[] args) {

        // Создаем объект Person разными способами и устанавливаем значения его полей.
        Person person1 = new Person();
        person1.setName("Василий");
        person1.setAge(30);

        org.example.trainee.chapter2.lesson28.model2.Person person2
                = new org.example.trainee.chapter2.lesson28.model2.Person("Дмитрий", 35);

        // Выводим информацию о персоне.
        System.out.println("Первый объект: класс " + person1 +
                " ,расположенный по адресу: " + person1.getClass().getPackageName());

        System.out.println("Второй объект: класс " + person2 +
                " ,расположенный по адресу: " + person2.getClass().getPackageName());
    }
}