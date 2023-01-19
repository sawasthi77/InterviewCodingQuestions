import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview111 {
    //Remove the second occurrence's in this sentence
    // input str = "A bird in the"
    // output :
    //int = [1,1, 2,2,3, 3, 2, 3, 4, 5,5]
    public static void main(String args[]){
        List<Integer> integerList = List.of(1,1, 2,2,3, 3, 2, 3, 4, 5,5);
        Map<Integer, List<Integer>> hm = integerList.stream().collect(Collectors.groupingBy(c -> c));
        List<Integer> outputList = new ArrayList<>();
        for(Map.Entry<Integer, List<Integer>> h: hm.entrySet()){
            if(h.getValue().stream().count() > 1){
                outputList.add(h.getKey());
            }
        }
        System.out.println(outputList);
    }
}
