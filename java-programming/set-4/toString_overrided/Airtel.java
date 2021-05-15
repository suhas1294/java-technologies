// "AIRTEL PROVIDER PROGRAM "  by  "application programmers" who uses "class created by "DOMAIN EXPERTS"

// "TOSTRING OVERRIDED "

class Airtel
{
  public static void main(String v[])
  {
    Mz  s1 = new Mz( );
    Mz  s2 = new Mz( );
    s1.activate( );
    s2.activate( ) ;

    for(int i=1; i<=5; i++)
      s1.call( );

    s2.recharge( 50 );
    System.out.println( s1 );
    System.out.println( s2 );

  }
}