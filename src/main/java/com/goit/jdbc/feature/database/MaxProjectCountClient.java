package com.goit.jdbc.feature.database;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class MaxProjectCountClient {
    private String name;
    private int projectCount;

    public MaxProjectCountClient (String name, int projectCount){
        this.name = name;
        this.projectCount = projectCount;
    }

    @Override
    public String toString() {
        return "MaxProjectCountClient{" +
                "name='" + name + '\'' +
                ", projectCount=" + projectCount +
                '}';
    }
}
