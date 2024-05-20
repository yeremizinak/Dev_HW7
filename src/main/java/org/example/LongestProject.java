package org.example;

public class LongestProject {
    private String name;

    @Override
    public String toString() {
        return "LongestProject{" +
                "name='" + name +
                '}';
    }

    public LongestProject(String name){
        this.name = name;
    }
}
