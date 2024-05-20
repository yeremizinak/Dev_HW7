package org.example;

import java.util.Date;

public class YoungestEldestWorkers {
    private String name;
    private String type;
    private Date birthday;

    @Override
    public String toString() {
        return "YoungestEldestWorkers{" +
                "name='" + name + '\'' +
                ", type=" + type +'\'' +
                ", birthday=" + birthday +
                '}';
    }

    public YoungestEldestWorkers(String name, String type, Date birthday){
        this.name = name;
        this.type = type;
        this.birthday = birthday;
    }
}
