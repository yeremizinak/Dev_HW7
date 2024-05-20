package org.example;

public class MaxSalaryWorker {
    private String name;
    private Long salary;

    @Override
    public String toString() {
        return "MaxSalaryWorker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public MaxSalaryWorker(String name, Long salary){
        this.name = name;
        this.salary = salary;
    }
}
