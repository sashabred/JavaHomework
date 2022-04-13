package lesson3;

public class Main {
    public static void main(String[] args) {
        //Задание 3.1
        Study newStudy = new Study();
        System.out.println(newStudy.printCourse());

        //Задание 3.2
        Car Auto = new Car("Toyota will vs","black", 230);
        System.out.println(Auto.printCar());

        //Задание 3.3
        House myHome = new House();
        myHome.setInfo("г. Улан-Удэ, ул. Советская, д. 3", 11, 1989);
        System.out.println(myHome.getInfo());
        System.out.println(myHome.getAge());

        House myWork= new House();
        myHome.setInfo("г. Санкт-Петербург, ул. Фрунзе, д. 15", 5, 1965);
        System.out.println(myHome.getInfo());
        System.out.println(myHome.getAge());

        //Задание 3.4
        Tree firstTree = new Tree();
        Tree secondTree = new Tree(8, "Дуб");
        Tree thirdTree = new Tree(3, "Сосна", true);
        System.out.println(firstTree.toString());
        System.out.println(secondTree.toString());
        System.out.println(thirdTree.toString());

    }
}
