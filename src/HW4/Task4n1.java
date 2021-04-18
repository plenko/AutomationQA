package HW4;

import java.util.Random;

public class Task4n1 {

    /*В массиве состоящем из n вещественных элементов, вычислить:
     сумму отрицательных элементов массива
     и произведение элементов массива расположенных между максимальным и минимальным элементами.
     */

    public static void main(String[] args) {


        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10) - 5);
            System.out.print(" " + array[i]);
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < 0)
            {
                sum += array[i];
            }
        }
        System.out.println();
        System.out.println(" сумма отрицательных элементов массива: " + sum);



        int[] array2 = {5, 1, 2, 3, 26};

        int maxIdx = 0;
        int max = array2[maxIdx];
        int minIdx = 0;
        int min = array2[minIdx];

        for (int x = 1; x < array2.length; x++) {
            if (array2[x] > max) {
                max = array2[x];
                maxIdx = x;
            }
            if (array2[x] < min) {
                min = array2[x];
                minIdx = x;
            }
        }

        if (minIdx > maxIdx) {
            int tmp = maxIdx;
            maxIdx = minIdx;
            minIdx = tmp;
        }
        int result = 1;

        for (int x = minIdx; x < maxIdx; x++) {
            result *= array2[x];
        }
        System.out.println("произведение элементов массива расположенных между максимальным и минимальным элементами " + result);



    }

}
