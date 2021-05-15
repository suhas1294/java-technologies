//generate a number in GIVEN range and allow user to guess it within 6 trials give hints... [guess number game]

import java.util.*;

class GuessNumberGame
{
  public static void main( String v[])
  {
    Random r = new Random( );
    int genNum = r.nextInt( 100 );

    Scanner s = new Scanner( System.in );
    System.out.println("Guess number(0-99) within 6 attempts");

    for(int i=1; i<=6; i++)
    {
      int guess = Integer.parseInt( s.nextLine() );
      if( guess == genNum )
      {
        System.out.println("U won the game");
        System.exit(0);
      }
      if( guess < genNum && i<=5 )
        System.out.println("Try some greater number");

      if( guess > genNum && i<=5 )
        System.out.println("Try some lesser number");
    }
    System.out.println("Sorry u lost the game , correct number =" + genNum );
  }
}

