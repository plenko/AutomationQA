package HW2;

import java.util.Scanner;

public class Task2_3 {

    public static void main(String[] args) {
        /*Даны 4 числа типа int. Их необходимо сравнить и вывести наименьшее на консоль*/

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();
        System.out.print("Введите четвертое число: ");
        int num4 = in.nextInt();

        if ((num1 < num2) && (num1 < num3) && (num1 < num4)) {
            System.out.println("Наименьшее число: " + num1);
        } else if ((num2 < num1) && (num2 < num3) && (num2 < num4)) {
            System.out.println("Наименьшее число: " + num2);
        } else if ((num3 < num1) && (num3 < num2) && (num3 < num4)) {
            System.out.println("Наименьшее число: " + num3);
        } else if ((num4 < num1) && (num4 < num2) && (num4 < num3)) {
            System.out.println("Наименьшее число: " + num4);
        }

        /*int answer = Math.min( Math.min(num1,num2), Math.min(num3,num4) );
        System.out.println("Наименьшее число: " + answer);*/
    }

}
