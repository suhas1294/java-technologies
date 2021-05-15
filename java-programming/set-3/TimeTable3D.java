// generate a 3 dimensional  time table [ example :  [3 teacher] [6 subject] [days]   ]

import java.util.*;

class TimeTable3D
{
  public static void main( String v[ ] )
  {
    String subjects[ ] = { "c++", "gr", "me", "tc" , "c", "free", "ada" , "ds" , "oy" , "ps", "rt" , "java" , "c#" , "j#"};

    String table[ ][ ][ ] = new String[ 3 ][ 6 ] [ 4 ];

    Random r = new Random();

    for(int T=0; T<=2; T++)
    {
      System.out.println("-----------------------------------");
      System.out.println("Teacher-" + (T+1));
      System.out.println("-----------------------------------");
      for(int day=0; day<=5; day++)
      {
        for(int hour=0; hour<=3; hour++)
        {
         int ndx = r.nextInt( subjects.length );
         table[T][day][hour] =  subjects[ ndx ];
         // System.out.print ("day-"+day+"\t"); // for understanding purpose only
         System.out.print ( table [T][ day ] [ hour ] + "\t");
       }
       System.out.print("\n");
     }
   }

 }
}