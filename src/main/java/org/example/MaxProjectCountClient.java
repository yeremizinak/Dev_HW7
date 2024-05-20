package org.example;

public class MaxProjectCountClient {
    private String name;
    private int projectCount;

    @Override
    public String toString() {
        return "MaxProjectCountClient{" +
                "name='" + name + '\'' +
                ", projectCount=" + projectCount +
                '}';
    }

    public MaxProjectCountClient(String name, int projectCount){
        this.name = name;
        this.projectCount = projectCount;
    }
}
