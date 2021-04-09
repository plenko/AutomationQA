package HW2;

import java.util.Scanner;

public class Task2_4 {

    public static void main(String[] args) {

        /*Даны номера месяцев в виде числа типа int.
        Необходимо определить время года по номеру месяца и вывести на консоль*/

        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = in.nextInt();

        if (month == 12 || month < 3){
            System.out.println("зима");
        }else if(month > 2 && month < 6){
            System.out.println("весна");
        }else if(month > 5 && month < 9){
            System.out.println("лето");
        }else if (month > 8 && month < 12) {
            System.out.println("осень");
        } else System.out.println("нет такого месяца");

    }

}
