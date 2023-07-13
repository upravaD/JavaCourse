package org.example.junior.chapter2.lesson23;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 23: "{@code StringBuilder}."
 *
 * <p> {@code StringBuilder} – класс, предоставляющий изменяемую последовательность символов. Класс был введен в Java 5 и имеет полностью идентичный API с {@code StringBuffer}. Единственное отличие – {@code StringBuilder} не синхронизирован. Это означает, что его нежелательно использовать в многопоточных средах. </p>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/StringBuilder.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/2351-znakomstvo-so-string-stringbuffer-i-stringbuilder-v-java">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4567">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=qj9ZVIlWWnk&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=5">YouTube</href>
 **/

public class StringDesigner {

    /**
     * Стартовая целочисленная константа.
     */
    private static final String NUMBERS = "0123456789";

    /**
     * Стартовая строковая константа.
     */
    private static final String STR = "hello";

    public static void main(String[] args) {

        //Создание экземпляров класса StringBuilder с разными значениями.
        StringBuilder numbersBuilder = new StringBuilder(NUMBERS); //Целочисленный.
        StringBuilder strBuilder = new StringBuilder(STR); //Строковый.

        System.out.println("Стартовое значение numbersBuilder: " + numbersBuilder); //Вывод на экран.
        System.out.println("Стартовое значение strBuilder: " + strBuilder);
        System.out.println("=".repeat(50));

        //Реверс строки с помощью вспомогательного объекта StringBuilder.
        StringBuilder reverseNumbers = new StringBuilder(numbersBuilder); //Новый объект на основе numbersBuilder.
        reverseNumbers.reverse(); //Реверс.

        //Конкатенация строк.
        numbersBuilder //Наш объект.
                .append(reverseNumbers) //Плюс объект в реверсе.
                .append(strBuilder) //Плюс строковый объект.
                .append("фыва олдж", 4,5) //Плюс символы или пробелы.
                .append("Вот так тоже можно!"); //Плюс любое строковое выражение.

        System.out.println("Результат сложения строк numbersBuilder: " + numbersBuilder); //Вывод на экран.
        System.out.println("=".repeat(50));

        //Длина строки.
        System.out.println("Длина строки numbersBuilder: " + numbersBuilder.length());
        System.out.println("=".repeat(50));

        //Конкатенация строки с символами char.
        System.out.println("Результат сложения строк strBuilder: " + strBuilder.appendCodePoint('Э'));
        System.out.println("=".repeat(50));

        //Удаление строки или символа.
        numbersBuilder.delete(10, numbersBuilder.length()); //Удаление подстроки с указанием длины подстроки.
        strBuilder.deleteCharAt(strBuilder.length()-1); //Удаление символа с помощью указания его индекса.

        System.out.println("Результат удаления строк из numbersBuilder: " + numbersBuilder);
        System.out.println("Результат удаления символа из strBuilder: " + strBuilder);
        System.out.println("=".repeat(50));

        //Сравнение объектов StringBuilder.
        System.out.println("Содержит ту же последовательность: " + numbersBuilder.compareTo(reverseNumbers.reverse())); //Если numbersBuilder содержит ту же последовательность символов, что и в аргументе
        System.out.println("Меньше аргумента: " + numbersBuilder.compareTo(strBuilder)); //Если numbersBuilder лексикографически меньше аргумента.
        System.out.println("Больше аргумента: " + numbersBuilder.compareTo(new StringBuilder("0123"))); //Если numbersBuilder лексикографически больше аргумента.
        System.out.println("=".repeat(50));

        //Вставка строки в объект StringBuilder.
        numbersBuilder.insert(8, strBuilder);

        System.out.println("Результат вставки: " + numbersBuilder);
        System.out.println("=".repeat(50));

        //Извлечение подстроки и замещение.
        String result = numbersBuilder.substring(8,13); //Извлекаем подстроку с помощью индексов.
        numbersBuilder.replace(numbersBuilder.indexOf("h"), numbersBuilder.lastIndexOf("o")+1, ""); //Заменяем подстроку с помощью поиска индекса по символу.

        System.out.println("numbersBuilder : " + numbersBuilder);
        System.out.println("Извлеченная строка: " + result);
        System.out.println("=".repeat(50));
    }
}
