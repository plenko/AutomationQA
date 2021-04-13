package HW3;

import java.util.Scanner;

public class Task3n5 {
/*Распечатайте на экран вопрос, "Сколько будет 5*5?".
Введите число с ответом клавиатуры.
Если пользователь ответил правильно, то поздравьте его и завершите программу.
Если пользователь ответил неверно, то переспросите его, введите новое число,
 снова проверьте на правильность ответ и так далее, пока не ответит правильно.*/
    public static void main(String[] args) {
        int answer = 0;
        System.out.print("Сколько будет 5*5? Введите Ваш ответ: ");

        do {
            Scanner in = new Scanner(System.in);
            answer = in.nextInt ();
            if (answer == 25) {
                System.out.println ("Верно!"); break;
            } else
            System.out.print ("Неверно. Введите Ваш ответ: ");
        } while (true);

    }

}
