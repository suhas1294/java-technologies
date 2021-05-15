// demonstration of abstract method

abstract class Bike{
  // abstract method below
  abstract void run();

  // NOTE : abstract method must end with semicolon
  //        abstract methods have no implementation
  //        Once abstract method is declared, it has to be overrided in inherited class

  // NON-abstract method : No semicolon, has to be defined
  void wheeling()
  {
    System.out.println("super");

  }
}

class Honda4 extends Bike{
  // note below, abstract method is overrided
  void run(){System.out.println("running safely..");}

  // NON-abstract method overrided
  void wheeling(){System.out.println("Doing wheeling!");}

  public static void main(String args[]){
    Bike obj = new Honda4();
    obj.run();
    obj.wheeling();

    System.out.println("-----------------");

    Honda4 new_obj = new Honda4();
    new_obj.wheeling();
    new_obj.run();
  }
}

// output :
// running safely..
// Doing wheeling!