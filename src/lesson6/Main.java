package lesson6;

import lesson6.bank.Client;
import lesson6.bank.EmployeeBank;
import lesson6.car.Truck;
import lesson6.childParent.Child;
import lesson6.inputNum.NumChild;

public class Main {
    public static void main(String[] args) {

       //Задание 1 и 2. Абстрактные классы и интерфейс
//       Client clientAnny = new Client("Anna", "Ivanova", "VTB");
//       EmployeeBank employeeSasha = new EmployeeBank("Sasha", "Novik", "Sberbank");
//
//       System.out.println(clientAnny.getBankName());
//       System.out.println(clientAnny.getAll());
//       System.out.println(employeeSasha.getBankName());
//       System.out.println(employeeSasha.getAll());

       //Задание 3. Автомобили
//       Truck toyota = new Truck(100,"Town Ace", 'w', 130, 4, 180.0);
//       toyota.newWheels(5);

       //Задание 4. : В главном классе:создайте поле для ввода целого числа; В классе-наследнике: метод для вывода переменной из главного класса.
       //Создайте объект на основе класса наследника и выведите через метод переменную с главного класса.
       NumChild num = new NumChild(15);
       System.out.println("Возраст: "+num.getAge());

       //Задание 5. метод для получения возраста пользователя; Создайте класс-наследник. Добавьте в него: переопределенный метод для получения имени пользователя;
       //Создайте объект на основе класса-наследника и используйте для него метод из класса.
//       Child ch1= new Child();
//       ch1.setAge();
//       ch1.getAge();

    }
}
