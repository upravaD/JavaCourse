package org.example.trainee.chapter2.lesson30;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 28: "Модификаторы доступа."
 *
 * <p>
 *  В Java, полиморфизм представляет собой один из четырех основных принципов
 *  объектно-ориентированного программирования (ООП),
 *  который позволяет объектам одного типа проявлять различное поведение на основе контекста,
 *  в котором они используются. Полиморфизм способствует упрощению кода,
 *  повышению гибкости и повторному использованию,
 *  что делает его важным концептом в разработке программного обеспечения.
 * <p\>
 *
 * <p>
 *  В Java полиморфизм реализуется через два механизма:
 * </p>
 *
 * <blockquote><pre>
 *   {@code
 *    1. Переопределение методов (Method Overriding):
 * Переопределение метода возможно при наличии иерархии классов,
 * когда у наследника есть метод с тем же именем и сигнатурой (типом аргументов),
 * что и у родителя. Когда вызывается метод у объекта, JVM определяет,
 * какая версия метода будет вызвана на основе типа объекта, который его вызывает,
 * а не на основе типа переменной, которой он присвоен.
 *
 *    2. Использование интерфейсов:
 * Интерфейс - это контракт, который определяет набор абстрактных методов,
 * которые классы должны реализовать. При использовании интерфейсов можно создавать объекты,
 * которые соответствуют определенному интерфейсу, и обращаться к объектам через ссылки на этот интерфейс.
 * Таким образом, можно достичь различного поведения, определенного методами интерфейса,
 * даже если объекты принадлежат разным классам.
 *   }
 *  </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/polimorfizm-v-java">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4575">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=6WEQqiQTIKE&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=18&t=38s">YouTube</href>
 **/

public class Polymorphism {

    /**
     * Статический метод для упрощенного вызова метода eat() класса Animal.
     * @param animal Любое животное.
     */
    static void eat(Animal animal) {
        animal.eat();
    }

    /**
     * Статический метод для упрощенного вызова метода makeSound() интерфейса Soundable.
     * @param soundable Любое животное, которое умеет издавать звук.
     */
    static void makeSound(Soundable soundable) {
        soundable.makeSound();
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создаем объекты и вызываем их методы через наследование класса Animal.
        eat(new Dog());
        eat(new Cat());

        //Создаем объекты и вызываем их методы через имплементацию интерфейса Soundable.
        makeSound(new Dog());
        makeSound(new Cat());

    }
}
