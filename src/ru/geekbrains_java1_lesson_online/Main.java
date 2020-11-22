package ru.geekbrains_java1_lesson_online;

import java.util.Arrays;

public class Main {
    //здесь вызываем методы
    //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
  //2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
  //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
  //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

    public static void main(String[] args) {
	// здесь пишем методы
        int[] ar0= {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(ar0));
        change(ar0);
        System.out.println(Arrays.toString(ar0));

        int[] ar1 = new int[8];
        System.out.println(Arrays.toString(ar1));
        filler(ar1);
        System.out.println(Arrays.toString(ar1));

        int[] ar2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(ar2));
        doubling(ar2);
        System.out.println(Arrays.toString(ar2));

        System.out.println(findMax(ar2));
        System.out.println(findMin(ar2));




    }
    private static void change(int[] a) {
        for (int i = 0; i< a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
    }
    private static void filler(int[] a) {
        for (int i = 0; i< a.length; i++) {
            a[i] = i *3 +1;
        }
    }
    private static void doubling(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] <6) {
                a[i] *=2; //a[i] = a[i] *2
            }
        }
    }
    private static int findMin(int[] a) { // поиск значения элемента
        int min = a[0]; //предполагаем, что в а0 лежит минимальное значение
        for (int i = 0; i <a.length; i++) {//тут проверяем, действительно ли в а0 лежит минимальное число
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    private static int findMax(int[] a) {//ищем максимальный индекс
        int max = 0;
        for (int i =1; i<a.length; i++) {
            if (a[i]>a[max])
                max = i;
        }
        return max;
    }
}
