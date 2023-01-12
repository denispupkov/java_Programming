package day17_customClass;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";


        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (!result.contains(str.charAt(j)+"")) {
                result += str.charAt(j) + "" + count;
            }
        }
        System.out.println(result);
    }
}
