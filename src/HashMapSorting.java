import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class HashMapSorting {
    // input : HashMap<String,Integer> temp=new HashMap<String,Integer>();
    //        temp.put("MATH", 10);
    //        temp.put("HINDI", 5);
    //        temp.put("Science", 15);
    //        temp.put("physics", 2);
    //        temp.put("geography", 133);
    //        temp.put("Sanskrit", 7);

    //output :

    public static void main(String[] args) {

//        List<Integer> newList = new ArrayList<>(List.of(10,5,15,2,133,7));
//        List<Integer> outList = newList.stream().sorted().collect(Collectors.toList());
//        System.out.println(outList);

        HashMap<String, Integer> temp = new HashMap<>();
        temp.put("MATH", 10);
        temp.put("HINDI", 5);
        temp.put("Science", 15);
        temp.put("Physics",2);
        temp.put("Geography", 133);
        temp.put("Sanskrit", 7);
        System.out.println(temp);

        Map<String, Integer> sorted = temp.entrySet().stream().sorted(comparingByValue())
                .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(sorted);

    }
}
