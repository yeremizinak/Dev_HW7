package org.example;

public class ProjectPrices {
    private String name;
    private Long price;

    @Override
    public String toString() {
        return "ProjectPrices{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public ProjectPrices(String name, Long price){
        this.name = name;
        this.price = price;
    }
}
