// write a simple  banking programe which includes basic transactions like

// -deposit
// -withdraw
// -update and display current balance

import java.util.*;

class Bank
{

  private int amount;

   public Bank()
   {
    amount = 250;  // initial amt to open an account
   }

   public void Deposit( int amt )
   {
     amount = amount + amt;
   }

   public void Withdraw( int amt )
   {
    if( amount - amt < 250 )
      System.out.println("Not enough cash");
    else
      amount = amount - amt;
   }

   public void Balance()
   {
    System.out.println("Balance = " + amount );
   }

}

class BankMain
{
  public static void main( String v[])
  {

    Scanner key = new Scanner( System.in );

    System.out.println("Enter count of customers");
    int max = Integer.parseInt( key.nextLine());

    Bank  c[] = new Bank [ max ];

    for(int i=0; i<max; i++)
      c[i] = new Bank();

    int accno , amt;

    while( true )
    {
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Balance");
      System.out.println("4. Exit");

      int ch = Integer.parseInt( key.nextLine());

      switch( ch )
      {
        case 1:
        System.out.println("Enter account number and amount ");
        accno = Integer.parseInt( key.nextLine());
        amt = Integer.parseInt( key.nextLine());
        c[accno].Deposit( amt );
        break;
        case 2:
        System.out.println("Enter account number and amount ");
        accno = Integer.parseInt( key.nextLine());
        amt = Integer.parseInt( key.nextLine());
        c[accno].Withdraw( amt );
        break;
        case 3:
        System.out.println("Enter account number");
        accno = Integer.parseInt( key.nextLine());
        c[accno].Balance();
        break;
        case 4:
        System.exit(0);
      }

    }

  }

}