package day21_multiDimentionalArray;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";
        int count = 0;
        boolean b = true;
        for (int i = 0; i < str1.length(); i++) {
            count = 0;
            for (int j = 0; j < str2.length() ; j++) {

                if (str1.length()!=str2.length()) {

                    break;
                }
                if (str1.charAt(i)==(str2.charAt(j))) {
                    count++;
                }
            }
            if (count>1 || count==0) {
                b = false;
                break;
            }
        }
        System.out.println(b);

    }
}
