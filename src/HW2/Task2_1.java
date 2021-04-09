package HW2;

import java.io.IOException;
import java.util.Scanner;

public class Task2_1 {

    public static void main(String[] args) throws IOException {
        /*Имеется прямоугольное отверстие размерами a и b.
Определите можно ли его полностью закрыть круглой картонкой радиусом r.
Вывести результат на экран.

Данные a, b и r ввести с консоли.
*/
       /* System.out.print("Введите радиус r: ");
        int r = System.in.read();

        System.out.print("Введите сторону a: ");
        int a = System.in.read();

        System.out.print("Введите сторону b: ");
        int b = System.in.read();*/

        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        int r = in.nextInt();
        System.out.print("Введите сторону a: ");
        int a = in.nextInt();
        System.out.print("Введите сторону b: ");
        int b = in.nextInt();

        if (2 *  r >= Math.sqrt(a*a + b*b))
            System.out.println("Можно");
        else
            System.out.println("Нельзя");

    }

}
