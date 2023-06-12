package com.goit.jdbc.feature.database;

import lombok.Data;
import lombok.Setter;
import lombok.ToString;


public class FindMaxSalaryWorker {

    private String name;
    private int salary;
    FindMaxSalaryWorker(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FindMaxSalaryWorker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
