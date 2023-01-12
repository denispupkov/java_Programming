package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

     String str = "20";
        System.out.println(str+1); // returns String
        int num1 = Integer.parseInt(str)+1; //returns primitive Type
        System.out.println(num1);
        Integer num2 = Integer.valueOf(str); // returns Wrapper Class
        System.out.println(num2);

        String s = "20.5";
        double d = Double.parseDouble(s); //primitive
        System.out.println(d);

        Double d1 =Double.valueOf(s); //wrapper
        System.out.println(d1);

        String x = "true";
        boolean b = Boolean.parseBoolean(x); // primitive
        System.out.println(b);

        Boolean b1 = Boolean.valueOf(x); //wrapper
        System.out.println(b1);

        char ch = '1';
       System.out.println(Character.isDigit(ch));

      String str1 = "a1b2c3d4e5";
      int sum = 0;
       for (int i = 0; i < str1.length(); i++) {
          if (Character.isDigit(str1.charAt(i))) {
             sum+=Integer.parseInt(str1.charAt(i)+"");
          }
       }
        System.out.println(sum);
    }
}
