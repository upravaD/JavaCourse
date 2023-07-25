package org.example.trainee.chapter2.lesson30;

/**
 * Родительский класс.
 */
class Animal {

    /**
     * Единственный метод класса с общей реализацией для всех потомков.
     */
    void eat() {         //Имя класса где вызывается метод.
        System.out.println(this.getClass().getSimpleName() + " кушает.");
    }
}