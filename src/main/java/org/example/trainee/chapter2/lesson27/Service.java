package org.example.trainee.chapter2.lesson27;

/**
 * Интерфейс предоставляет возможность пользователю звонить или отправлять сообщения.
 */
public interface Service {

    /**
     * Отправка сообщения.
     * @param message Сообщение.
     * @param user Пользователь.
     */
    void sendMessage(String message, User user);

    /**
     * Звонок.
     * @param user Пользователь.
     */
    void call(User user);

    /**
     * Метод регистрирует нового пользователя.
     * @param name Имя.
     * @param age Возраст.
     * @param phoneNumber Телефонный номер.
     * @return Экземпляр класса User.
     */
    User createUser(String name, int age, int phoneNumber);
}
