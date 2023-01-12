package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 6 ; i++) {

            //if we want to skip iteration #4
            if (i==4) {
                continue;
            }
            System.out.println("i = " + i);

        }

        for (int i = 10; i < 21; i++) {
            if (i%2==0) {
            continue;
            }
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 50; i < 101; i++) {
            if (i%2!=0) {
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);
    }
}
