// accept series of numbers separeted by "," and find their SUM by "EXTRACTING SUB STRING BY 'DELIMITOR' "
class SumArgs
{
  public static void main(String v[])
  {
    String nums[] = v[0].split(",");

    int s=0;
    for(int i=0; i<nums.length; i++)
    {
      s = s + Integer.parseInt( nums[i] );
    }

    System.out.println("Sum = " + s );
    System.out.println("Number of digits : "+nums.length);
  }
}