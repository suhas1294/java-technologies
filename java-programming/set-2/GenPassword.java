// generate a 8 digit password which can include both numbers and alphabets
import java.util.Random;

class GenPassword
{
  public static void main( String v[] )
  {
    Random r = new Random( );
    String pwd="";
    for(int i=1; i<=8; i++)
    {
     int decide = r.nextInt( 2 );
     if( decide == 1 )
     {
       int random_integer = r.nextInt( 26 ) ;
       char some_char = ( char )( random_integer + 65 );
       System.out.print("random character generated is : "+ some_char+" and integer equavalent is "+random_integer+"+(65)"+ "\n");
       pwd = pwd + some_char;
     }
     else
     {
       pwd = pwd + r.nextInt( 10 );
     }
   }
   System.out.println ("\n"+ pwd );

 }
}