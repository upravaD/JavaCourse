package org.example.junior.chapter1.lesson1;

/**

 <h1><i> Java for beginners. <i/>
 <h2> Chapter 1: "Основы Java".
 <h3> Lesson 1: "JDK and Hello World!".

 <h3> Первая программа.
 <h4> Класс — это шаблонная конструкция, которая позволяет описать в программе объект, его свойства (атрибуты или поля класса) и поведение (методы класса). Каждый класс имеет своё имя, чтобы в будущем к нему можно было обратиться. Чтобы создать класс на Java, необходимо написать слово {@code class}, дать ему название и поставить фигурные скобки: {@code class {}}.
 <br>
 @see <a href="https://docs.oracle.com/javase/tutorial/getStarted/cupojava/index.html"/>Документация Oracle</a>
 @author upravaD
 @version JDK 18
 **/

//Основной класс программы.
public class HelloWorld {

    //Стартовый метод программы.
    /**
     * Ключевое слово {@code public} означает, что метод {@code main()} доступен везде, где доступен содержащий его класс. Ключевое слово {@code static} означает, что метод является статическим, т.е. не требует для своего вызова наличие экземпляра класса. Ключевое слово {@code void} означает, что метод не возвращает никакого значения.
     * */
    public static void main(String[] args) {

        //Вывод строки в консоль.
        System.out.println("Hello World!");
    }
}