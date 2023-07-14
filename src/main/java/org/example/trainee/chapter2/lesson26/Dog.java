package org.example.trainee.chapter2.lesson26;

/**
 * Дочерний класс Dog реализует логику своего родителя (класса Animal) и расширяет его своим методом.
 */
public class Dog extends Animal {

    /**
     * Конструктор дочернего класса идентичен классу родителя.
     * @param name Имя животного.
     * @param age Возраст животного.
     */
    public Dog(String name, int age) {
        super(name, age); //С помощью super() вызывается конструктор суперкласса.
    }

    /**
     * Уникальный метод класса Dog.
     */
    public void bark() {
        System.out.println("Гав-гав!!!");
    }
}
