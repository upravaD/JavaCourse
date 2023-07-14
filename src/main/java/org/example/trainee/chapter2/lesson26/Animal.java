package org.example.trainee.chapter2.lesson26;

/**
 * Это родительский класс для всех животных.
 * В этом классе собраны все поля, которые могут встретится у всех его потомков.
 * Еще в этом классе определено общее поведение для всех животных.
 */
public class Animal {

    /**
     * Переменная хранящая в себе простое имя класса.
     */
    private final String className;

    /**
     * Имя животного.
     */
    private String name;

    /**
     * Возраст животного.
     */
    private int age;

    /**
     * Конструктор класса Animal инициализурует поля после создания экземпляра класса.
     * @param name Имя животного.
     * @param age Возраст животного.
     */
    public Animal(String name, int age) {
        this.className = this.getClass().getSimpleName(); //Методы класса Object.
        setName(name);
        setAge(age);
    }

    /**
     * С помощью этого метода животное начинает кушать.
     */
    public void eat() {
        System.out.println(className + " кушает.");
    }


    /**
     * С помощью этого метода животное засыпает.
     */
    public void sleep() {
        System.out.println(className + " засыпает.");
    }

    /**
     * Получение полной информации о животном.
     */
    public void getInfo() {
        System.out.println("Класс: " + className);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    /**
     * Инициализация поля name.
     * При назначении значения поля name происходит проверка на пустое введенное значение.
     * @param name Имя животного.
     */
    public void setName(String name) {
        if (!name.isEmpty() || !name.isBlank()) { //Если name пустое или введен пробел.
            this.name = name;
        } else {
            System.err.println("Ввели пустое имя."); //Обработка ошибки.
        }
    }

    /**
     * Инициализация поля age.
     * При назначении значения поля age происходит проверка на отрицательное введенное значение.
     * @param age Возраст животного.
     */
    public void setAge(int age) {
        if (age > 0) { //Если значение выше нуля.
            this.age = age;
        } else {
            System.err.println("Отрицательный возраст."); //Обработка ошибки.
        }
    }
}
