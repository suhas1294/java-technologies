// increment GIVEN  time by ONE SECOND
class NextTick
{
  public static void main(String v[])
  {
    int h = Integer.parseInt(v[0].split(":")[0]);   //[0] at last indicates 1st part of splited time i.e, hours
    int m = Integer.parseInt(v[0].split(":")[1]);
    int s = Integer.parseInt(v[0].split(":")[2]);

    ++s;
    if( s == 60 )
    {
      m++;
      s=0;

      if( m == 60 )
      {
        m=0;
        h++;
        if( h == 24 )
          h = 0;
      }
    }
    System.out.println( h + ":" + m + ":" + s);
  }
}
