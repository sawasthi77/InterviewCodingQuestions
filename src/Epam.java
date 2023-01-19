import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Epam {
    // string length > 3 chararcters
    //output walter, Jill
     // int arr [] = {1,2,3,4,5,6} shift three positions towards left {4,5,6,1,2,3} if you shift 2 positions {3,4,5,6,1,2}
    //same array
    public static void main(String[] args) {
//        List<List<String>> stringList = new ArrayList<>(List.of(List.of("Sam", "Walter", "Jill"), List.of("Joe","KIM")));
//        stringList.stream().flatMap(s -> s.stream().filter(str -> str.length() > 3)).collect(Collectors.toList());
// first index the arr.length - shifted places 6 - = 3 6 - 3 + 1 = 4; 6 - 3 + 2 = 5 6 - 3 + 3 = 6
        // 6 - 3 +3 3, 6 -3 +4,
        // 6-2+0, 6 -2+1,
//        int arr[] = {1,2,3,4,5,6};
//        for(int i = 0; i < arr.length; i ++){
//            if( i == 0){
//
//            }
//        }

        // FI accepts 2 inputs and we have to return greater number using java 8.

//        BiFunction<Integer, Integer, Integer> integerBiFunction = (a,b) -> a > b ? a:b;
//        integerBiFunction.apply(2,3);

        // Exception e = Assertions.assertThrows(InvalidAgeException.class -> )
        //assert.equals("invalid age you have entered", e.getMessage());

        //Binary Search {1,2,4,8}
        int arr[] = {1,2,4,8};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,0,3,18));

    }

    private static int binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last) / 2;
        while (first <= last){
            if(arr[mid] < key){
                first = mid + 1;
            }else if (arr[mid] == key){
                return mid;
            }else{
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return 0;
    }
}
