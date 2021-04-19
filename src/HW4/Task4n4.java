package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4n4 {

    /*Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.

Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int n = 0;

        while (n <= 3) {
            if(in.hasNextInt()){
                n = in.nextInt();
                if(n <= 3){
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            }
        }
        int [] array1 = new int[n];
        int numOfEven = 0;

        for (int i = 0; i < n; i++) {
            array1[i] = (int)(Math.random()*10);
            if(array1[i]%2 == 0){
                numOfEven++;
            }
        }

        System.out.println(Arrays.toString(array1));
        int [] array2 = new int[numOfEven];
        int posElement = 0;
        for (int i = 0; i < n; i++) {
            if(array1[i]%2 == 0){
                array2[posElement] = array1[i];
                posElement++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }

}
