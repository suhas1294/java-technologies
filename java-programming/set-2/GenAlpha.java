//input a number and output it's equivalent alphabet [ generating alphabet ]
import java.util.Random;

class GenAlpha
{
  public static void main(String v[])
  {
    Random r = new Random();
    int rv = (r.nextInt( 26 ) + 65);
    System.out.println ("random numb generated : "+rv);
    System.out.println ("character equivalent of it : "+(char)rv);
    // range will be between 26 to 91
    // https://i.stack.imgur.com/ocfbM.png
  }
}