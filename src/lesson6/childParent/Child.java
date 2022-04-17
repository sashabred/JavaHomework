package lesson6.childParent;

public class Child extends Parent{

    @Override
    public void getAge() {
        if (age == 0) {
            System.out.println("Возраст наследника не определен");
        } else {
            System.out.println("Возраст наследника: " + age);
        }

    }
}
