package lesson3;

public class Car {
    private String color;
    private String name;
    private double weight;

    public Car () {
    }

    public Car (String color) {
        this.color = color;
    }

    public Car (String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public Car (String name, String color, double weight) {
        this.color = color;
        this.weight = weight;
        this.name = name;
    }

    public String printCar () {
        return "Марка:"+ name + ", цвет:"+ color + ", вес:" + weight;
    }
}
