package org.example.trainee.chapter2.lesson30;

/**
 * Класс-потомок.
 */
class Dog extends Animal implements Soundable {

    //Если мы не переопределяем метод eat() родительского класса,
    //то он также будет нам доступен после создания объекта.

    /**
     * Реализация метода интерфейсса Soundable.
     */
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}