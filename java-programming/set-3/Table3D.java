import java.util.*;
class Table3D
{
  public static void main(String[] args)
  {
    String sub[] = new String[16];
    Random rd = new Random();
    for (int x=0;x<16 ;x++) {
      String name = "";
      for (int yy=0;yy<5;yy++) {
        name = name + (char)(rd.nextInt(26) + 65);
      }
      sub[x] = name;
    }
    for (int ss=0;ss < sub.length; ss++ ) {
      System.out.print(sub[ss]+'\t');
    }

    String ttabl[][][] = new String[3][6][4];

    for (int teach = 0;teach<3 ;teach++ ) {
      System.out.println("\n\n"+"Teacher-"+teach);
      System.out.println("-------------------");
      for (int x = 0; x < 6 ; x++ ) {
        for (int y = 0; y< 4; y++ ) {
          int sub_name_numb = rd.nextInt(sub.length);
          ttabl[teach][x][y] = sub[sub_name_numb];
          System.out.print(ttabl[teach][x][y]+'\t');
        }
        System.out.println("\n");
      }
    }
  }
}

