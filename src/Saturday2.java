import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Saturday2 {
    public static void main(String[] args) {
//        List<String> stringList =
//                new ArrayList<>(List.of("saumya","awasthi","saumya","awasthi","aymuas","ihtsawa"));
//
//        // find saumya
//        stringList.stream().forEach( s -> {
//            StringBuffer sb = new StringBuffer(s);
//            StringBuffer sb2 = new StringBuffer("saumya");
//            System.out.println(sb.reverse() + " " +sb2);
//            boolean check = sb.reverse().equals(sb2);
//            System.out.println(check);
//            if(s.equals("saumya")) {
//                System.out.println("In normal form");
//            }
//            else if(check) {
//                System.out.println("Reverse order");
//            }
//        });
        EmployeeSat e1 = new EmployeeSat("saumya", 5000);
        EmployeeSat e2 = new EmployeeSat("awasthi", 2000);
        EmployeeSat e3 = new EmployeeSat("synechron", 6000);
        List<EmployeeSat> employeeList = new ArrayList<>(List.of(e1,e2,e3));
        System.out.println(employeeList.stream().sorted(Comparator.comparingInt(EmployeeSat::getSal)).map(e -> e.getSal()).collect(Collectors.toList()));
    }

    // a = 5 , b = 6
    // SELECT * FROM A,B
}

