package com.goit.jdbc.feature.database;

import com.goit.jdbc.feature.database.Database;

import java.sql.Connection;

public class Main {
    public static void main(String[] args)  {
        Connection connection = Database.getInstance().getConnection();
       DatabaseQueryService databaseQueryService =new DatabaseQueryService();
        System.out.println("databaseQueryService.findMaxProjectsClient() = " + databaseQueryService.findMaxProjectsClient());
        System.out.println("databaseQueryService.findMaxSalaryWorkers() = " + databaseQueryService.findMaxSalaryWorkers());
        System.out.println("databaseQueryService.findLongestProjects() = " + databaseQueryService.findLongestProjects());
        System.out.println("databaseQueryService.findYoungestEldestWorkers() = " + databaseQueryService.findYoungestEldestWorkers());
        System.out.println("databaseQueryService.printProjectPrices() = " + databaseQueryService.printProjectPrices());
    }
}