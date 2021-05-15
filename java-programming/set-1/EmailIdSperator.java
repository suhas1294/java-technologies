// Accept email ID's and distinguish b/w user and provideer by using "EXTRACTING SUBSTRING  TILL DESIRED CHARCTER '@'  "
class EmailIdSperator
{
  public static void main( String v [ ]  )
  {
    int p = v[0].indexOf("@");

    if( p == -1 )
      System.out.println("Invalid mailid");
    else
    {
      System.out.println("'@' found at "+p+"th position");
      String usr = v[0].substring( 0 , p );
      String pro = v[0].substring( p+1 );

      System.out.println("Username : " + usr );
      System.out.println("Provider : " + pro );
    }

  }
}
