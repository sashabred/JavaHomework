package lesson7;

public class Airplane {

    public static void main(String[] args) {
        Airplane.AirplaneWing wing1 = new Airplane.AirplaneWing();
        wing1.setWingWieght(100);
        wing1.getWingWeight();

        Airplane.AirplaneWing wing2 = new Airplane.AirplaneWing();
        wing2.setWingWieght(150);
        wing2.getWingWeight();
    }

    static class AirplaneWing {

        public int wingWeight;

        public void getWingWeight() {
            System.out.println("Вес крыла: "+ wingWeight);
        }

        public void setWingWieght(int wingWeight) {
            this.wingWeight = wingWeight;
        }
    }

}
