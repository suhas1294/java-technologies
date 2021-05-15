import java.util.*;

class Bank
{
  private int amt;

  public void deposit(int val)
  {
    amt = amt + val;
    System.out.println("Deposit successfull , current balance :" + amt );
  }

  public void withdraw( int val)
  {
    if( amt - val < 0 )
      System.out.println("Not enough cash");
    else
    {
      amt = amt - val;
      System.out.println("Withdraw successfull , current balance :" + amt );
    }
  }

  // since this class is private, while compiling easyPay.java error is thrown
  // if u make this class as protected/public, it works fine
  private int getBalance()
  {
    return amt;
  }

}