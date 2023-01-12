package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {
            int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);



        for (char i = 65; i < 91; i++) {

            System.out.print(i+" ");

        }
        System.out.println("");
        System.out.println("__________________");
      for (char i = 'Z'; i >= 'A'; i--) {
           System.out.print(i+" ");
        }
    }
    
    
}
