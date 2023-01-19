import java.util.Arrays;

public class Interview3 {

    // Palindrome string
    // test can be null,
    public static void main(String[] args) {
        System.out.println(palindromeString("naman"));
    }

    private static Boolean palindromeString(String test){
        if(test == ""){
            System.out.println("String is empty");
        }
        else{
            char inputArray[] = test.toCharArray();
            int len = inputArray.length;
            char reversedArray[]= new char[len];
            for(int j = 0; j < len ; j ++){
                reversedArray[len - 1 - j] = inputArray[j];
            }
            if(Arrays.equals(inputArray, reversedArray)){
                return true;
            }
        }
        return false;
    }
}
