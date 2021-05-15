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

    public void getBalance( )
    {
      System.out.println("Balance  Rs." + cbal);
    }

  }