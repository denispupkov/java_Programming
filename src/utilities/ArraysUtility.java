package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {

            if (arr1.length > i) {
                arr3[i] = arr1[i];
            } else if (arr1.length - 1 < i) {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {

            if (arr1.length > i) {
                arr3[i] = arr1[i];
            } else if (arr1.length - 1 < i) {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {

            if (arr1.length > i) {
                arr3[i] = arr1[i];
            } else if (arr1.length - 1 < i) {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {

            if (arr1.length > i) {
                arr3[i] = arr1[i];
            } else if (arr1.length - 1 < i) {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        return arr3;
    }

    public static int[] reverse(int[] array) {

        int[] reverseArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reverseArray[j] = array[i];
        }
        return reverseArray;
    }

    public static double[] reverse(double[] array) {

        double[] reverseArray = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reverseArray[j] = array[i];
        }
        return reverseArray;
    }

    public static char[] reverse(char[] array) {

        char[] reverseArray = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reverseArray[j] = array[i];
        }
        return reverseArray;
    }

    public static String[] reverse(String[] array) {

        String[] reverseArray = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reverseArray[j] = array[i];
        }
        return reverseArray;
    }

    public static int[] addElement(int[] arr, int element) {

        int[] new_array = Arrays.copyOf(arr, arr.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static char[] addElement(char[] arr, char element) {

        char[] new_array = Arrays.copyOf(arr, arr.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static String[] addElement(String[] arr, String element) {

        String[] new_array = Arrays.copyOf(arr, arr.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static double[] addElement(double[] arr, double element) {

        double[] new_array = Arrays.copyOf(arr, arr.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static boolean contains(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }
    public static boolean contains(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }
    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }
    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.contains(element)) {
                return true;
            }
        }
        return false;
    }

    public static int [] remove (int [] array, int index) {
        int [] newArray = new int[array.length-1];

        int k = 0;
        for (int i = 0; i < index; i++, k++) {
            newArray[k] = array[i];
        }
        for (int j = index+1; j <= newArray.length; j++, k++) {
            newArray[k] = array[j];
        }
return newArray;
    }
    public static int [] removeDup (int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[i] == array[j]) {
                  array[i] = 0;
                  count++;
                }
            }
        }
        int [] newArray = new int[array.length-count];

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0) {
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }
}


