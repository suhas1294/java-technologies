// accept a number and find its MULTIPLICATION TABLE
class MultiplicationTable
{
  public static void main( String args[ ] )
  {
    if( args.length == 0 )
      System.out.println("No arguments found..");
    else
    {
      int num = Integer.parseInt( args[0] );
      for(int i=1; i<=10; i++)
      {
        String o = String.format("%d x %d = %d", num , i , num*i );   //  System.out.println(num+"X"+i+"="+num*i);
        System.out.println( o );                 //  System.out.println(num+"X"+i+"="+num*i);
      }
    }
  }
}