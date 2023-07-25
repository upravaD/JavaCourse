package org.example.trainee.chapter3.lesson33;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 3: "Преобразование типов."
 * <h3> Lesson 33: "Восходящее и нисходящее преобразование."
 *
 * <p>
 *  В Java, восходящее и нисходящее преобразование относится к преобразованию типов
 *  между классами в иерархии наследования. Эти преобразования осуществляются
 *  с помощью операторов и выполняются в соответствии с отношением "родительский класс - подкласс".
 * <p\>
 *
 * <blockquote><pre>
 *   {@code
 *    1. "Восходящее преобразование" (Upcasting):
 *    Восходящее преобразование позволяет преобразовать объект подкласса в объект его родительского класса.
 *    Это преобразование всегда безопасно,
 *    так как объект на самом деле является экземпляром подкласса и имеет все свойства и методы родительского класса.
 *
 *    2. "Нисходящее преобразование" (Downcasting):
 *    Нисходящее преобразование позволяет преобразовать объект родительского класса обратно в объект его подкласса.
 *    Нисходящее преобразование не всегда безопасно и может привести к ошибке времени выполнения (ClassCastException),
 *    если объект фактически не является экземпляром подкласса.
 *   }
 *  </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://javarush.com/quests/lectures?quest=QUEST_JAVA_CORE&level=7">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4578">SwiftBook</href>
 **/

public class UpDownCasting {

    /**
     * В этом примере мы создаем объект dog типа Dog и выполняем восходящее преобразование,
     * преобразуя его в объект animal типа Animal. Затем мы вызываем метод sound() для объекта animal,
     * который вызывает реализацию из класса Dog.
     * Далее, мы выполняем нисходящее преобразование, проверяя,
     * является ли объект animal экземпляром класса Dog с помощью оператора instanceof.
     * Если это так, мы преобразуем объект animal обратно в объект dog типа Dog.
     * После этого мы вызываем методы sound() и fetch() для объекта dog, которые принадлежат классу Dog.
     */
    public static void main(String[] args) {

        // Восходящее преобразование (Upcasting).
        Animal animal = new Dog(); // Dog преобразуется в Animal.
        animal.sound(); // Вызывается метод из класса Dog.

        // Нисходящее преобразование (Downcasting)
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Animal преобразуется в Dog.
            dog.sound(); // Вызывается метод из класса Dog.
            dog.fetch();
        } else {
            System.out.println("Animal is not a Dog"); // Обработка исключений.
        }
    }

}

class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof!");
    }

    void fetch() {
        System.out.println("Fetching a ball");
    }
}