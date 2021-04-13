package HW3;

public class Task3n4 {
//Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99.
    public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i < 99; i = i + 2)
        sum = sum + i;
        System.out.println(sum);

    }

}
