package org.example.trainee.chapter2.lesson27;

import java.util.Scanner;

/**
 * Этот класс представляет собой сервис в котором реализованы все возможности пользователя для работы в программе.
 */
public class UserInfoService implements UserInfo, Service {

    /**
     * Метод выводит в консоль все даные о пользователе.
     * @param user Пользователь.
     */
    @Override
    public void getInfo(User user) {
        System.out.println("Имя пользователя: " + user.getName());
        System.out.println("Возраст пользователя: " + user.getAge());
        System.out.println("Номер телефона пользователя: " + user.getPhoneNumber());
        System.out.println("=".repeat(50));
    }

    /**
     * Метод изменяет данные о пользователе с помощью ввода с клавиатуры.
     * @param user Пользователь.
     */
    @Override
    public void setInfo(User user) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        user.setName(scanner.nextLine());

        System.out.print("Введите возраст: ");
        user.setAge(scanner.nextInt());

        System.out.print("Введите номер телефона: ");
        user.setPhoneNumber(scanner.nextInt());

        System.out.println("=".repeat(50));
    }

    /**
     * Метод выводит в консоль сообщение конкретному пользователю.
     * @param message Сообщение.
     * @param user Пользователь.
     */
    @Override
    public void sendMessage(String message, User user) {
        System.out.println("Ваше сообщение для пользователя " + user.getName() + ": " + message);
    }

    /**
     * Метод имитирует звонок другому пользователю.
     * @param user Пользователь.
     */
    @Override
    public void call(User user) {
        System.out.println("Звоню пользователю " + user.getName() + " .....");

        //Имитация набора номера.
        for (int i = 0; i < 15; i++) {
            System.out.print("."); //Выводит точку.
            try {
                Thread.sleep(500); //Потом поток ждет половину секунды.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        exception(); //Своя обработка исключений.
    }

    /**
     * Метод создает нового пользователя с 3 параметрами.
     * @param name Имя.
     * @param age Возраст.
     * @param phoneNumber Телефонный номер.
     * @return Обьект класса User.
     */
    @Override
    public User createUser(String name, int age, int phoneNumber) {
        return new User(name, age, phoneNumber);
    }

    /**
     * Кастомная обработка исключения.
     */
    @Override
    public void exception() {
        UserInfo.super.exception();
    }
}
