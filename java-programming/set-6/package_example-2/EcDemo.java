import Govt.Election;

class EcDemo
{
  public static void main(String v[])
  {

    if( Election.CanVote( v[0] ) )
      System.out.println("Can vote");
    else
      System.out.println("Can't vote");
  }
}