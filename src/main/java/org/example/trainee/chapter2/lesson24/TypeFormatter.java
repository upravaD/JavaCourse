package org.example.trainee.chapter2.lesson24;

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
 * <p>
 * Форматирование строк Java. Для создания форматированного текстового вывода
 * предназначен класс {@code java.util.Formatter}. Этот класс обеспечивает преобразование формата,
 * позволяющее выводить числа, строки, время и даты в любом необходимом разработчику виде.
 * В классе {@code Formatter} объявлен метод {@code format()},
 * который преобразует переданные в него параметры в строку заданного формата
 * и сохраняет в объекте типа {@code Formatter}.
 * </p>
 *
 * <p> Синтаксис: </p>
 *  <blockquote><pre>
 *   {@code
 *    1. Спецификаторы формата начинаются со знака процента "%"
 *    и заканчиваются символом указывающим тип аргумента,
 *    который нужно отформатировать.
 *    2. Флаг "1$" указывает индекс аргумента после выражения.
 *    3. Флаг "t" нужен для преобразований даты и времени,
 *    но для форматирования требуются дополнительные флаги,
 *    чтобы уточнить какие именно данные нужно форматировать.
 *
 *   'Пример':
 *   String.format("Пример форматирования: %1$te %1$tb %1$tY", 'аргумент 1');
 *
 *   'Простой вариант форматирования':
 *   System.out.printf("Любой текст: %s", 'аргумент 1');
 *
 *   'С помощью класса' java.util.Formatter:
 *   formatter.format("Пример форматирования:  %4$s %3$s %2$s %1$s", "a", "b", "c", "d")
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

public class TypeFormatter {

    /**
     * Метод позволяет отформатировать дату с использованием статического метода
     * <br>{@code String.format()}.
     * @return Строковое представление даты.
     */
    public String dateFormatting(Calendar c) { //Яркий шрифт                  обычный шрифт
        String before = "Дата до форматирования: \033[0;97m" + c.toString() + "\u001B[0m";
        String after = String.format("Дата после форматирования: \033[0;97m %1$te %1$tb %1$tY" + "г.\u001B[0m", c);
        return before + "\n" + after;                          //Яркий шрифт                        обычный шрифт
    }

    /**
     * Метод позволяет форматировать строковые данные, для примера перестановки индексов взято 4 аргумента.
     * @param s1 Индекс 1
     * @param s2 Индекс 2
     * @param s3 Индекс 3
     * @param s4 Индекс 4
     * @return Результат форматирования в виде изменяемой строки.
     */
    public StringBuilder stringFormatting(String s1, String s2, String s3, String s4) {

        //Объект для форматирования.
        StringBuilder sb = new StringBuilder();

        //Отправьте все выходные данные в добавляемый объект sb.
        Formatter formatter = new Formatter(sb, Locale.getDefault());

        //Явные индексы аргументов могут использоваться для изменения порядка вывода.
        formatter.format("Форматирование строки: \033[0;97m [ %4$s, %3$s, %2$s, %1$s ] \u001B[0m", s1, s2, s3, s4);
                                               //Яркий шрифт                           обычный шрифт
        return sb;
    }

    /**
     * Метод позволяет форматировать дробные числа с указанием языкового стандарта.
     * @param locale Языковой стандарт.
     * @param d Дробное число.
     * @return Результат форматирования в виде изменяемой строки.
     */
    public StringBuilder doubleFormatting(Locale locale, double d) {

        //Объект для форматирования.
        StringBuilder sb = new StringBuilder();

        //Отправьте все выходные данные в добавляемый объект sb.
        Formatter formatter = new Formatter(sb, locale);

        //Необязательный языковой стандарт в качестве первого аргумента может быть использован для получения
        //форматирования чисел в зависимости от языка. Точность и ширина могут быть
        //заданы для округления и выравнивания значения.
        formatter.format(locale, "Форматирование дробного числа:\033[0;97m x = %10.5f \u001B[0m", d);
                                                                                    //"10" - это кол-во знаков перед запятой,
                                                                                      //".5" - это кол-во знаков после запятой.
        return sb;
    }

    /**
     * Метод позволяет форматировать дробные числа в денежном выражении.
     * @param money Дробное число.
     * @return Результат форматирования в виде изменяемой строки.
     */
    public StringBuilder moneyFormatting(Double money) {

        //Объект для форматирования.
        StringBuilder sb = new StringBuilder();

        //Отправьте все выходные данные в добавляемый объект sb.
        Formatter formatter = new Formatter(sb);

        //Числовой флаг '(' может использоваться для форматирования отрицательных чисел в круглых скобках, а не со знаком минус.
        //Разделители групп вставляются автоматически.
        formatter.format("Сумма, полученная или потерянная с момента последней выписки: \033[0;97m $ %(,.2f \u001B[0m", money);

        return sb;
    }

    public static void main(String[] args) {

        //Создание экземпляра класса.
        TypeFormatter typeFormatter = new TypeFormatter();
        System.out.println("=".repeat(50));

        //Запуск методов

        //Дата.
        Calendar calendar = new GregorianCalendar(1995, MAY, 23);
        System.out.println(typeFormatter.dateFormatting(calendar));
        System.out.println("=".repeat(50));

        //Строки.
        System.out.println(typeFormatter.stringFormatting("первое", "второе", "третье", "четвёртое"));
        System.out.println("=".repeat(50));

        //Дробные числа.
        System.out.println(typeFormatter.doubleFormatting(Locale.FRANCE, Math.PI));
        System.out.println("=".repeat(50));

        //Дробные числа в формате денег.
        System.out.println(typeFormatter.moneyFormatting(-6217.58));
        System.out.println(typeFormatter.moneyFormatting(6217.58));
        System.out.println("=".repeat(50));

        //Существуют удобные методы для обычных запросов на форматирование, как показано в следующих вызовах:
        System.out.format("Local time: \033[0;97m %tT \u001B[0m\n", Calendar.getInstance());
        System.err.printf("Unable to open file '%1$s' : %2$s", "fileName", "exception.getMessage()");
        System.out.println("=".repeat(50));
    }
}
