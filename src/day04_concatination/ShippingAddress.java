package day04_concatination;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Denis Wagner";
        int buildingNumber = 801;
        String streetName = "Englewood Parkway";
        String city = "Englewood";
        String state = "CO";
        int zip = 80110;

        System.out.println("Your Shipping address is:\n\t"+ name + "\n\t" + buildingNumber+ " "+
                streetName + "\n\t"+city + ", "+ state + " "+zip);

    }
}
