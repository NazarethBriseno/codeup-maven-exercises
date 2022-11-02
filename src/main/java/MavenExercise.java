import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.reverse;
import static org.apache.commons.lang3.StringUtils.swapCase;
import static org.apache.commons.lang3.math.NumberUtils.isNumber;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter something");
        String userInput = myScanner.nextLine();
        //Tells if the user entered a number or not
       if(isNumber(userInput)){
           System.out.println("You entered a number!");
       } else {
           System.out.println("This is not a number!");
       }
        System.out.println("Your input reversed is: ");
        System.out.println(reverse(userInput));
        System.out.println("Your input with flipped case is: ");
        System.out.println(swapCase(userInput));


    }



}
