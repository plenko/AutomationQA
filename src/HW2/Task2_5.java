package HW2;

import java.util.Scanner;

public class Task2_5 {

    public static void main(String[] args) {
        /*
Даны 2 числа (a и b)
Если число а четное, то нужно вывести в консоль произведение чисел a и b
Если число a нечетное, то нужно вывести в консоль сумму чисел a и b
*/
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        if (a % 2 == 0){
            System.out.println("Результат: " + a*b);
        } else {
            System.out.println("Результат: " + (a+b));
        }

    }
}
