package HW4;

/*Создать и заполнить массив случайными числами, отсортировать массив по возрастанию,
 используя метод сортировки пузырьком.*/

import java.io.IOException;
import java.util.Scanner;

public class Task4n2 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i=0;i<array.length;i++)
            array[i] = (int) ( Math.random() * 10);
        for (int i: array)
            System.out.print( i + " " );

        int temp;
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for(int i = 0; i < array.length-1; i++){
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (int i : array){
            System.out.print(" " + i);
        }
    }
}