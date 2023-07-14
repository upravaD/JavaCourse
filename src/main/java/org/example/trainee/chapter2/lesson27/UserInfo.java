package org.example.trainee.chapter2.lesson27;

/**
 * Интерфейс предоставляет возможность просматривать и изменять информацию о пользователе.
 */
public interface UserInfo {

    /**
     * Посмотреть информацию о пользователе.
     * @param user Пользователь.
     */
    void getInfo(User user);

    /**
     * Изменить информацию о пользователе.
     * @param user Пользователь.
     */
    void setInfo(User user);

    /**
     * Дефолтный метод со своей реализацией обработки исключений.
     */
    default void exception(){
        System.err.println("Ошибочка вышла!!!");
    }
}
