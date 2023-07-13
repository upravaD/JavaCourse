package org.example.junior.chapter2.lesson24;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.util.Calendar.MAY;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 24: "Форматирование строк в Java."
 *
 * <p> Форматирование строк Java. Для создания форматированного текстового вывода предназначен класс {@code java.util.Formatter}. Этот класс обеспечивает преобразование формата, позволяющее выводить числа, строки, время и даты в любом необходимом разработчику виде. В классе {@code Formatter} объявлен метод {@code format()}, который преобразует переданные в него параметры в строку заданного формата и сохраняет в объекте типа {@code Formatter}. </p>
 * <p> Синтаксис: </p>
 *  <blockquote><pre>
 *   {@code
 *    1. Спецификаторы формата начинаются со знака процента "%" и заканчиваются символом указывающим тип аргумента,
 *    который нужно отформатировать.
 *    2. Флаг "1$" указывает индекс аргумента после выражения.
 *    3. Флаг "t" нужен для преобразований даты и времени, но для форматирования требуются дополнительные флаги,
 *    чтобы уточнить какие именно данные нужно форматировать.
 *
 *   'Пример':
 *   String.format("Пример форматирования: %1$te %1$tb %1$tY", 'аргумент 1');
 *
 *   'Простой вариант форматирования':
 *   System.out.printf("Любой текст: %s", 'аргумент 1');
 *
 *   'С помощью класса' java.util.Formatter:
 *   formatter.format("Пример форматирования:  %4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d")
 *   }
 *  </pre></blockquote>
 *
 * <p> Таблица спецификаторов
 * <br>
 * <img height="300" title="Таблица спецификаторов" src="https://studfile.net/html/2706/263/html_pW3fFlTwH0.ZgGQ/htmlconvd-XqSYMH35x1.jpg">
 * </p>
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/1412-formatiruem-vihvod-chisel-v-java">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4568">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=L9ZVPM-0VDI&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=10">YouTube</href>
 **/

public class StringFormatter {

    /**
     * Метод позволяет отформатировать дату с использованием статического метода
     * <br>{@code String.format()}.
     * @return Строковое представление даты.
     */
    public String dateFormatting(Calendar c) {
        String before = "Дата до форматирования: " + c.toString();
        String after = String.format("Дата после форматирования: %1$te %1$tb %1$tY" + "г.", c);
        return before + "\n" + after;
    }

    /**
     * Метод позволяет форматировать строковые данные, для примера перестановки индексов взято 4 аргумента.
     * @param s1 Индекс 1
     * @param s2 Индекс 2
     * @param s3 Индекс 3
     * @param s4 Индекс 4
     * @return Результат форматирования в виде строки.
     */
    public String stringFormatting(String s1, String s2, String s3, String s4) {

        //Объект для форматирования.
        StringBuilder sb = new StringBuilder();

        //Отправьте все выходные данные в добавляемый объект sb.
        Formatter formatter = new Formatter(sb, Locale.getDefault());

        //Явные индексы аргументов могут использоваться для изменения порядка вывода.
        return formatter.format("Форматирование строки: %4$2s %3$2s %2$2s %1$2s", s1, s2, s3, s4).toString();
    }

    /**
     * Метод позволяет форматировать дробные числа с указанием языкового стандарта.
     * @param locale Языковой стандарт.
     * @param d Дробное число.
     * @return Результат форматирования в виде строки.
     */
    public String doubleFormatting(Locale locale, double d) {

        //Объект для форматирования.
        StringBuilder sb = new StringBuilder();

        //Отправьте все выходные данные в добавляемый объект sb.
        Formatter formatter = new Formatter(sb, locale);

        //Необязательный языковой стандарт в качестве первого аргумента может быть использован для получения
        //форматирования чисел в зависимости от языка. Точность и ширина могут быть
        //заданы для округления и выравнивания значения.
        return formatter.format(locale, "Форматирование дробного числа: e = %10.4f", d).toString();
                                                               //"10" - это отступ, ".4" это кол-во знаков после запятой
    }

    public static void main(String[] args) {

        //Создание экземпляра класса.
        StringFormatter stringFormatter = new StringFormatter();
        System.out.println("=".repeat(50));

        //Запуск методов

        //Дата.
        Calendar calendar = new GregorianCalendar(1995, MAY, 23);
        System.out.println(stringFormatter.dateFormatting(calendar));
        System.out.println("=".repeat(50));

        //Строки.
        System.out.println(stringFormatter.stringFormatting("первое", "второе", "третье", "четвёртое"));
        System.out.println("=".repeat(50));

        //Дробные числа.
        System.out.println(stringFormatter.doubleFormatting(Locale.FRANCE, Math.PI));
        System.out.println("=".repeat(50));

        //4

        //Примеры ожидаемого использования
        StringBuilder sb = new StringBuilder();
        // Отправьте все выходные данные в добавляемый объект sb (Send all output to the Appendable object sb)
        Formatter formatter = new Formatter(sb, Locale.getDefault());

        // The '(' numeric flag may be used to format negative numbers with
        // parentheses rather than a minus sign.  Group separators are
        // automatically inserted.
        System.out.println(formatter.format("Amount gained or lost since last statement: $ %(,.2f", 6217.58));
        // -> "Amount gained or lost since last statement: $ (6,217.58)"

        //Существуют удобные методы для обычных запросов на форматирование, как показано в следующих вызовах:
        System.out.format("Local time: %tT\n", Calendar.getInstance());
        System.err.printf("Unable to open file '%1$s': %2$s", "fileName", "exception.getMessage()");
    }
}
