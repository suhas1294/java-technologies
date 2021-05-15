// generate an array , fill it randomly and , FIND  SECOND SMALLEST NUMBER

import java.util.*;

class SecondSmallest
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

    System.out.println("Before sorting");
    for(int i=0; i<n; i++)
    {
      System.out.print( a[i] + "\t");
    }

    Arrays.sort( a );

    System.out.println("\n"+"After sorting ");
    for(int i=0; i<n; i++)
    {
      System.out.print( a[i] + "\t");
    }

    for(int i=0; i<a.length; i++)
    {
      if( a[i]!=a[0])
      {
        System.out.println( "\n\nSecond smallest = " + a[i] );
        break;
      }
    }

  }
}