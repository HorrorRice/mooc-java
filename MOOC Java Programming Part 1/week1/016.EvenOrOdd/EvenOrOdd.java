
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        
            System.out.print("Enter a number: ");
		int number = Integer.parseInt(reader.nextLine());
		boolean evenOrOdd = number % 2 == 0;
                    if(evenOrOdd) {
			System.out.println("The number is odd");
                    } else {
			System.out.println("The number is even");
                    }
			

        // NOTE:
        // Parity of a value can be easily checked with modulo-operator %.
        // Test the following:
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int value = 8
        // System.out.println( value%2 );

    }
}
