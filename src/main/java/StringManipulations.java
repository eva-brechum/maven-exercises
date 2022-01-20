import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        System.out.println("Please enter a letter or number");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("You have entered a number");
            }
//            else if (userInput) {
//            System.out.println("not valid");


            System.out.println("Please enter words");
            Scanner scanner = new Scanner(System.in);
            String userWords = scanner.nextLine();
            System.out.println(StringUtils.swapCase(userWords));

        System.out.println("Please enter a sentence");
//        Scanner sc = new Scanner(System.in);
//        String userSentence = sc.new Scanner(System.in)
        }
    }

