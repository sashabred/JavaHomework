package lesson6.childParent;

import java.util.Scanner;

public abstract class Parent {
    public int age;

    public void setAge() {
        System.out.println("Введите возраст:");
        Scanner ageScan = new Scanner(System.in);
        age = ageScan.nextInt();
    };

    public abstract void getAge();

}
