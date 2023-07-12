package org.example.junior.chapter2.lesson20;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 20: "Конструкторы".
 *
 * <p> Конструктор — специальный метод, отвечающий за создание нового объекта. Конструктор не имеет возвращаемого типа и называется так же, как класс, объект которого он создает. При этом один и тот же класс может иметь несколько конструкторов, отличающихся набором параметров. </p>
 * <p> Синтаксис:  </p>
 * <blockquote><pre>
 *  {@code 'модификатор доступа' 'имя конструктора' (параметры) {
 *       тело конструктора
 *  }}
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/konstruktory-v-java-1">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4564">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=O8BZ_HwMqQA&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=13">YouTube</href>
 **/

public class ClassConstructor {

    /**
     * Целочисленная переменная.
     */
    private int number;

    /**
     * Строковая переменная.
     */
    private String text;

    /**
     * Пустой конструктор класса.
     */
    public ClassConstructor() {
    }

    /**
     * Переопределенный конструктор с одним параметром.
     * @param number Целое число.
     */
    public ClassConstructor(int number) {
        this.number = number;
    }

    /**
     * Переопределенный конструктор со всеми параметрами класса.
     * @param number Целое число.
     * @param text Строковые данные.
     */
    public ClassConstructor(int number, String text) {
        this.number = number;
        this.text = text;
    }

    @Override
    public String toString() {
        return "ClassConstructor{" +
                "number=" + number +
                ", text='" + text + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ClassConstructor emptyParameter = new ClassConstructor();
        System.out.println("Пустой конструктор: " + emptyParameter);
        ClassConstructor oneParameter = new ClassConstructor(1);
        System.out.println("Конструктор с одним параметром: " + oneParameter);
        ClassConstructor allParameter = new ClassConstructor(2, "text");
        System.out.println("Конструктор со всеми параметрами: " + allParameter);
    }
}