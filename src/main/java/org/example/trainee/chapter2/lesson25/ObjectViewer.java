package org.example.trainee.chapter2.lesson25;

/**
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 2: "Объектно-ориентированное программирование".
 * <h3> Lesson 25: "Класс Object и метод toString()"
 *
 * <p>
 * Объект класса является корнем иерархии классов.
 * Каждый класс имеет Object в качестве суперкласса.
 * Все объекты, включая массивы, реализуют методы этого класса.
 * </p>
 *
 * <p> Синтаксис: </p>
 *  <blockquote><pre>
 *   {@code
 *    1. public String toString() -
 *    "Возвращает строковое представление объекта."
 *
 *    2. public native int hashCode();
 *       public boolean equals(Object obj) -
 *    "Пара методов, которые используются для сравнения объектов."
 *
 *    3. public final native Class getClass() -
 *    "Возвращает специальный объект, который описывает текущий класс."
 *
 *    4. public final native void notify();
 *       public final native void notifyAll();
 *       public final native void wait(long timeout);
 *       public final void wait(long timeout, intnanos);
 *       public final void wait() -
 *    "Методы для контроля доступа к объекту из различных нитей.
 *     Управление синхронизацией нитей."
 *
 *    5. protected void finalize() -
 *    "Метод позволяет «освободить» родные не-Java ресурсы: закрыть файлы, потоки и т.д."
 *
 *    6. protected native Object clone() -
 *    "Метод позволяет клонировать объект: создает дубликат объекта."
 *
 *   }
 *  </pre></blockquote>
 *
 * <p> Таблица спецификаторов
 * <br>
 * <img height="360" title="Иерархия классов" src="https://www.developerhelps.com/wp-content/uploads/2019/12/javaObjectclass.png">
 * </p>
 * @author upravaD
 * @version JDK 18
 * @see <a href="https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Object.html">Документация Oracle</href>
 * @see <a href="https://javarush.com/quests/lectures?quest=QUEST_JAVA_CORE&level=9">JavaRush</href>
 * @see <a href="https://swiftbook.org/courses/416/lectures/4569">SwiftBook</href>
 * @see <a href="https://www.youtube.com/watch?v=Jgo7RyZ6n7k&list=PLEgFBkSxIsb9mkcPjfHnY0wRI8zdMCKsV&index=11&t=535s">YouTube</href>
 **/

public class ObjectViewer {
    //Пока не придумал нормальный пример, но кое что написал))
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.equals(obj2));

        //Здесь должны быть многопоточные методы wait и notify, но я ничего не придумал)))

        //finalize() deprecated method

        //clone()

    }
}
