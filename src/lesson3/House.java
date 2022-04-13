package lesson3;

import java.util.Calendar;


public class House {
    private int floorNumber;
    private int year;
    private String address;

    public void setInfo (String address, int floorNumber, int year){
        this.address=address;
        this.floorNumber = floorNumber;
        this.year=year;
    }

    public String getInfo () {
        return "Адрес: " + address + ", количество этажей: "+ floorNumber + ", год постройки: " + year;
    }

    public String getAge () {
        Calendar today  = Calendar.getInstance();
        int age =  today.get(Calendar.YEAR)- year;
        return  "Дому уже " + age + "!";
    }



}
