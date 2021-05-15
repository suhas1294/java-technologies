// find the network provider based on starting 4 digits of given phone number by method of   "extracting SUB STRING  method "
class findNetworkProvider
{
  public static void main( String v[] )
  {
    String mobile = v[0];
    if( mobile.length() == 10 )
    {
      String provider = mobile.substring( 0 , 4 );
      System.out.println("substring from 0 to 4 : "+ provider);
      if( provider.equals("9845"))
        System.out.println("Airtel");

      else if( provider.equals("9342"))
        System.out.println("Reliance");

      else
        System.out.println("Some other provider");

    }
    else
      System.out.println("Invalid mobile number");

  }
}