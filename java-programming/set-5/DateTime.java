// Simple example of Inheritance and ilustration of "super" Keyword

class Date
{
  private int d , m , y;

  public Date( int d, int m , int y )
  {
    this.d = d;
    this.m = m;
    this.y = y;
  }

  public String toString( )
  {
    return String.format("%d-%d-%d", d,  m , y );
  }

}

class DateTime extends Date
{
  private int h , m , s;

  public DateTime( int other_then_d , int other_then_m , int other_then_y , int h , int min, int s )
  {
    super( other_then_d , other_then_m , other_then_y );
    this.h = h;
    this.m = min;
    this.s = s;
  }

  public String toString()
  {
    return super.toString() + "  " + String.format("%d:%d:%d", h ,m , s );
  }

  public static void main( String v[])
  {
    DateTime d = new DateTime( 5 , 6 , 2012 , 10 , 45 , 12);
    System.out.println( d );
  }

}













