// Data type parsing in java
public class JavaParsing {

   public static void main(String args[]) {
      int x =Integer.parseInt("9");
      double c = Double.parseDouble("5");
      int b = Integer.parseInt("444",16); //parsed using hex base
      int bb = Integer.parseInt("444",10); //parsed using decimal base
      String dd = String.valueOf(x);
      String some_string = "5";

      System.out.println(x);
      System.out.println(c);
      System.out.println(b);
      System.out.println(bb);
      System.out.println(dd.getClass());
      System.out.println(some_string.getClass());
   }
}