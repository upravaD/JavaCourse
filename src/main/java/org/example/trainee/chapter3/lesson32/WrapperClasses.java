package org.example.trainee.chapter3.lesson32;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 3: "Преобразование типов."
 * <h3> Lesson 32: "Классы-обертки примитивных типов данных."
 *
 * <p>
 *  В Java существуют классы-обертки (wrapper classes),
 *  которые предоставляют упаковку (обертку) для примитивных типов данных.
 *  Эти классы позволяют работать с примитивными типами как с объектами,
 *  что, в свою очередь, позволяет использовать их в контекстах, требующих объектов,
 *  например, в коллекциях или при работе с обобщениями (generics).
 *  Классы-обертки находятся в пакете java.lang, поэтому их можно использовать без явного импорта.
 *  Классы-обертки имеют конструкторы, которые позволяют создавать объекты,
 *  принимая соответствующее значение примитивного типа в качестве параметра.
 *  Они также предоставляют методы для преобразования значений и других полезных операций.
 *  Обратите внимание, что начиная с Java 5,
 *  автоупаковка (autoboxing) и автораспаковка (unboxing) стали автоматическими,
 *  что делает работу с классами-обертками более удобной и интуитивной.
 * <p\>
 *
 * <p>
 *  Вот список классов-оберток для каждого из примитивных типов данных:
 * </p>
 *
 * <blockquote><pre>
 *   {@code
 *    1. Boolean - для boolean
 *    2. Byte - для byte
 *    3. Short - для short
 *    4. Integer - для int
 *    5. Long - для long
 *    6. Float - для float
 *    7. Double - для double
 *    8. Character - для char
 *   }
 *  </pre></blockquote>
 *
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/groups/posts/1948-objertki-raspakovka-i-zapakovka">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4577">SwiftBook</href>
 **/
public class WrapperClasses {

    // Объявление объектов оберток и примитивных типов
    Integer intWrapper = new Integer(42);
    int intPrimitive = intWrapper.intValue();

    Double doubleWrapper = new Double(3.14);
    double doublePrimitive = doubleWrapper.doubleValue();

    Boolean booleanWrapper = new Boolean(true);
    boolean booleanPrimitive = booleanWrapper.booleanValue();


    // Автоупаковка (Autoboxing) - автоматическое преобразование примитивного типа в объект-обертку
    Integer autoBoxedInt = 100; // Компилятор автоматически оборачивает int в Integer


    // Автораспаковка (Unboxing) - автоматическое преобразование объекта-обертки в примитивный тип
    int autoUnboxedInt = intWrapper; // Компилятор автоматически извлекает значение из Integer


    // Методы классов-оберток
    Double result = doubleWrapper + 2.0; // Автораспаковка и автоупаковка работают вместе


    // Методы для преобразования строк в значения примитивных типов или их оберток
    int parsedInt = Integer.parseInt("123");
    double parsedDouble = Double.parseDouble("3.14");
    boolean parsedBoolean = Boolean.parseBoolean("true");

    /**
     * Вывод в консоль.
     */
    public static void main(String[] args) {

        WrapperClasses wrapperClasses = new WrapperClasses();

        System.out.println("wrapperClasses.intPrimitive = " + wrapperClasses.intPrimitive);
        System.out.println("wrapperClasses.doublePrimitive = " + wrapperClasses.doublePrimitive);
        System.out.println("wrapperClasses.booleanPrimitive = " + wrapperClasses.booleanPrimitive);
        System.out.println("wrapperClasses.autoBoxedInt = " + wrapperClasses.autoBoxedInt);
        System.out.println("wrapperClasses.autoUnboxedInt = " + wrapperClasses.autoUnboxedInt);
        System.out.println("wrapperClasses.result(doubleWrapper + 2.0) = " + wrapperClasses.result);
        System.out.println("wrapperClasses.parsedInt = " + wrapperClasses.parsedInt);
        System.out.println("wrapperClasses.parsedDouble = " + wrapperClasses.parsedDouble);
        System.out.println("wrapperClasses.parsedBoolean = " + wrapperClasses.parsedBoolean);
    }

}
