package day19_Array;

import java.util.Arrays;

public class AlphabetLetters {

    public static void main(String[] args) {

        char [] alphabets = new char[26];
        char [] alphabets2 = new char[26];

        char ch = 'a';
        char ch2 = 'z';
        for (int i = 0; i < alphabets2.length; i++) {
            alphabets[i]+=ch2;
            ch2--;
        }
        System.out.println(Arrays.toString(alphabets));
        //System.out.println(Arrays.toString(alphabets2));
    }


}
