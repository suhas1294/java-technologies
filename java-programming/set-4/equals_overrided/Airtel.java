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

    s1.recharge( 55 );

    System.out.println( s1 );
    System.out.println( s2 );

    if( s1.equals( s2 ) )
      System.out.println("Use any sim card for calling , as they have same currency");
    else
      System.out.println("Check sim balance before calling");

  }
}