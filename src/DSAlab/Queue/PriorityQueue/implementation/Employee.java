package DSAlab.Queue.PriorityQueue.implementation;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee> {
    private int empID;
    private String name;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return 0;
    }
}
