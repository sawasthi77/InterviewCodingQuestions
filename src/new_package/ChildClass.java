package new_package;

public class ChildClass {

    public void createClass() {
        ParentClass parentClass = new ParentClass() {
            public void displayParent() {
                System.out.println("Inside child class");
            }
        };
        parentClass.displayParent();
    }
}
