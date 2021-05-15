// accept two integers and ind their SUM
class SumPrg
{
  public static void main(String v[ ] )
  {
    if( v.length != 2 )
      System.out.println("No arguments found or more arguments");
    else
    {
      int a = Integer.parseInt( v[0] );
      int b = Integer.parseInt( v[1] );
      int c = a + b;
      System.out.println( "Sum = " + c );
    }
  }
}