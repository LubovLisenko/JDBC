package com.goit.jdbc.feature.database;

public class FindLongestProject {
 private long id;
 private int month_count;

    public FindLongestProject(long id, int month_count) {
        this.id = id;
        this.month_count = month_count;
    }

    @Override
    public String toString() {
        return "FindLongestProject{" +
                "id=" + id +
                ", month_count=" + month_count +
                '}';
    }
}
