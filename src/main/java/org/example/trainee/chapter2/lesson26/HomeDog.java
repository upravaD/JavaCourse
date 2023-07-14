package org.example.trainee.chapter2.lesson26;

/**
 * Дочерний класс HomeDog реализует логику своего родителя (класса Dog), расширяет его своим полем и методом.
 */

public class HomeDog extends Dog {

    /**
     * Порода собаки.
     */
    private final String breed;

    /**
     * Конструктор дочернего класса идентичен классу родителя, но добавлет еще инициализацию поля breed.
     * @param name Имя собаки.
     * @param age Возраст собаки.
     * @param breed Порода собаки.
     */
    public HomeDog(String name, int age, String breed) {
        super(name, age); //С помощью super() вызывается конструктор суперкласса.
        this.breed = breed; //Инициализация нового параметра.
    }

    /**
     * Переопределенный уникальный метод класса Dog.
     */
    @Override
    public void bark() {
        System.out.println("Тяф-тяф!!!");
    }

    /**
     * Переопределенный метод получения информации о животном класса Animal с выводом новой информации.
     */
    @Override
    public void getInfo() {
        super.getInfo(); //Метод суперкласса.
        System.out.println("Порода: " + breed); //Свое поле.
    }
}
