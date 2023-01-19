package interview_prep;

public class Employee {
    private Long id;
    private int salary;
    private Long deptid;
    private String status;

    public Employee(Long id, int salary, Long deptid, String status) {
        this.id = id;
        this.salary = salary;
        this.deptid = deptid;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
