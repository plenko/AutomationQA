package HW2;

import java.io.IOException;
import java.util.Scanner;

public class Task2_2 {

    public static void main(String[] args) throws IOException {

        /*Имеется целое число n < 10.
Вывести какому дню недели оно соответствует, если при n = 1 день недели = Понедельник.
*/
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер дня от 1 до 9: ");
        int d = in.nextInt();
        String dayOfWeek;

        switch (d) {
            case 1: dayOfWeek = "Понедельник";
                break;
            case 2: dayOfWeek = "Вторник";
                break;
            case 3: dayOfWeek = "Среда";
                break;
            case 4: dayOfWeek = "Четверг";
                break;
            case 5: dayOfWeek = "Пятница";
                break;
            case 6: dayOfWeek = "Суббота";
                break;
            case 7: dayOfWeek = "Воскресение";
                break;
            case 8: dayOfWeek = "Понедельник";
                break;
            case 9: dayOfWeek = "Вторник";
                break;
            default:
                dayOfWeek = "Введено некорректное значение";
        }
        System.out.println(dayOfWeek);

    }

}
