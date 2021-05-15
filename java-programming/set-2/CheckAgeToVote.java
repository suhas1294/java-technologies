//calculate age and find if possible to vote
import java.util.Date;
import java.util.Scanner;

class CheckAgeToVote
{
  public static void main(String v[])
  {
   Scanner s = new Scanner( System.in );
   System.out.println("Enter year of birth");
   int year = Integer.parseInt( s.nextLine() );

   Date d = new Date();
   int age = ( d.getYear()+1900 ) - year;   //getYear() gives number of years after 1900 that u r leaving now
   System.out.println("Age = " + age );
   // int ddd = d.getYear();
   // System.out.println(ddd);
   // System.out.println("=============");
   if( age >= 18 )
     System.out.println("U can vote");
   else
     System.out.println("Can't vote");
 }
}
