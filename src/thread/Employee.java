package thread;

public class Employee  implements Comparable<Employee>{
    private int employeeId;
    private int age;

    public Employee(int employeeId, int age) {
        this.employeeId = employeeId;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {

        if(this.age > o.age)
            return 1;
        else if(this.age < o.age)
            return -1;

        return 0;
    }

    @Override
    public String toString(){
        return  "Employee - { " + " employeeId : " + employeeId + ", age : " + age + " }";
    }
}
