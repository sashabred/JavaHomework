package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    //проверяет отсортирован ли массив по возрастанию
    public static void checkArraySort(int[] array) {
        boolean isTrue = true;

        for (int i =0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                isTrue = false;
            }
        }

        System.out.print((isTrue ? "OK" : "Please, try again"));

    }

    //считывает и выводит массив

    public static void createArray() {
        Scanner scan = new Scanner(System.in);
        Scanner data = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int arrayLength = scan.nextInt();
        int[] array = new int[arrayLength];
        int i = 0;
        while( i < arrayLength) {
            System.out.println("Введите целое число: ");
            int x = scan.nextInt();
            array[i] = x;
            i++;
        }
        System.out.println("Array length: "+arrayLength);
        System.out.println("Numbers of array:");
        for (int y : array) {
            System.out.println(y);
        }
    }

    //меняет местами первый и последний элемент массива. Пример вывода:

    public static void replaceEndWithBegin(int[] arr) {

        int x = arr[0];
        int y = arr[arr.length-1];

       arr[0] = y;
       arr[arr.length -1] =x;

        System.out.print("Numbers of array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //первое уникальное в этом массиве число
    public static void findUnique(int[] arr) {

        int x = 0;

        for (int i : arr) {
            for (int e: arr) {
                if (i == e ) {
                    x++;
                }
            }
            if (x == 1) {
                System.out.println("Unique number found:" +i);
                break;
            }
            x = 0;
        }
        System.out.println("Nothing was found");
    }

    //Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.
    public static void  addNewSortArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrayLength = scan.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = 0 + (int) (Math.random() * arrayLength);
        }

        mergeSort(array);
        System.out.print(Arrays.toString(array));

    }

    private static int[] mergeSort(int[] arrayS) {
        if (arrayS == null || arrayS.length < 2) {
            return arrayS;
        }

        int mid = arrayS.length/2;
        int[] left = new int[mid];
        int[] right;

        if (arrayS.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid+1];
        }

        for (int i =0; i<mid; i++) {
            left[i] = arrayS[i];
        }

        for (int j =0; j<right.length; j++) {
            right[j] = arrayS[mid+j];
        }
        left = mergeSort(left);
        right = mergeSort(right);

    return mergeParts(left, right, arrayS);

    }

    private static int[] mergeParts(int[] left, int[] right, int[] arr) {

        int leftSize = left.length;
        int rightSize = right.length;
        int i= 0;
        int j = 0;
        int k =0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            arr[k++] = left[i++];
        }
        while (j < leftSize) {
            arr[k++] = right[j++];
        }
        return arr;

    }


}
