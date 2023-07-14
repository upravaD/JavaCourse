package org.example.trainee.chapter1.lesson3;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 3: "Строки в Java. Ссылочные типы данных."
 *
 * <h3> Класс {@code String} в Java предназначен для работы со строками в Java. Все строковые литералы, определенные в Java программе (например, "abc") — это экземпляры класса {@code String}. Вот его ключевые характеристики:
 * <h4> 1. Класс {@code String} реализует интерфейсы {@code Serializable} и {@code CharSequence}. Поскольку он входит в пакет {@code java.lang}, его не нужно импортировать.
 * <br> 2. Класс {@code String} в Java — это {@code final} класс, который не может иметь потомков.
 * <br> 3. Класс {@code String} — {@code immutable} класс, то есть его объекты не могут быть изменены после создания. Любые операции над объектом {@code String}, результатом которых должен быть объект класса {@code String}, приведут к созданию нового объекта.
 * <br> 4. Благодаря своей неизменности, объекты класса {@code String} являются потокобезопасными и могут быть использованы в многопоточной среде.
 * <br> 5. Каждый объект в Java может быть преобразован в строку через метод {@link java.lang.Object#toString()}, унаследованный всеми Java-классами от класса {@code Object}.
 * <br>
 *
 * @author upravaD
 * @version JDK 18
 * @see java.lang.String
 * @see <a href="https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/String.html">Документация Oracle</href>
 **/

public class Strings {
    /**
     * Виды инициализации строковых переменных.
     */
    private String name = "Andrey"; //Создание простой строки.
    private String surname = "Fedorov";
    private String fullName = null; //Дефолтное значение переменной.
    private String city = new String("Samara"); //Создание обьекта String в Heap (память JavaRuntime).
    private String country = new String("Russia");

    /**
     * Конструктор класса
     */
    public Strings() {
        System.out.println("=".repeat(50));
        System.out.println("Создан обьект класса 'Strings'!");
        System.out.println("=".repeat(50));
    }

    /**
     * Метод преобразования любого типа в тип {@code String}.
     *
     * @param obj любое значение.
     */
    public String typeConversion(Object obj) {
        return String.valueOf(obj);
    }

    /**
     * Метод запуска программы.
     */
    public static void main(String[] args) {

        //Создание экземпляра класса.
        Strings strings = new Strings();

        //Запуск методов
        String born = strings.typeConversion(1988); //Метод возвращает строковое представление аргумента.

        //Несколько видов сложения строк.

        //Контакенация
        strings.fullName = strings.name + " " + strings.surname;
        System.out.println("Сложение строк с помощью оператора '+': \n\t" + strings.fullName);
        System.out.println("-".repeat(50));

        //С помощью метода 'concat()'
        String concat = strings.fullName
                .concat(" ")
                .concat("was born")
                .concat(" ")
                .concat("in")
                .concat(" ")
                .concat(born);
        System.out.println("Сложение строк с помощью метода 'concat()': \n\t" + concat);
        System.out.println("-".repeat(50));

        //С помощью статического метода 'join()'
        String join = String.join(
                ", ",
                "443000",
                strings.country,
                strings.city,
                "My street",
                "123"
        );
        System.out.println("Сложение строк с помощью статического метода 'join()': \n\t" + join);
        System.out.println("=".repeat(50));

        //Сравнение строк.

        //С помощью метода 'equals()'
        System.out.println("Сравнение без учета регистра: ");
        System.out.println("\tstrings.name.equals(\"andrey\") = " + strings.name.equals("andrey"));
        System.out.println("\tstrings.name.equals(strings.surname) = " + strings.name.equals(strings.surname));
        System.out.println("\tstrings.name.equals(\"Andrey\") = " + strings.name.equals("Andrey"));
        System.out.println("-".repeat(50));

        //С помощью метода 'equalsIgnoreCase()'
        System.out.println("Сравнение с учетом регистра: ");
        System.out.println("\tstrings.name.equals(\"andrey\") = " + strings.name.equalsIgnoreCase("andrey"));
        System.out.println("\tstrings.name.equals(strings.surname) = " + strings.name.equalsIgnoreCase(strings.surname));
        System.out.println("\tstrings.name.equals(\"Andrey\") = " + strings.name.equalsIgnoreCase("Andrey"));
        System.out.println("=".repeat(50));

        //Извлечение подстроки из строки.
        System.out.println("Извлечение подстроки из строки: ");
        String longStr = strings.name + strings.surname + strings.city + strings.country;
        System.out.println("\tДо: " + longStr);
        System.out.println("\tПосле: " + longStr.substring(6, 13));
        System.out.println("=".repeat(50));

        //Работа с регистром.
        System.out.println("Работа с регистром: ");
        String upper = strings.name.toUpperCase();
        String lower = strings.name.toLowerCase();
        System.out.println("\tВерхний регистр: " + upper);
        System.out.println("\tНижний регистр: " + lower);
        System.out.println("=".repeat(50));
    }
}
