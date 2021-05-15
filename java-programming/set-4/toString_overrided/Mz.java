// create your own class say  "class - mobile server" with defined 'private functions' and "tag the program with - airtel provider"

// TOSTRING  OVERRIDED

class Mz
{

  private int cbal;

  public void activate( )
  {
    cbal = 10;
  }

  public void call( )
  {
    if( cbal == 0 )
      System.out.println("Not enough currency balance");
    else
      cbal--;
  }

  public void recharge( int amt )
  {
    cbal = cbal + amt;
  }

  // toString OVERRIDED
  public String toString( )
  {
    return "Balance  Rs." + cbal;
  }

}
