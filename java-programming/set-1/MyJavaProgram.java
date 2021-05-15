public class MyJavaProgram {

   public static void main(String []args) {
      System.out.println("Hello World");
      System.out.println("===================");
      System.out.println("Another way of printing in java is to use String.format..");
      int a=10, b=20,c;
      c=a+b;
      String s = String.format("Sum of %d and %d is %d",a,b,c);
      System.out.println(s);
      System.out.println("===================");
      System.out.println("ALWAYS COMMAND LINE ARGUMENTS IN JAVA PROGRAM SHOULD BE IN THE FORM OF STRING TYPE");
      System.out.println("===================");
      System.out.println("Converting string to other type using Parse");
      System.out.println("Ex : int a = Integer.parseInt('456') will return i as 456");
      System.out.println("int a = 10, int to string : String s = String.valueOf(a)");
      System.out.println("===================");
      String x = "hello world";
      x = x.toUpperCase();
      System.out.println(x);
      System.out.println("===================");
      System.out.println("Some common string methods : ");
      String d = "reach2cp@yahoo.co.in";
      System.out.println("d.startsWith('http')");
      System.out.println("d.endsWith('com')");
      System.out.println("d.indexOf('cp')");
      System.out.println("d.indexOf('a', 5) : instruction to start from position 5");
      System.out.println("d.lastIndexOf('c') : search from right towards left");
      System.out.println("Extracting substring : s.substring(4,9)");
      System.out.println("===================");
      System.out.println("'SPLIT' function based on delimiter");
      String g = "india,china,nepal,japan";
      String vals[] = g.split(",");
      System.out.println(vals[0]);
      System.out.println("===================");
      System.out.println("Comparing strings methods : ");
      System.out.println("string_1.equals(string_2)");
      System.out.println("string_1.equalsIgnoreCase(string_2)");
      System.out.println("compareTo : comparison based on ASCII values");
      System.out.println("===================");
      System.out.println("compareTo function will return result of INT type");

      String string_1 = "great";
      String string_2 = "gross";
      String string_3 = "zonal";
      String string_4 = "zodiac";
      String string_5 = "sun";
      String string_6 = "sun";

      int p = string_1.compareTo(string_2);
      String p_in_string =String.valueOf(p);

      int r = string_3.compareTo(string_4);
      String r_in_string = String.valueOf(r);

      int t = string_5.compareTo(string_6);
      String t_in_string = String.valueOf(t);

      String all_strings = String.format("%s,%s,%s,%s,%s,%s", string_1, string_2, string_3, string_4, string_5, string_6);
      System.out.println(all_strings);

      System.out.println(String.format("result of string_no.compareTo(string_no) is %d", p ));
      System.out.println(String.format("result of string_no.compareTo(string_no) is %d", r ));
      System.out.println(String.format("result of string_no.compareTo(string_no) is %d", t ));

      System.out.println("Comparison of string_1 and string_2 is : "+p_in_string);
      System.out.println("Comparison of string_3 and string_4 is : "+r_in_string);
      System.out.println("Comparison of string_5 and string_6 is : "+t_in_string);
      System.out.println("===================");
      System.out.println("Extracting character from a string : s.charAt(2) ");
   }
}