// generate an array and fill it randomly and search for the desired number given by user at run time

import java.util.*;

class SearchElementInArray
{
  public static void main(String v[])
  {
    Scanner s = new Scanner( System.in );

    System.out.println("Enter array size ");
    int n = Integer.parseInt( s.nextLine() );
    int a[ ] =  new int [ n ];

    Random r = new Random();
    for(int i=0; i<n; i++)
    {
      a[i] = r.nextInt( 1000 );
    }

    Arrays.sort( a );

    System.out.println("After sorting ");
    for(int i=0; i<n; i++)
    {
      System.out.print( a[i] + "\t");
    }

    System.out.println("Enter element to search");
    int x = Integer.parseInt( s.nextLine() );

    int p = Arrays.binarySearch( a , x );
    if( p < 0 )
      System.out.println("Not found");
    else
      System.out.println("Found at position = " + p );
      // p = 1 if match is found else it is random negative intger
  }

}

