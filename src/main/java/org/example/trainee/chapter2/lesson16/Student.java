package org.example.trainee.chapter2.lesson16;

import java.time.Year;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 16: "Типы возвращаемого значения и параметры метода".
 *
 * <p> Возвращаемое значение — это данные (некий результат выполнения метода), которые приходят на его место после вызова. </p>
 * <p> Параметры - это переменные, определенные в объявлении метода после имени метода, внутри круглых скобок. Сюда входят примитивные типы, такие как int, float, boolean и т.д., а также непримитивные или объектные типы, такие как массив, строка и т.д. Вы можете передавать значения (аргумент) параметрам метода при вызове метода. </p>
 * <p> Синтаксис:  </p>
 * <blockquote><pre>
 * {@code 'модификатор доступа' 'тип возвращаемого значения' 'имя метода' (параметры) {
 *      тело метода
 * }}
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/3305-metodih-v-java">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4560">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=ZSJS5660A2g&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=9">YouTube</href>
 **/

public class Student {

    /**
     * Год рождения.
     */
    private int yearOfBirth;

    /**
     * Полное имя.
     */
    private String fullName;

    /**
     * Внутренний метод, который производит расчет года рождения.
     * @param age Текущий возраст студента.
     * @return Год рождения в виде целого числа.
     */
    private int calculateYearOfBirth(int age) {
        return Year.now().getValue() - age;
    }

    /**
     * Внутренний метод, который формирует полное имя студента.
     * @param name Имя студента.
     * @param surname Фамилия студента.
     * @return Полное имя в виде строки.
     */
    private String createFullName(String name, String surname) {
        return name + " " + surname;
    }

    /**
     * Метод инициализации полей класса Student.
     * @param age Текущий возраст студента.
     * @param name Имя студента.
     * @param surname Фамилия студента.
     */
    public void initStudent(int age, String name, String surname) {
        this.yearOfBirth = calculateYearOfBirth(age);
        this.fullName = createFullName(name, surname);
    }

    /**
     * @return Представление объекта в виде строки.
     */
    @Override
    public String toString() {
        return "Student{ " +
                "yearOfBirth = " + yearOfBirth +
                ", fullName = '" + fullName + '\'' +
                '}';
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса Student.
        Student student = new Student();

        //Запуск методов класса.
        student.initStudent(35, "Андрей", "Федоров");
        System.out.println(student);
    }
}
