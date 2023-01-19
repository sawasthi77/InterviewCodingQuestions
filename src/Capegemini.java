import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Capegemini {
    // find duplicate elements of integers {1,2,3,2,3,4} output = {2,3}
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,2,3));
        Map<Integer, List<Integer>> hm = list.stream().collect(Collectors.groupingBy( c -> c));
        System.out.println(hm);
        List<Integer> out = new ArrayList<>();
        for(Map.Entry<Integer, List<Integer>> h : hm.entrySet()){
            if((h.getValue().size() > 1)){
                out.add(h.getKey());
            }
        }
        System.out.println(out);
    }
}
