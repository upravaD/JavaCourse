package org.example.trainee.chapter2.lesson28.model1;

/**
 * Класс данных о пользователе.
 */
public class Person {

    //Поля класса.

    private String name;
    private int age;

    //Конструкторы.

    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Геттеры и сеттеры.

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Строковое представление объекта.
     * @return Обьект класса Person в виде строки.
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}