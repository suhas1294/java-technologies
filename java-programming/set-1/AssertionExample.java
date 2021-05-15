public class AssertionExample {
    public static void main(String[] args) {
        // get a number in the first argument
        int number = Integer.parseInt(args[0]);

        assert number <= 10; // stops if number > 10

        System.out.println("Pass");

    }
}

// Result
// java -ea AssertionExample 15
// Exception in thread "main" java.lang.AssertionError
// at AssertionExample.main(AssertionExample.java:6)

// java -ea AssertionExample 8
// Pass