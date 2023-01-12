package day16_nestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {

        String str = "aaabbccccddeeeeff";
        String result = "";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 2 && !result.contains(ch+"")) {
                result+=ch;
            }
        }
        System.out.println(result);



    }
}
