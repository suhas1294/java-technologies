// Important Methods/Examples :
// Do not execute these file, for reference only

// set-1
// _________________________

assert number <= 10;

some_variable = some_string.indexOf("@"); //find position of "@", result is index value
some_string.substring( 0 , some_variable ); // extract substring from index 0 to some_variable

double some_variable = Double.parseDouble("5"); //String to Integer conversion
int a = 256; String some_variable = String.valueOf(a); //Integer to String conversion

String some_variable = String.format("%d x %d = %d", num , i , num*i ); //Print Dynamically
some_variable = some_variable.toUpperCase(); // capitalize
some_variable.startsWith('http'); // returns boolean result
some_variable.endsWith('com'); // returns boolean result

another_variable = "india,nepal,bhutan,andaman";
another_variable.split(","); // split based on ',' => will return array
string_1.equals(string_2); // comparison of string
string_1.equalsIgnoreCase(string_2) ;// compare two string, ignore case
some_string.lastIndexOf('@') ;//search from right to left
string_1.compareTo(string_2); // compareTo is based on ascii values, will return result of INT type
char some_char = some_string.charAt(2); // extracting character froma string based on its index position
int h = Integer.parseInt(v[0].split(":")[0]); // example of extracting h from h:m:s
for(int i=0; i<nums.length; i++) // for loop in java

// simple if-else loop in java, there is no 'end'
if( provider.equals("9845"))
else if( provider.equals("9342"))
else

// set-2
// _________________________________________________

// importing statements in java at top of the file
import java.util.Date;
import java.util.Calendar; // most advanced than java Date class
import java.util.Scanner;
import java.util.Random;

Scanner s = new Scanner( System.in ); // take input from keyboard at run time
int year = Integer.parseInt( s.nextLine() );

// initializing Date object
Date d = new Date();
int some_number = d.getYear()+1900; // to get current year, add 1900

// initializing Calendar object
Calendar c = Calendar.getInstance();
int current_year = c.get( Calendar.YEAR );
int cy = c.get( Calendar.YEAR );

// initializing random object
Random r = new Random();
int d = r.nextInt( 10 ); // selects random number less than 10

// Generating Random alphabet
Random r = new Random();
System.out.println ( ( char ) ( r.nextInt( 26 ) + 65 ) );

// Refer VowelCount.java for case statements in java
System.exit(0); //to break out of loop

// SET-3
// _________________________________________

int some_array[ ] =  new int [array_size]; // initializing array
Arrays.sort( some_array ); // sorting arrays
Arrays.binarySearch(array,element) //method to search array element

break; //can be used inside if condition
String table[ ][ ] = new String[ 6 ] [ 4 ]; // two dimensional array
String table[ ][ ][ ] = new String[ 3 ][ 6 ] [ 4 ]; // 3-dimensional array

// Constructor rules
- Should be same name as class
- Should be public
- can be overloaded
- No return type

// Java array of objects
class Person
{
  ....
}

Person p[] = new Person[100];
for(int i=0; i<p.length;i==)
{
  p[i] = new Person();
}

// SET-4 : OOPS in java overriding
// _________________________________________________
object class toStrinf() always print instance address in hex format
Ex: Employee e = new Employee();
by default System.out.println(e) = Employee@18ela
To print the object's content, we need to override toString as :

public String toString(){
  return empno, name, job etc..
}

After overriding
System.out.println(e) = 1 , foo_name, programmer ..
===========================
object_1.equals(object_2) returns true only if instances of both objects are same(which wont be if they are created seperately).

Car c1 = new Car();
c1.setSpeed(10);
Car c2 = new Car();
c2.setSpeed(10);

c1.equals(c2) returns false
===========================
Car c1 = new Car();
Car c2 = c1;

c1.equals(c2) returns  true
===========================
Accessor and Mutator is equavavalent to attr_accessor in ruby
===========================
"this" in java is "self" in ruby
===========================

// Set-5 : Inheritance
// _________________________________________________

- While inheriting we dont specify "public" or "private", it is always "public"
class A
{
  // something
}
class B extends A
{
  // something
}

-Always Base class Constructor(without arguments) is called before Derived class

SUPER : https://www.javatpoint.com/super-keyword

-"SUPER" keyword can be used anywhere in the function body if not Constructor, basically "super" keyword is usedto invoke BASE class function.

- super can be used to refer immediate parent class instance variable.
- super can be used to invoke immediate parent class method.
- super() can be used to invoke immediate parent class constructor.


-"final"  keyword usage in java :
(1) at class level (no Inheritance)
(2) at member function level(we can't override new version of function in derived class, no overriding)
(3) at data member level (ex : final int MaxSpeed = 180;)

// SET-6 : Creating custom packages in java

step 1 : create a folder by the name of packages
step 2 : In that folder,create a java class to be used. first line of file should be "package package_name;"
step 3 : outside the folder, create a feature class and first line of file : import package_name.*;
step 4 : It's done !

package_name.class_name obj = new package_name.class_name;
Class_name.Function_name(arguments_if_any);

For more about ABSTRACT CLASS, plz refer abstract_class.png in SET-6
