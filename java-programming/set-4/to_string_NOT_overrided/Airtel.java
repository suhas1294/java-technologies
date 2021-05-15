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
    s1.getBalance();
    s2.getBalance();
    System.out.println("**** result of not overriding ****");
    System.out.println(s1);
    System.out.println(s2);
  }
}