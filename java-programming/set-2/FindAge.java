// find age using current date and date of birth
  import java.util.Calendar;
  import java.util.Scanner;

  class FindAge
  {
    public static void main(String v[])
    {
      Scanner s = new Scanner( System.in );

      System.out.println("Enter year of birth");
      int year = Integer.parseInt( s.nextLine() );

      Calendar c = Calendar.getInstance();
      int age = c.get( Calendar.YEAR ) - year;

      System.out.println("Age = " + age);
      System.out.println(c.get( Calendar.YEAR ));
    }
  }