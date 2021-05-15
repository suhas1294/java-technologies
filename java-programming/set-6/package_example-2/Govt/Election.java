package Govt;
import java.util.*;
public class Election
{
  public static boolean CanVote( String dob)
  {
    int yob = Integer.parseInt( dob.split("/")[2] );
    Calendar c = Calendar.getInstance();
    int cy = c.get( Calendar.YEAR );
    int age = cy - yob;
    if( age>= 18)
      return true;
    else
      return false;
  }
}
