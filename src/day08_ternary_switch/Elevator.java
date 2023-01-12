package day08_ternary_switch;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 2;
        String result = "Invalid Floor - "+floorNumber;
        String floor1 = "Lobby, Verizon, Starbucks";
        String floor2 = "Cydeo, NASA, Itelsat";
        String floor3 = "Lyft, BofA, Stake House";

        if (floorNumber>0 && floorNumber<4) {

            result = "Floor "+floorNumber+" is selected. Companies: ";

            if (floorNumber==1) {
                result+=floor1;
            }
            else if (floorNumber==2) {
                result+=floor2;
            }
            else {
                result+=floor3;
            }

        }
        System.out.println(result);

    }
}
