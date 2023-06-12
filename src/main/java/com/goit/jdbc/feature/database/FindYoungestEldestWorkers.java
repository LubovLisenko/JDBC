package com.goit.jdbc.feature.database;

public class FindYoungestEldestWorkers {
    private String type;
    private String name;
    private String birthday;

    public FindYoungestEldestWorkers(String type, String name, String birthday) {
        this.type = type;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "FindYoungestEldestWorkers{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
