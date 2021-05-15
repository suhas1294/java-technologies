// accept register name and name of candidate DURING 'RUN TIME'  and dispay
import java.util.Scanner;

class rtimeData
{
  public static void main(String v[])
  {
    Scanner s = new Scanner( System.in );

    System.out.println("Enter regno");
    int regno = Integer.parseInt( s.nextLine() );

    System.out.println("Enter name");
    String name = s.nextLine();

    System.out.println("-----------------------------");
    System.out.println("Register no : " + regno );
    System.out.println("Name        : " + name );
    System.out.println("-----------------------------");
  }

}
