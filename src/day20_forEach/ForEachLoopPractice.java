package day20_forEach;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11};

        for (int each : numbers) {
            if (each%2!=0) {
                System.out.println(each);
            }
        }
        System.out.println("______________");

        int [] nums = {100,20,30,40,5,4,3,1,2,1000,300,500};
        int max = nums[0];

        for (int each: nums) {
            if (max<each) {
                max=each;
            }

        }
        System.out.println(max);
    }
}
