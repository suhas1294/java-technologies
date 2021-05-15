// accept string from command line and count number of vowels with case statements
class VowelCount
{
  public static void main(String v[])
  {
    int count=0;
    String s = v[0].toLowerCase();

    for(int i=0; i<s.length(); i++)
    {
      switch( s.charAt(i) )
      {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':count++;
      }
    }
    System.out.println("Count of vowels = "  + count);
  }
}