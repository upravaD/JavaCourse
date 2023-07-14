package org.example.trainee.chapter1.lesson4;

/**
 *
 * <h1><i> Java for beginners. <i/>
 * <h2> Chapter 1: "Основы Java".
 * <h3> Lesson 4: "Цикл While".
 *
 * <h3> Это оператор цикла с неизвестным заранее числом итераций. Он выполняет заданный шаблон, пока условие выражения не примет ложь и буквально переводится как «пока».
 * <h3> Существуют две команды, влияющие на ход выполнения цикла: {@code break} и {@code continue}.
 * <h4> {@code continue} – прекращает выполнение тела текущего цикла и осуществляет переход к логическому выражению оператора {@code while}. Если вычисленное выражение будет истинно – выполнение цикла будет продолжено.
 * <h4> {@code break} – немедленно прекращает выполнение текущего цикла и осуществляет переход к первой команде за его пределами. Таким образом, выполнение текущего цикла прерывается.
 * <br>
 * <br>Синтаксис:
 * <blockquote><pre>
 *     {@code while(условие) {
 *           тело метода;
 *         }}
 * </pre></blockquote>
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html">Документация Oracle</href>
 * @author upravaD
 * @version JDK 18
 *
 **/

public class WhileLoops {
    /**Возводимое в степень число*/
    int number = 3;

    /**Результат возведения в степень*/
    int result = 1;

    /**Начальный показатель степени*/
    int power = 1;

    /**Конструктор класса*/
    public WhileLoops() {
        System.out.println("=".repeat(50));
        System.out.println("Создан обьект класса 'WhileLoops'!");
        System.out.println("=".repeat(50));
    }

    /**Итерации цикла с помощью инкремента на примере возведения числа в степень.
     * @param value количество итераций.*/
    public void incrementLoop(int value) {
        while (power <= value) { //Условие входа в цикл.
            result = result * number;
            System.out.println(number + " в степени " + power + " = " + result);
            power++; //Инкремент степени после каждой итерации.
        }
        System.out.println("=".repeat(50));
        power = 1; //Возвращение значения показателя степени.
        result = 1; //Возвращение значения результата к изначальному.
    }

    /**Выход из цикла с помощью оператора {@code break}.
     * @param value количество итераций*/
    public void breakLoop(int value) {
        while (power <= value) {
            result = result * number;
            if (result < 0) { //Условие - результат не может быть отрицательным.
                System.out.println("Сработал оператор 'break'");
                break; //Условие выхода из цикла.
            }
            System.out.println(number + " в степени " + power + " = " + result);
            power++; //Инкремент степени после каждой итерации.
        }
        System.out.println("=".repeat(50));
        power = 1; //Возвращение значения показателя степени.
        result = 1; //Возвращение значения результата к изначальному.
    }

    /**Прерывание цикла с помощью оператора {@code continue}.
     * @param value количество итераций*/
    public void continueLoop(int value) {
        while (power <= value) {
            result = result * number;
            if (result < 0) { //Условие - результат не может быть отрицательным.
                System.out.println("Сработал оператор 'continue'");
                continue; //Условие прерывания цикла.
            }
            System.out.println(number + " в степени " + power + " = " + result);
            power++; //Инкремент степени после каждой итерации.
        }
        System.out.println("=".repeat(50));
        power = 1; //Возвращение значения показателя степени к изначальному.
        result = 1; //Возвращение значения результата к изначальному.
    }

    /**Метод запуска программы.*/
    public static void main(String[] args) {
        //Создание экземпляра класса.
        WhileLoops whileLoops = new WhileLoops();

        //Запуск методов.
        whileLoops.incrementLoop(20);
        whileLoops.breakLoop(20);
        whileLoops.continueLoop(20);
    }
}
