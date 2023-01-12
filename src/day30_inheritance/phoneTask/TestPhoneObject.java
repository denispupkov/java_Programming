package day30_inheritance.phoneTask;

import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Samsung;

public class TestPhoneObject {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("IPhone 12","Large","Black",1000.5);
        Samsung samsung = new Samsung("Galaxy S22","Medium","White",1100);
        Nokia nokia = new Nokia("Brick","Small","Pink",50);

        iPhone.call(911);
        samsung.call(911);
        nokia.call(911);

        iPhone.text(133213211);
        samsung.text(132456798);
        nokia.text(123465799);

        System.out.println("___________________");

        iPhone.faceTime(456465687);
        samsung.freeze();
        nokia.selfDefense();

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);



    }



}
