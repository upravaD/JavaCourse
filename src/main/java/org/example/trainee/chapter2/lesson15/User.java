package org.example.trainee.chapter2.lesson15;

import java.time.LocalDate;
import java.util.Formatter;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 15: "Методы в Java".
 *
 * <p> Методы в Java — это законченная последовательность действий (инструкций),
 * направленных на решение отдельной задачи.
 * По сути, это функции (они же процедуры, подпрограммы) более ранних, не ООП языков.
 * Только эти функции являются членами классов и для различия с обычными функциями,
 * согласно терминологии объектно-ориентированного программирования, называются методами. </p>
 * <p> Синтаксис:  </p>
 * <blockquote><pre>
 * {@code 'модификатор доступа' 'тип возвращаемого значения' 'имя метода' (параметры) {
 *      тело метода
 * }}
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/3305-metodih-v-java">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4559">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=ZSJS5660A2g&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=9">YouTube</href>
 **/

public class User {

    /**
     * Год рождения пользователя.
     */
    private int age;

    /**
     * Имя пользователя.
     */
    private String name;

    /**
     * Фамилия пользователя.
     */
    private String surname;

    /**
     * Электронная почта пользователя.
     */
    private String email;

    /**
     * Метод создает экземпляр класса {@code User} и инициализует его поля.
     *
     * @param age Возраст.
     * @param name Имя.
     * @param surname Фамилия.
     * @param email Почта.
     * @return Экземпляр класса {@code User}.
     */
    public static User createUser(int age, String name, String surname, String email) {
        User user = new User();
        user.age = LocalDate.now().getYear() - age;
        user.name = name;
        user.surname = surname;
        user.email = email;
        return user;
    }

    /**
     * Перегруженный метод создает экземпляр класса {@code User} и инициализует его поля.
     * На место дефолтных значений устанавливает свои значения.
     *
     * @param email Почта.
     * @return Экземпляр класса {@code User}.
     */
    public static User createUser(String email) {
        User user = new User();
        user.age = -1;
        user.name = "пусто";
        user.surname = "";
        user.email = email;
        return user;
    }

    /**
     * Перегруженный метод создает экземпляр класса {@code User}.
     * @return Экземпляр класса {@code User}.
     */
    public static User createUser() {
        return new User();
    }

    /**
     * Метод преобразует объект класс User в объект класса String.
     * Вызывать метод не нужно, теперь JVM понимает как отобразить объект в консоли,
     * чтобы было понятно человеку.
     *
     * @return Строковое представление данных.
     */
    @Override
    public String toString() {
        return new Formatter().format(
                this.getClass().getSimpleName() +
                "{ \n\tИмя: %2$s %3$s, Год рождения: %1$sг., Почта: %4$s \n}",
                age, name, surname, email).toString();
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса с помощью статического метода.
        User user1 = User.createUser(35, "Иван", "Иванов", "ivan@mail.com");
        User user2 = User.createUser("ivan@mail.com");
        User user3 = User.createUser();

        //Вывод на экран.
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
