package org.example.trainee.chapter3.lesson31;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 3: "Преобразование типов."
 * <h3> Lesson 31: "Приведение примитивных типов данных в Java."
 *
 * <p>
 *  Приведение типов данных в Java называется "type casting".
 *  В Java примитивные типы данных делятся на две категории: числовые и символьные.
 *  При приведении примитивных типов данных следует быть осторожным,
 *  чтобы избежать потери данных или переполнения.
 *  Важно знать диапазон значений каждого типа и применять приведение соответствующим образом.
 * <p\>
 *
 * <p>
 *  Приведение может быть неявным (автоматическим) или явным (принудительным).
 * </p>
 *
 * <blockquote><pre>
 *   {@code
 *    1. Неявное приведение (Автоматическое преобразование):
 *    Неявное приведение выполняется автоматически,
 *    когда значения присваиваются переменным с меньшим размером или меньшим диапазоном значений,
 *    чем у исходной переменной.
 *    Нет потери данных при неявном приведении от типа с меньшим размером к типу с большим.
 *
 *    2. Явное приведение (Принудительное преобразование):
 *    Явное приведение выполняется вручную (принудительно) с помощью оператора (тип) перед выражением или переменной.
 *    Явное приведение применяется, когда значения присваиваются переменным с большим размером
 *    или большим диапазоном значений, чем у исходной переменной,
 *    и может потребоваться усечение значений, что может привести к потере данных.
 *   }
 *  </pre></blockquote>
 *
 * <p>
 *  Приведение примитивных типов данных в Java.
 * <br>
 * <img height="260" title="Приведение примитивных типов" src="https://cdn.javarush.com/images/article/5b2f1d28-0785-4131-bb55-854d83346e52/1080.webp">
 * </p>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/quests/lectures/questsyntaxpro.level07.lecture01">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4576">SwiftBook</href>
 **/

public class TypeCastingExample {

    /**
     * В этом примере показано неявное приведение (автоматическое преобразование) числовых типов
     * int, long, float и double, а также явное приведение (принудительное преобразование) от double к int.
     * Обратите внимание, что при явном приведении от double к int,
     * дробная часть числа отбрасывается, что приводит к потере данных.
     */
    public static void main(String[] args) {

        // Неявное приведение (автоматическое преобразование)

        int intValue = 100;
        long longValue = intValue; // Неявное приведение int к long
        float floatValue = intValue; // Неявное приведение int к float
        double doubleValue = floatValue; // Неявное приведение float к double

        System.out.println("Неявное приведение:");
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);

        // Явное приведение

        double doubleNum = Math.PI;
        int intNum = (int) doubleNum; // Явное приведение double к int (отбрасываем дробную часть)

        System.out.println("\nЯвное приведение:");
        System.out.println("double value: " + doubleNum);
        System.out.println("int value: " + intNum);
    }
}
