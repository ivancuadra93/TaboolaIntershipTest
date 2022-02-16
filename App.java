import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        boolean quit = false;
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object

        while(!quit){
            // Menu
            System.out.println("Main Menu");
            System.out.println("Please select one of the following options: ");
            System.out.println("1: Convert String to Integer");
            System.out.println("2: Detect Integer in String");
            System.out.println("3: Quit Program");
            
            // Accept User Input
            int option = userInput.nextInt();  // Read user input
            userInput.nextLine(); // to catch any extra input
   
            System.out.println();
                      
            // Go to appropriate file for option
            switch (option) {
                case 1:
                    System.out.println("Please enter a string that you want converted: ");
                    String userString = userInput.nextLine();  // Read user input
                    ConvertStringToInteger.convert(userString);
                    break;

                case 2:
                    System.out.println("Please enter a string to detect from: ");
                    String userString2 = userInput.nextLine();  // Read user input
                    DetectIntegerInString.detect(userString2);
                    break;

                case 3:
                    quit = true;
                    System.out.println("Quitting program...\n");
                    break;

                default:
                    System.out.println("Please enter a valid option. Returning to main menu.\n");
                    break;
            }   
        }

        userInput.close();
    }
}
