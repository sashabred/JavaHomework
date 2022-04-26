package lesson9;

import javax.swing.*;
import java.util.*;

public class Collection {

    public static void main(String[] args) {
        //Задание 2
        /*List<String> initList= new ArrayList<String>();
        initList.addAll(Arrays.asList("qwe", "qwe", "spr", "spr", "kls", "wkl"));
        System.out.println(deleteDuplicates(initList));*/

        //Задание 3

        List<Integer> arrList = new ArrayList<Integer>();
        List<Integer> linkList = new LinkedList<Integer>();

        //addAndGetElements(arrList);
        //addAndGetElements(linkList);

        //Задание 4
        User person1 = new User("Sasha");
        User person2 = new User("Lee");
        User person3 = new User("Arthur");
        User person4 = new User("Stanislav");

        Random rand = new Random();

        HashMap<User, Integer> map = new HashMap<User, Integer>();
        map.put(person1, (rand.nextInt(10) + 1));
        map.put(person2, (rand.nextInt(10) + 1));
        map.put(person3, (rand.nextInt(10) + 1));
        map.put(person4, (rand.nextInt(10) + 1));

        map.forEach( (u,s) -> System.out.println("User: " + u.getName() + ", Score: " + s));

        getUserScore(map);
    }



    // Задание 2. Удалить дубликаты в коллекции
    public static List<String> deleteDuplicates(List<String> arrList) {

        Set<String> set = new HashSet<>(arrList);
        arrList.clear();
        arrList.addAll(set);

        return arrList;
    }


    //Задание 3.
    // Добавить 1 000 000 эл-в в список
    public static void addAndGetElements(List<Integer> arr) {
        long time = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arr.add(i);
        }

        getElements(arr);

        System.out.println("Выполнение программы заняло: "+(System.currentTimeMillis() - time)+" миллисекунд");

    }

    //выбрать 100 000 случайных элементов
    public static void getElements(List<Integer> arr) {
        Integer rand = (int)Math.floor(Math.random()*(arr.size()+1));

        for (int i = 0; i < 100000; i++) {
            arr.get(rand);
        }

    }

    //Задание 4. Cчитать имя и вернуть очки

    private static void getUserScore(HashMap<User,Integer> map) {
        System.out.println("Введите имя участника:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(map.entrySet()
                            .stream()
                                .filter(e-> e.getKey().getName().equalsIgnoreCase(input))
                                        .findFirst()
                                            .get()
                                                .getValue());



    }

}





