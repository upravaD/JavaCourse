package org.example.trainee.chapter1.lesson2;

/**
 <h1><i> Java for beginners. <i/>
 <h2> Chapter 1: "Основы Java".
 <h3> Lesson 2: "Переменные. Примитивные типы данных."

 <h3> Эти типы можно разделить на четыре группы:
 <h4> 1. Целые числа: {@code byte}, {@code short}, {@code int}, {@code long} — представляют собой целые числа со знаком.
 <br> 2. Числа с плавающей точкой — эта группа включает себе {@code float} и {@code double} — типы, которые хранят числа с точностью до определённого знака после запятой.
 <br> 3. Логические значения — {@code boolean} — хранят значения типа "истина/ложь".
 <br> 4. Символы — в эту группу входит тип {@code char}.
 <br>
 @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">Документация Oracle</href>
 @author upravaD
 @version JDK 18
 **/

public class Variable {
    /**Целочисленные типы данных.*/
    private byte myByte;       //8 bit in memory
    private short myShort;     //16 bit in memory
    private int myInt;         //32 bit in memory
    private long myLong;       //64 bit in memory

    /**Вещественные типы данных.*/
    private float myFloat;     //32 bit in memory
    private double myDouble;   //64 bit in memory

    /**Беззнаковый целочисленный тип данных.*/
    private char myChar;       //16 bit in memory

    /**Логический тип данных.*/
    private boolean myBoolean; //8 bit in memory


    /**Конструктор класса.*/
    public Variable() {
        System.out.println("Создан обьект класса 'Variable'!");
    }

    /**Инициализация переменных минимальными значениями.*/
    public void initMinValue() {
        this.myByte    = Byte.MIN_VALUE;
        this.myShort   = Short.MIN_VALUE;
        this.myInt     = Integer.MIN_VALUE;
        this.myLong    = Long.MIN_VALUE;
        this.myFloat   = Float.MIN_VALUE;
        this.myDouble  = Double.MIN_VALUE;

        //Нецелочисленные типы.
        this.myChar    = '\u0001';
        this.myBoolean = false;
    }

    /**Инициализация переменных максимальными значениями.*/
    public void initMaxValue() {
        this.myByte    = Byte.MAX_VALUE;
        this.myShort   = Short.MAX_VALUE;
        this.myInt     = Integer.MAX_VALUE;
        this.myLong    = Long.MAX_VALUE;
        this.myFloat   = Float.MAX_VALUE;
        this.myDouble  = Double.MAX_VALUE;

        //Нецелочисленные типы.
        this.myChar    = '\u9999';
        this.myBoolean = true;
    }

    /**Строковое представление данных.*/
    @Override
    public String toString() {
        return "Variable {" +
                "\n\tmyByte = " + myByte +
                ", \n\tmyShort = " + myShort +
                ", \n\tmyInt = " + myInt +
                ", \n\tmyLong = " + myLong +
                ", \n\tmyFloat = " + myFloat +
                ", \n\tmyDouble = " + myDouble +
                ", \n\tmyChar = " + myChar +
                ", \n\tmyBoolean = " + myBoolean +
                "\n" + '}';
    }

    /**Метод запуска программы.*/
    public static void main(String[] args) {

        //Создание экземпляра класса.
        Variable myVariable = new Variable();
        System.out.println("=".repeat(50));

        //Вывод в консоль дефолтных значений переменных.
        System.out.println("Дефолтные значения переменных");
        System.out.println("-".repeat(50));
        System.out.println(myVariable);
        System.out.println("=".repeat(50));

        //Вывод в консоль минимальных значений переменных.
        myVariable.initMinValue();
        System.out.println("Минимальные значения переменных");
        System.out.println("-".repeat(50));
        System.out.println(myVariable);
        System.out.println("=".repeat(50));

        //Вывод в консоль максимальных значений переменных.
        myVariable.initMaxValue();
        System.out.println("Максимальные значения переменных");
        System.out.println("-".repeat(50));
        System.out.println(myVariable);
        System.out.println("=".repeat(50));
    }
}