package day36_polymorphism;

import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;

public class PolymorphismPractice {

    public static void main(String[] args) {


        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Pink", 350),
                new Nokia("G10", "Medium", "Black", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };

        int countIphones = 0;
        for (Phone each:phones) {
            System.out.println(each.getModel()+" - "+each.getColor()+" - "+each.getPrice());
            if (each instanceof IPhone) {
                countIphones++;
            }
        }
        System.out.println("countIphones = " + countIphones);


        for (Phone each : phones) {
            if  (each instanceof IPhone || each instanceof Samsung && each.getPrice()>=700) {
                System.out.println(each);

            }



        }
        }
    }


