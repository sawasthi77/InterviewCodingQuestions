import java.util.*;

public class Example {
    public static void main(String args[]) {
        List<Integer> arrList = new ArrayList<>(List.of(2, 3, 4, 3, 3, 2, 4, 9, 1, 2, 5, 5));
        List<Integer> newArrayList = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        for( int i : arrList){
            Integer j = hm.get(i);
            hm.put(i, (j==null)? 1:j+1);
        }
        for(Map.Entry<Integer,Integer> val: hm.entrySet()){
            if(val.getValue() == 1){
                newArrayList.add(val.getKey());
            }
        }
        System.out.println(newArrayList);
    }
}

// SELECT MAX(SALARY) FROM EMPLOYEE
// WHERE SALARY IN (SELECT SALARY FROM EMPLOYEE MINUS
// SELECT MAX(SALARY) FROM EMPLOYEE);


// SELECT MAX(SALARY) FROM EMPLOYEE WHERE SALARY NOT IN (SELECT MAX(SAL) FROM EMP);

// SELECT MAX(SAL), DEPTNO FROM EMP GROUPBY DEPTNO

// SELECT STUDENTID FROM (SELECT ROWN NO, STUDENTID FROM STUDENT) WHERE MOD(ROWNO,2)=0
//select substring(1,5) as studentnam from student



//SELECT * FROM(SELECT DISTINCT SAL FROM EMP ORDERBY SAL DESC)
//WHERE ROWNUM<=3 minus //SELECT * FROM(SELECT DISTINCT SAL FROM EMP ORDERBY SAL DESC)
////WHERE rownum <=2
