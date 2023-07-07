package org.example.junior.chapter2.lesson18;

import java.util.Random;
import java.util.Scanner;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 18: "Инкапсуляция. Сеттеры и Геттеры".
 *
 * <p> Инкапсуляция - это свойство системы, позволяющее объединить данные и методы, работающие с ними, в классе и скрыть детали реализации от пользователя, открыв только то, что необходимо при последующем использовании. Цель инкапсуляции — уйти от зависимости внешнего интерфейса класса (то, что могут использовать другие классы) от реализации. Чтобы малейшее изменение в классе не влекло за собой изменение внешнего поведения класса. </p>
 * <p> Сеттер — метод, используемый в объектно-ориентированном программировании для присвоения какого-либо значения инкапсулированному полю, например, обработав при этом недопустимые присваивания. Часто реализуется в паре с методом - геттером, позволяющим получать значение поля класса. </p>
 * <p> Геттер — это метод, который возвращает (от слова get) нам значение какого-то поля. </p>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/concepts/">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/1969-principih-inkapsuljacii">JavaRush Инкапсуляция</href>
 * @see <a href="https://javarush.com/groups/posts/1928-getterih-i-setterih">JavaRush Геттеры и Сеттеры</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4562">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=DiCrMi94HXk&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=12">YouTube</href>
 **/

public class Bank {
    private User user;
    private int cardNumber;
    private final String password = "pass";
    private final Scanner scanner = new Scanner(System.in);

    public void enter() {
        System.out.print("Введите пароль: ");
        String userPassword = scanner.nextLine();
        if (!userPassword.equalsIgnoreCase(password)) {
            System.out.println("ERROR!!!");
        } else {
            setUser(scanner);
            setCardNumber(new Random().nextInt());
        }
    }

    @Override
    public String toString() {
        return "Клиент: " + user +
                "\nНомер карты: " + cardNumber;
    }

    public void setUser(Scanner scanner) {
        this.user = User.createUser(scanner);
    }

    public int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.enter();
        System.out.println("Ваши данные: \n" + bank);
    }
}

class User {
    private String name;
    private String surname;
    private Address address;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static User createUser(Scanner scanner) {
        User user = new User();
        System.out.print("Введите имя: ");
        user.name = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        user.surname = scanner.nextLine();
        user.address = Address.createAddress(scanner);
        return user;
    }

    @Override
    public String toString() {
        return name + " " + surname +
                "\nАдрес: " + address;
    }
}

class Address {
    private String city;
    private String street;
    private int house;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public static Address createAddress(Scanner scanner) {
        Address address = new Address();
        System.out.print("Введите город: ");
        address.city = scanner.nextLine();
        System.out.print("Введите улицу: ");
        address.street = scanner.nextLine();
        System.out.print("Введите дом: ");
        address.house = scanner.nextInt();
        return address;
    }

    @Override
    public String toString() {
        return city + " " + street + " " + house;
    }
}