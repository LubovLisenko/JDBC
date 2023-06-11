package com.goit.jdbc.feature.database;

import com.goit.jdbc.feature.database.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        Connection connection = Database.getInstance().getConnection();

//        String selectSql = "SELECT id, name FROM human WHERE id=1";
//        Statement st = database.getConnection().createStatement();
//        st.executeQuery(selectSql);

       DatabaseQueryService databaseQueryService =new DatabaseQueryService();
      // System.out.println(databaseQueryService.findMaxProjectsClient());
        //System.out.println("databaseQueryService.findMaxSalaryWorkers() = " + databaseQueryService.findMaxSalaryWorkers());
   databaseQueryService.findMaxSalaryWorkers();
    }
}