package HW3;

import java.util.Scanner;

public class Task3n2 {

    /*За каждый месяц банк начисляет к сумме вклада 17% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл for.
Пусть сумма вклада будет представлять тип double*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        double deposit = in.nextDouble();
        System.out.print("Введите количество месяцев: ");
        int month = in.nextInt();
        double percRate  = 0.17;

        for (int i = 0; i < month; i++) {
            deposit = deposit + deposit * percRate;
        }
        System.out.println("Cумма депозита через " + month + " месяцев будет равна " + deposit);
    }
}
