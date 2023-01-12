package day18_GarbageCollection;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

        pizza1.size = 'L';
        pizza1.numberOfPepperoniTopping = 2;
        pizza1.numberOfCheeseTopping = 3;
        System.out.println(pizza1.calcCost());

        Pizza pizza2 = new Pizza();
        pizza2.setInfo('S',1,2);

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println("_________________________________________________");

        //if we want to calculate total cost of 20 small 20 medium, and 20 large pizza
        //we can use loop, creating 20 new Pizza objects for each size and using calcCost() method
        // we can find the total cost
        //P.S. in case if all ingredients are the same for each size

        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('S',2,2);
            total+=small.calcCost();

            Pizza medium = new Pizza();
            small.setInfo('M',3,4);
            total+=small.calcCost();

            Pizza large = new Pizza();
            small.setInfo('L',4,5);
            total+=small.calcCost();
        }
        System.out.println("total = " + total);

    }
}
