package lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.out;

public class PracticeExc1
{
        public static void main(String[] args) {
            Excercise1to5();
            Excercise6();
        }

        public static void Excercise1to5 () {
        //Упражнение 1
            System.out.println("Упражнение 1:");
            System.out.println("Я");
            System.out.println("хорошо");
            System.out.println("знаю");
            System.out.println("Java");

        //Упражнение 2
            System.out.println("");
            System.out.println("---------");
            System.out.println("Упражнение 2:");
            System.out.println((46+10)*(10/3));
            System.out.println(29*4*(-15));

        //Упражнение 3
            System.out.println("");
            System.out.println("---------");
            System.out.println("Упражнение 3:");
            int number =10500;
            double result = (number/10)/10;
            System.out.println(result);

        //Упражнение 4
            System.out.println("");
            System.out.println("---------");
            System.out.println("Упражнение 4:");
            double a= 3.6;
            double b = 4.1;
            double c = 5.9;
            double result4 = a*b*c;
            out.println(result4);

        //Упражнение 5
            System.out.println("");
            System.out.println("---------");
            System.out.println("Упражнение 5:");
            try {
                BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Введите первое целое число: ");
                int num1 = Integer.parseInt(reader.readLine());
                System.out.println("Введите второе целое число: ");
                int num2 = Integer.parseInt(reader.readLine());
                System.out.println("Введите третье целое число: ");
                int num3 = Integer.parseInt(reader.readLine());

                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            } catch (Exception e) {
                System.out.println ("Ошибка: Вы ввели не целое число. "+ e.getMessage());
            }
        }

        //Упражнение 6
        public static void Excercise6 (){
            System.out.println("Упражнение 6:");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число:");
            int b = scanner.nextInt();
            if (b % 2 != 0) {
                System.out.println("Нечётное");
            } else if (b <= 100) {
                System.out.println("Чётное");
            } else {
                System.out.println("Выход за пределы диапазона");
            }
        }
    }






