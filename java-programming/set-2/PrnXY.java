// Generate a random value for  'x' and  'y'
// x range : 0 to 80
// y range : 0 to24
// print value separated by  ','

import java.util.*;

class PrnXY
{
  public static void main(String v[])
  {
    Random r = new Random();

    int x = r.nextInt( 81 );
    int y = r.nextInt( 25 );

    System.out.println( x + "," + y );
  }
}