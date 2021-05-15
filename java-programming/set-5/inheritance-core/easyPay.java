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
