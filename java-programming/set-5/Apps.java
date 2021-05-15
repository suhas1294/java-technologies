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

  public int getBalance()
  {
    return amt;
  }

}

class easyPay extends Bank
{

  public void PhoneBill( int billamt )
  {
    if( getBalance( ) - billamt < 0 )
      System.out.println("Not enough balance to pay bills , please deposit cash and try again");
    else
      withdraw( billamt );
  }

}

class Apps
{
  public static void main( String v[] )
  {
    easyPay e = new easyPay( );
    Scanner key = new Scanner( System.in );

    while( true )
    {
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Pay bills");
      System.out.println("4. Exit");

      int ch = Integer.parseInt( key.nextLine( ) );

      if( ch == 1 )
      {
        System.out.println("Enter amount ");
        int amt = Integer.parseInt( key.nextLine( ) );
        e.deposit( amt );
      }
      else if( ch == 2 )
      {
        System.out.println("Enter amount ");
        int amt = Integer.parseInt( key.nextLine( ) );
        e.withdraw( amt );
      }
      else if( ch == 3 )
      {
        System.out.println("Enter amount ");
        int amt = Integer.parseInt( key.nextLine( ) );
        e.PhoneBill ( amt );
      }
      else if( ch == 4 )
        System.exit(0);

    }
  }
}
