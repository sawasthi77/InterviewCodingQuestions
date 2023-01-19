import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UST {

    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        // output 15, 98
        Map<Integer, List<Integer>> hm = myList.stream().collect(Collectors.groupingBy(c -> c));
        for(Map.Entry<Integer, List<Integer>> h : hm.entrySet()){
            if(h.getValue().size() > 1){
                System.out.print(h.getKey());
            }
        }

    }
}

// query to write second highest salary of employee

//SELECT MAX(SAL) FROM EMP WHERE SAL NOT IN (SELECT MAX(SAL) FROM EMP);


