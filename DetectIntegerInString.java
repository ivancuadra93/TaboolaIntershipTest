import java.util.HashMap;

// Write a Java program that take a input and detect whether there’s integer in
// there.
// Example: input value “45222” return true, input value “This Is A Test4me” return
// true, input value “IAMGOOD” return false
public class DetectIntegerInString {

    public static boolean detect(String userString) {
        int stringLen = userString.length();
        boolean result = false;

        
        if(userString == null || stringLen == 0){
            System.out.println("User string is null or empty. Returning false...\n");
        }
        else{
            char[] charArray = userString.toCharArray();
            HashMap<Character, Integer> stringToInteger = new HashMap<Character, Integer>(){{
                put('0', 0);
                put('1', 1);
                put('2', 2);
                put('3', 3);
                put('4', 4);
                put('5', 5);
                put('6', 6);
                put('7', 7);
                put('8', 8);
                put('9', 9);
            }};

            for(int i = 0; i < stringLen; i++){
                if(stringToInteger.containsKey(charArray[i])){
                    result = true;
                    break;
                }
            }
            if(result){
                System.out.println("The user inputted string contains at least one number. Returning true...\n");
            }
            else {
                System.out.println("The user inputted string does NOT contain a number. Returning true...\n");
            }

        }
        
        return result;
    }
}
