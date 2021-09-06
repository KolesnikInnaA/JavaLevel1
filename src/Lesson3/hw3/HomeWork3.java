package Lesson3.hw3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        task1(array);


        //2.
        int[] task2 = new int[100];
        for (int i = 0; i < task2.length; i++) {
            task2[i] = i + 1;
            System.out.print(task2[i] + " ");
        }
        System.out.println("* ");

        //3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3(array3);

        //4
        int[][] arrayTask4 = new int[4][4];
        for (int i =0; i < arrayTask4.length; i++){
            for (int j = 0; j < arrayTask4[i].length; j++){
                if (i == j){
                    System.out.print(arrayTask4[i][j]=1);
                   }
                else
                    System.out.print(arrayTask4[i][j]=0);
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(task5(2,1)));

        //Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] arrTask6 = {3, 2, 12, 18, 4, 1};
           int min = 8;
           int max = 9;
                for (int i = 0; i < arrTask6.length; i++) {
                if (arrTask6[i] < min) {
                    min = arrTask6[i];
                }
                if (arrTask6[i] > max) {
                    max = arrTask6[i];
                }
            }
        System.out.println(Arrays.toString(arrTask6));
        System.out.println("min: " +min);
        System.out.println("max: " + max);


        int[] arrTask7 = {3, 8, 12, 18, 4, 2};
        //System.out.println(task7(arrTask7));
        boolean boolTask7;
        boolTask7 = task7(arrTask7);
        System.out.println("результат выполнения 7 задания: " + boolTask7);


    }

    //1.
    public static void task1(int[] arr) {
        System.out.println("Before: " + Arrays.toString(arr));
        for (int i = 0; i < 10; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        System.out.println("After:  " + Arrays.toString(arr));
    }

    //3.
    public static void task3(int[] arr) {
        System.out.println("Before: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6)
                arr[i] *= 2;
        System.out.println("After:  " + Arrays.toString(arr));
    }
//Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
// типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] task5 (int  len, int initialValue){
        int [] arraytask5 = new int[len];
        for (int i =0; i < len; i++) {
            arraytask5[i] = initialValue;
        }
        return arraytask5;
        }

    public static boolean task7(int[] array7) {
        boolean res = false;
        float sum = 0;
        for (int i = 0; i < array7.length; i++){
            sum = sum + array7[i];
            System.out.println("№ итерации: " + i + " сумма " + sum );
        }
        float sum2 = sum/2;
        System.out.println("half of sum: " + sum2);
        int c = 0;
        for (int i = 0; i < array7.length; i++){
           c = c + array7[i];
           if (sum2 == c){
               res = true;
               //System.out.println("Получилось!  " + res);
           }

        }
        return res;
    }
}





