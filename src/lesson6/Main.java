package lesson6;

import lesson6.bank.Client;
import lesson6.bank.EmployeeBank;
import lesson6.car.Truck;
import lesson6.childParent.Child;

public class Main {
    public static void main(String[] args) {
       Client clientAnny = new Client("Anna", "Ivanova", "VTB");
       EmployeeBank employeeSasha = new EmployeeBank("Sasha", "Novik", "Sberbank");

       System.out.println(clientAnny.getBankName());
       System.out.println(clientAnny.getAll());
       System.out.println(employeeSasha.getBankName());
       System.out.println(employeeSasha.getAll());

       Truck toyota = new Truck(100,"Town Ace", 'w', 130, 4, 180.0);
       toyota.newWheels(5);

       Child ch1= new Child();
       //ch1.setAge();
       ch1.getAge();
    }
}
