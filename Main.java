import java.util.Scanner;

/**
 * FizzBuzz pattern
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask user for a number
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    int usersNum = input.nextInt();

    //declare a variable to count from
    int count = 0;

    //create while loop
    while (usersNum > count){
      
      count = count + 1;
     
      //create constant for divisibility by 3
      final int DIV_BY_3 = count % 3;

      //create constant for divisibility by 5
      final int DIV_BY_5 = count % 5;

      //create a constant for a number that means the division has no remainders
      final int NO_REMAINDER = 0;
      
      //create if statement to check the users number is divisible by 3, 5 or both
      if  (DIV_BY_3 == NO_REMAINDER && DIV_BY_5 == NO_REMAINDER ) {
       System.out.println("FizzBuzz");
     } else if (DIV_BY_5 == NO_REMAINDER){
       System.out.println("Buzz");
    }  else if (DIV_BY_3 == NO_REMAINDER) {
       System.out.println("Fizz");
    }  else {
       System.out.println(count);
    }
  
    }
    
    
  }
}
