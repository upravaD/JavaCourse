package org.example.junior.chapter2.lesson15;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 15: "Методы в Java".
 *
 * <p> Методы в Java — это законченная последовательность действий (инструкций), направленных на решение отдельной задачи. По сути, это функции (они же процедуры, подпрограммы) более ранних, не ООП языков. Только эти функции являются членами классов и для различия с обычными функциями, согласно терминологии объектно-ориентированного программирования, называются методами. </p>
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
     * Возраст пользователя.
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
     * Метод создает экземпляр класса {@code User} и инициализует его поля. Метод сделан статическим в учебных целях.
     * @param age Возраст.
     * @param name Имя.
     * @param surname Фамилия.
     * @param email Почта.
     * @return Экземпляр класса {@code User}.
     */
    public static User createUser(int age, String name, String surname, String email) {
        User user = new User();
        user.age = age;
        user.name = name;
        user.surname = surname;
        user.email = email;
        return user;
    }

    /**
     * Метод преобразует объект класс User в объект класса String. Вызывать метод не нужно, теперь JVM понимает как отобразить объект в консоли, чтобы было понятно человеку.
     * @return Строковое представление данных.
     */
    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса с помощью статического метода.
        User user = User.createUser(35, "Андрей", "Федоров", "daktah@icloud.com");
        System.out.println(user);
    }
}
