import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LTI {
    // some data from database List<Users>
    public static void main(String[] args) {
//        List<users> usersList = new ArrayList<>(); // from database
//        List<String> userName = usersList.stream().map(user -> user.getName()).
//                collect(Collectors.toList());
//        // consider
//        Optional<String> userToBeSearched = userName.stream().filter(user -> user.contains("saumya")).findFirst();
//        userToBeSearched.ifPresent( s -> System.out.println(s));

        LTI lti = new LTI();
//        String str = String.valueOf(lti.add(10,20));
//        String str1 = (String)lti.add(10,20);
//        System.out.println(str);
//        lti.add("10", "20");

        //.XLS, .DAT, Database
        // 3 interfaces 1. excel file, 2 .DAT file, 3. Database connection
        // Enum to get the type of files.
        // methods : processData()
        // Main Interface FileProcessor processData()
        // FileProcessingFactory method where logic to create objects
        // Main class we are making of this factory to get the objects as per requirement.

    }
    // Method Overloading
    public int add(int a, int b){
        return a + b;
    }

    public void add(String a, String b){
        String sum = a + b;
        System.out.println(sum );
    }
}
