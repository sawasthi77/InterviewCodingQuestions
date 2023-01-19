public interface Interface2 extends Interface1{
    default void m1(){
        System.out.println("We are in m1 method of Interface 2");
    }
}
