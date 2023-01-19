import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingTwoXoriant {

    public static void main(String[] args) {

        int[] arr1={5,6,1,2,2,1};

        // output = {3,4}

//        HashMap<Integer, String> hm = new HashMap<>();
//        hm.put(1,"aa");
//        hm.put(2,"bb");
//        hm.put(3,"cc");
//        hm.put(4,"dd");
//
//        // find a key for value bb
//       hm.entrySet().stream().filter(h -> h.getValue().equals("bb")).
//               forEach( i -> System.out.println(i.getKey()));

        Arrays.sort(arr1);
        //Object arr[] = List.of(arr1).stream().distinct().collect(Collectors.toList()).toArray();
        int diff = 0;
        for (int i = 0; i< arr1.length - 1; i++){
            //1,1,3,4,5,6
            if( arr1[i+1] - arr1[i] == diff)
            {
                continue;
            }else{
                diff = arr1[i+1] - arr1[i];
            }
        }

    }
}
