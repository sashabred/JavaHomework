package lesson4;

import java.util.Scanner;

public class Cycles {

    //Выводим на консоль нечетные числа от 1 до 99
    public static void exc1 () {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Выводим на консоль числа которые делятся на 3, 5 и на то и другое
    public static void exc2 () {
        for(int i =3; i<101; i++) {
            if (i%3 == 0 && i %5==0) {
                System.out.println("Делится на 3 и на 5: "+i);
            } else if (i%5 == 0) {
                System.out.println("Делится на 5: "+i);
            } else if (i%3==0) {
                System.out.println("Делится на 3: "+i);
            }
        }
    }

    //Вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу. Пример вывода:

    public static void exc3 () {
        int num1, num2, num3;

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        num1 = scan1.nextInt();
        System.out.println("Введите второе число число: ");
        num2 = scan2.nextInt();
        System.out.println("Введите третье число число: ");
        num3 = scan3.nextInt();

        boolean result = ( num1 + num2 == num3 ? true : false);

        System.out.println("Результат: "+ result);

    }

    // принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа

    public static void exc4 () {
        int num1, num2, num3;

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        num1 = scan1.nextInt();
        System.out.println("Введите второе число число: ");
        num2 = scan2.nextInt();
        System.out.println("Введите третье число число: ");
        num3 = scan3.nextInt();

        boolean result = ( num1 < num2 && num2 <num3 ? true : false);

        System.out.println("Результат: "+ result);

    }

    //появляется ли число 3 как первый или последний элемент массива целых чисел

    public static void exc5 (int[] arr) {

        if (arr.length > 2) {
            if (arr[0] == 3 || arr[arr.length-1]==3) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("Слишком мало данных");
        }
    }

    //проверить, что массив содержит число 1 или 3.

    public static void exc6 (int[] arr) {
        for (int num : arr) {
            if (num == 1 || num == 3) {
                System.out.println("Массив содержит числа 1 или 3");
                break;
            } else {
                System.out.println("Массив не содержит числа 1 или 3");
            }
        }

    }


}
