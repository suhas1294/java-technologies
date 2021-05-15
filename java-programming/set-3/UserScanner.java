import java.util.*;
class UserScanner
{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int number;
    while (true){
      System.out.println("Enter a number\n");
      number = Integer.parseInt(s.nextLine());
      if (number != 007)
        System.out.println("You Entered : "+number);
      else
        break;
    }
  }
}