import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class NewClassInterview {

    // print numbers from 1 to 10;
    //sorting hashmap based on value
    public static void main(String[] args) throws InterruptedException {
        Map<String, String> hm = new HashMap<>();
        hm.put("sam", "jam");
        hm.put("cam", "bum");
        hm.put("hein", "frickle");
        hm = hm.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
        System.out.println(hm);


    }
}