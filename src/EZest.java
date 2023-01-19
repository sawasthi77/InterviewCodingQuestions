import java.util.*;
import java.util.stream.Collectors;

public class EZest {

    public static void main(String[] args) {
        //string  = java is programming language
        String str = "java is programming language";
        char ch[] = str.toCharArray();
        List<Character> list = new ArrayList<>();
        Map<Object, List<Character>> hm = new HashMap();
        for(Character c: ch){
            list.add(c);
        }
        hm = list.stream().collect(Collectors.groupingBy(c -> c));
        System.out.println(hm);
    }
}
