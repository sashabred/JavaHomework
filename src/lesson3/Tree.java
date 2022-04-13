package lesson3;

public class Tree {
    private int age;
    private boolean alive;
    private String name;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, String name, boolean alive) {
        this.age = age;
        this.name = name;
        this.alive = alive;
    }

    public String toString() {
        return (name == null ? "У дерева нет названия" : "Дерево - " + name)
                + (age == 0 ? ", не знаем сколько ему лет" : ", возраст - " + age)
                + (alive ? ", живое" : ", неживое");
    }
}
