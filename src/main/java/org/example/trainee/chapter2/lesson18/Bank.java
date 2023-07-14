package org.example.trainee.chapter2.lesson18;

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
    /**
     * Данные клиента.
     */
    private User user;

    /**
     * Номер карты клиента.
     */
    private int cardNumber;

    /**
     * Пароль для входа в систему.
     */
    private final String password = "pass";

    /**
     * Экземпляр класса {@code Scanner} с параметром {@code System.in} для ввода с клавиатуры.
     **/
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Метод валидации и регистрации клиента.
     */
    public void enter() {

        System.out.println("Добро пожаловать в Банк!");
        System.out.print("Введите пароль: ");
        String userPassword = scanner.nextLine(); //Ввод пароля с клавиатуры.

        if (!userPassword.equalsIgnoreCase(password)) { //Если введенный пароль не совпадает выводится ошибка.
            System.out.println("ERROR!!!");
        } else { //Если совпадает, то запускается процесс регистрации.
            System.out.println("Регистрация");
            System.out.println("=".repeat(50));
            setUser(scanner); //Заполнение клиентом пользовательских данных.
            setCardNumber(new Random().nextInt(0, 1_000_000_000)); //Рандомный номер карты.
        }
    }

    /**
     * Представление объекта {@code Bank} в виде строки.
     *
     * @return Возвращает объект класса {@code String}.
     */
    @Override
    public String toString() {
        return "Клиент: " + user +
                "\nНомер карты: " + cardNumber;
    }

    /**
     * Сеттер для поля {@code User}.
     *
     * @param scanner Принимает значения введенные с клавиатуры.
     */
    public void setUser(Scanner scanner) {
        this.user = User.createUser(scanner);
    }

    /**
     * Сеттер для поля {@code User}.
     *
     * @param cardNumber Принимает целочисленное ззначение.
     */
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.enter();
        System.out.println("=".repeat(50));
        System.out.println("Ваши данные: \n" + bank);
    }
}

/**
 * Класс {@code User} представляет собой карточку клиента с его личными данными.
 */
class User {

    /**
     * Имя клиента.
     */
    private String name;

    /**
     * Фамилия клиента.
     */
    private String surname;

    /**
     * Адрес клиента.
     */
    private Address address;

    /**
     * Статический метод, который создает объект {@code User} и инициализирует его поля значениями, введенными с клавиатуры.
     *
     * @param scanner Принимает значения введенные с клавиатуры.
     * @return Возвращает объект класса {@code User}.
     */
    public static User createUser(Scanner scanner) {
        User user = new User();

        System.out.print("Введите имя: ");
        user.setName(scanner.nextLine());

        System.out.print("Введите фамилию: ");
        user.setSurname(scanner.nextLine());

        user.setAddress(Address.createAddress(scanner));

        return user;
    }

    /**
     * Сеттер для поля name.
     *
     * @param name Строковое значение.
     */
    public void setName(String name) {
        if (name.isEmpty()) { //Проверка на пустое значение.
            System.out.println("Вы ввели пустое имя");
        } else {
            this.name = name;
        }
    }

    /**
     * Сеттер для поля surname.
     *
     * @param surname Строковое значение.
     */
    public void setSurname(String surname) {
        if (surname.isEmpty()) { //Проверка на пустое значение.
            System.out.println("Вы ввели пустую фамилию");
        } else {
            this.surname = surname;
        }
    }

    /**
     * Сеттер для объекта Address.
     *
     * @param address Экземпляр класса Address.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Представление объекта {@code User} в виде строки.
     *
     * @return Возвращает объект класса {@code String}.
     */
    @Override
    public String toString() {
        return name + " " + surname +
                "\nАдрес: " + address;
    }
}

/**
 * Класс {@code Address} представляет собой составной адрес клиента.
 */
class Address {

    /**
     * Город.
     */
    private String city;

    /**
     * Улица.
     */
    private String street;

    /**
     * Дом.
     */
    private int house;

    /**
     * Статический метод, который создает объект {@code Address} и инициализирует его поля значениями, введенными с клавиатуры.
     *
     * @param scanner Принимает значения введенные с клавиатуры.
     * @return Возвращает объект класса {@code Address}.
     */
    public static Address createAddress(Scanner scanner) {
        Address address = new Address();

        System.out.print("Введите город: ");
        address.setCity(scanner.nextLine());

        System.out.print("Введите улицу: ");
        address.setStreet(scanner.nextLine());

        System.out.print("Введите дом: ");
        address.setHouse(scanner.nextInt());

        return address;
    }

    /**
     * Сеттер для поля city.
     *
     * @param city Строковое значение.
     */
    public void setCity(String city) {
        if (city.isEmpty()) { //Проверка на пустое значение.
            System.out.println("Вы ввели пустую город");
        } else {
            this.city = city;
        }
    }

    /**
     * Сеттер для поля street.
     *
     * @param street Строковое значение.
     */
    public void setStreet(String street) {
        if (street.isEmpty()) { //Проверка на пустое значение.
            System.out.println("Вы ввели пустую фамилию");
        } else {
            this.street = street;
        }
    }

    /**
     * Сеттер для поля house.
     *
     * @param house Целочисленное значение.
     */
    public void setHouse(int house) {
        this.house = house;
    }

    /**
     * Представление объекта {@code Address} в виде строки.
     *
     * @return Возвращает объект класса {@code String}.
     */
    @Override
    public String toString() {
        return city + ", " + street + ", " + house;
    }
}