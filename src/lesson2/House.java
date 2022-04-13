package lesson2;

public class House {

    private int id;
    public String city;
    public String street;
    public int number;
    public String block;


    public House() {
       city = "Иваново";
       street = "Столичная";
       number = 1;
    }
    public House(String curCity, String curStreet, int curHouseNum) {
        this.city= curCity;
        this.street=curStreet;
        this.number = curHouseNum;
    }

    public House(String curCity, String curStreet, int curHouseNum, String curHouseBlock) {
        this.city= curCity;
        this.street=curStreet;
        this.number = curHouseNum;
        this.block=curHouseBlock;
    }

   public String toString () {
        if ( block == null ) {
            return "г. " + city + ", ул." + street + ", д." + number;
        }
        else {
            return "г. " + city + ", ул." + street + ", д." + number + ", бл." + block;
        }
   }
}
