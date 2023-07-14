package org.example.trainee.chapter2.lesson27;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 27: "Интерфейсы."
 *
 * <p>
 * Интерфейс на языке программирования Java представляет собой абстрактный тип,
 * который используется для объявления поведения, которое должны реализовывать классы.
 * Они похожи на протоколы. Интерфейсы объявляются с использованием ключевого слова и
 * могут содержать только сигнатуру метода и объявления констант.
 * Все методы интерфейса не содержат реализации во всех версиях Java ниже 8.
 * Начиная с Java 8, методы могут иметь реализацию в определении.
 * Затем, в Java 9, были добавлены методы и в настоящее время интерфейс Java может иметь до шести различных типов.
 * </p>
 *
 * <p> Синтаксис: </p>
 * <blockquote><pre>
 *   {@code
 *    модификатор доступа interface Имя интерфейса {}
 *   }
 * </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/quests/lectures?quest=QUEST_JAVA_CORE&level=4">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4572">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=GmDKSrKut8I&list=PLEgFBkSxIsb9mkcPjfHnY0wRI8zdMCKsV&index=3">YouTube</href>
 **/
public class Interfaces {
    public static void main(String[] args) {

        //Создание объектов.
        UserInfoService userInfoService = new UserInfoService(); //Сервис.
        User user1 = new User(); //Первый пользователь с пустыми полями.
        User user2 = userInfoService.createUser("Александр", 25, 2581474); //Второй заполненный пользователь.

        //Вывод информации о пользователях.
        userInfoService.getInfo(user1);
        userInfoService.getInfo(user2);

        //Изменение информации.
        userInfoService.setInfo(user1);
        userInfoService.getInfo(user1); //Вывод измененной информации.

        //Отправка сообщения пользователю.
        userInfoService.sendMessage("Привет", user2);

        //Звонок другому пользователю.
        userInfoService.call(user2);



    }
}
