package new_package;

public class GenericsClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsClass<String> genericsClass = new GenericsClass<>();
        genericsClass.setT("sam");

        GenericsClass integerGenericsClass = new GenericsClass();
        integerGenericsClass.setT(10);
        integerGenericsClass.setT("100");
        System.out.println(integerGenericsClass.getT());
    }
}
