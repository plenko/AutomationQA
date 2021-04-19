package HW4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4n3 {

    /*Создать двумерный массив, размером n x n (размер массива вводить с консоли).
    Если элемент массива является четным числом, вывести 0, если не четным 1.*/
    public static void main(String[] args) {

        int row;
        int col;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = in.nextInt();
        int[][] array = new int[n][n];

        Random rand = new Random();
        //заполнение
        for (row = 0; row < array.length; row++) {
            for (col = 0; col < array[row].length; col++) {
                array[row][col] = rand.nextInt(5);
            }
        }

       //вывод матрицы
        for(row = 0; row < array.length; row++) {
            for(col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(row = 0; row < array.length; row++) {
            for(col = 0; col < array[row].length; col++) {
                if (array[row][col] % 2 == 0){
                    array[row][col] = 0;
                } else {
                    array[row][col] = 1;
                }
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }

    }

}