package org.example.trainee.chapter2.lesson26;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 26: "Наследование."
 *
 * <p>
 * Наследование — это механизм, который позволяет создавать классы на основе других классов.
 * Это дает возможность расширять свойства наследуемого класса, и сохранять
 * работоспособность ранее написанного кода. Все классы в мире java,
 * косвенно или прямо, являются наследниками класса Object.
 * </p>
 *
 * <p> Синтаксис: </p>
 *  <blockquote><pre>
 *   {@code
 *    class Потомок extends Родитель
 *   }
 *  </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/quests/lectures/questsyntaxpro.level07.lecture06">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4570">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=DiCrMi94HXk&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=12&t=4520s">YouTube</href>
 **/
public class Inheritance {
    public static void main(String[] args) {

        //Создание экземпляра класса Animal и запуск его методов.
        Animal animal = new Animal("Ангел", 2000);
        animal.eat();
        animal.sleep();
        animal.getInfo();

        System.out.println("=".repeat(50));

        //Создание экземпляра класса Dog и запуск его методов.
        Dog dog = new Dog("Барбос", 10);
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.getInfo();

        System.out.println("=".repeat(50));

        //Создание экземпляра класса HomeDog и запуск его методов.
        HomeDog homeDog = new HomeDog("Агра", 15, "Ротвейлер");
        homeDog.eat();
        homeDog.sleep();
        homeDog.bark();
        homeDog.getInfo();

        System.out.println("=".repeat(50));

        //Тест на ошибки.
        new Animal("", -500000);
    }
}
