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
 *
 * <br>
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html">Документация Oracle</href>
 * @see <a href="">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4568">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=L9ZVPM-0VDI&list=PLEgFBkSxIsb_e5glouz33gQHs1e8t1nkV&index=10">YouTube</href>
 **/

public class StringFormatter {
    public static void main(String[] args) {

        //Строки могут быть отформатированы с использованием статического метода String.format:
        Calendar c = new GregorianCalendar(1995, MAY, 23);
        String s = String.format("Duke's Birthday: %1$tb %1$te, %1$tY", c);
        System.out.println(s);

        //Существуют удобные методы для обычных запросов на форматирование, как показано в следующих вызовах:
        System.out.format("Local time: %tT\n", Calendar.getInstance());
        System.err.printf("Unable to open file '%1$s': %2$s", "fileName", "exception.getMessage()");

        //Примеры ожидаемого использования

        StringBuilder sb = new StringBuilder();
        // Send all output to the Appendable object sb
        Formatter formatter = new Formatter(sb, Locale.getDefault());

        // Explicit argument indices may be used to re-order output.
        formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
        // -> " d  c  b  a"

        // Optional locale as the first argument can be used to get
        // locale-specific formatting of numbers.  The precision and width can be
        // given to round and align the value.
        formatter.format(Locale.FRANCE, "e = %+10.4f", Math.PI);
        // -> "e =    +3,1416"

        // The '(' numeric flag may be used to format negative numbers with
        // parentheses rather than a minus sign.  Group separators are
        // automatically inserted.
        System.out.println(formatter.format("Amount gained or lost since last statement: $ %(,.2f", 6217.58));
        // -> "Amount gained or lost since last statement: $ (6,217.58)"
    }
}
