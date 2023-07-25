package org.example.trainee.chapter2.lesson30;

/**
 * Класс-потомок.
 */
public class Cat extends Animal implements Soundable {

    /**
     * Метод использует реализацию родительского класса.
     */
    @Override
    void eat() {
        super.eat();
    }

    /**
     * Реализация метода интерфейсса Soundable.
     */
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}
