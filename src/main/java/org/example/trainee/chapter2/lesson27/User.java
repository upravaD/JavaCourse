package org.example.trainee.chapter2.lesson27;

/**
 * Этот класс представляет собой модель хранения данных о пользователе.
 */
public class User {

    /**
     * Имя.
     */
    private String name;

    /**
     * Возраст.
     */
    private int age;

    /**
     * Телефонный номер.
     */
    private int phoneNumber;

    /**
     * Пустой конструктор.
     */
    public User() {
    }

    /**
     * Конструктор со всеми полями.
     */
    public User(String name, int age, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Строковое представление объекта.
     * @return Обьект класса User в виде строки.
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
