  import java.util.*;

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
       System.out.println("4. Balance");
       System.out.println("5. Exit");

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
       {
    //  System.out.println( e.getBalance() + " Rs ");

    //  e.getBalance( ) generates an error to show
    // private function is not allowed by object.

       }
       else if( ch == 5 )
        System.exit(0);

    }
  }
}