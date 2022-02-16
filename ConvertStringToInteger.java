import java.util.HashMap;
import java.lang.Math;

// Write a Java program that take a string input and convert it to an integer without
// using the build-in parse function.
// Example: input value “123”, convert it to an integer type with value 123

public class ConvertStringToInteger {
    
    public static int convert(String userString) {
        int stringLen = userString.length();
        int result = 0;

        if(userString == null || stringLen == 0){
            System.out.println("User string is null or empty. Returning 0...\n");
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
    
            boolean isStringOfNumbers = false;
        
            if(charArray[0] == '-'){
                // check string for any non-number character
                for(int i = 1; i < stringLen; i++){
                    if(!stringToInteger.containsKey(charArray[i])){
                        System.out.println("The user inputted string is not a number. Returning 0...\n");

                        isStringOfNumbers = false;
                        break;
                    }
                    else {
                        isStringOfNumbers = true;
                    }
                }
            }
            else{
                // check string for any non-number character
                for(int i = 0; i < stringLen; i++){
                    if(!stringToInteger.containsKey(charArray[i])){
                        System.out.println("The user inputted string is not a number. Returning 0...\n");
                        isStringOfNumbers = false;
                        break;
                    }
                    else {
                        isStringOfNumbers = true;
                    }
                }
            }
    
            // iterate through charArray and extract integers
            if(isStringOfNumbers){
                // if it's negative
                if(charArray[0] == '-'){
                    for(int i = 1; i < stringLen; i++){
                        result += stringToInteger.get(charArray[i]) * (int)Math.pow(10, (stringLen-i-1));
                    }
                    result *= -1;
                }
                // else it's positive
                else {
                    for(int i = 0; i < stringLen; i++){
                        result += stringToInteger.get(charArray[i]) * (int)Math.pow(10, (stringLen-i-1));
                    }
                }

                System.out.println("Conversion sucessfull. Returning result...\n");
            }
            else{
                result = 0;
            }

        }

        return result;
    }
}
