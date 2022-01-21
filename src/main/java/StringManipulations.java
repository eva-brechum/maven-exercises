import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        System.out.println("Enter anything:");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (StringUtils.isNumeric(userInput)) {
            System.out.printf("%s You have entered:", userInput);
            } else {
            System.out.printf("%s is not a number ", userInput);
        }
        String flipCase = StringUtils.swapCase(userInput);
            System.out.printf(" %s has been swapped to get %s", userInput, flipCase);
          String reversed =StringUtils.reverse(userInput);
        System.out.printf("in reverse:%s", userInput, reversed);
        }
    }

