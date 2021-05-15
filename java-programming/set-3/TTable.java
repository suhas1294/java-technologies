// Q ]  generate a simple time table by using
// 'random' generation and
// 'array' generation
import java.util.*;

class TTable
{
  public static void main( String v[ ] )
  {
    String subjects[ ] = { "c++", "gr", "me", "tc" , "c", "free", "ada" , "ds" , "oy" , "ps", "rt" , "java" , "c#" , "j#"};

    String table[ ][ ] = new String[ 6 ] [ 4 ];

    Random r = new Random();

    for(int day=0; day<=5; day++)
    {
      for(int hour=0; hour<=3; hour++)
      {
        int ndx = r.nextInt( subjects.length );
        table[day][hour] =  subjects[ ndx ];
        System.out.print ( table [ day ] [ hour ] + "\t");
      }
      System.out.print("\n");
    }

  }
}
