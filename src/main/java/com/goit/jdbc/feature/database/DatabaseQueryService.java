package com.goit.jdbc.feature.database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {

    private Database database;

    public static final String FIND_LONGEST_PROJECT = "sql/find_longest_project.sql";
    public static final String FIND_MAX_PROJECTS_CLIENT = "sql/find_max_projects_client.sql";
    public static final String FIND_MAX_SALARY_WORKER = "sql/find_max_salary_worker.sql";
    public static final String FIND_YOUNGEST_ELDEST_WORKERS = "sql/find_youngest_eldest_workers.sql";

    public static final String PRINT_PROJECT_PRICES = "sql/print_project_prices.sql";

    private static final Connection conn = Database.getInstance().getConnection();

    public static final String NAME = "name";
    public static final String PROJECT_COUNT = "PROJECT_COUNT";
    public static final String SALARY = "salary";
    public static final String ID = "id";
    public static final String MONTH_COUNT = "month_count";
    public static final String TYPE = "type";
    public static final String BIRTHDAY= "birthday";
    public static final String PRICE = "price";


    public List<FindMaxSalaryWorker> findMaxSalaryWorkers (){
        ArrayList <FindMaxSalaryWorker> findMaxSalaryWorkerList = new ArrayList<>();
        try {
            String sql = Files.readString(Path.of(FIND_MAX_SALARY_WORKER));
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String name = rs.getString(NAME);
                int salary = rs.getInt(SALARY);
               findMaxSalaryWorkerList.add(new FindMaxSalaryWorker(name, salary));
            }

        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        return findMaxSalaryWorkerList;
    }

    public List<MaxProjectCountClient> findMaxProjectsClient() {
        ArrayList <MaxProjectCountClient> maxProjectCountClients = new ArrayList<>();
        try
        {
            String sql = Files.readString(Path.of(FIND_MAX_PROJECTS_CLIENT));
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString(NAME);
                int projectCount = rs.getInt(PROJECT_COUNT);
                maxProjectCountClients.add(new MaxProjectCountClient(name, projectCount));

                // conn.close();
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);

        }
        return  maxProjectCountClients;
    }

    public ArrayList <FindLongestProject> findLongestProjects (){
        ArrayList <FindLongestProject> findLongestProjectArrayList = new ArrayList<>();
        try
        {
            String sql = Files.readString(Path.of(FIND_LONGEST_PROJECT));
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                long id = rs.getLong(ID);
                int month_count = rs.getInt(MONTH_COUNT);
                findLongestProjectArrayList.add(new FindLongestProject(id,month_count));

                // conn.close();
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);

        }
        return  findLongestProjectArrayList;

    }
    public List<FindYoungestEldestWorkers> findYoungestEldestWorkers(){
        ArrayList <FindYoungestEldestWorkers> findYoungestEldestWorkersList = new ArrayList<>();
        try
        {
            String sql = Files.readString(Path.of(FIND_YOUNGEST_ELDEST_WORKERS));
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String type = rs.getString(TYPE);
                String name = rs.getString(NAME);
                String birthday = rs.getString(BIRTHDAY);
                findYoungestEldestWorkersList.add(new FindYoungestEldestWorkers(type, name, birthday));

                // conn.close();
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);

        }
        return  findYoungestEldestWorkersList;
    }

    public List<PrintProjectPrices> printProjectPrices(){
        ArrayList<PrintProjectPrices> printProjectPricesList =new ArrayList<>();
        try
        {
            String sql = Files.readString(Path.of(PRINT_PROJECT_PRICES));
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                long id = rs.getLong(ID);
                int price = rs.getInt(PRICE);
                printProjectPricesList.add(new PrintProjectPrices(id,price));
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);

        }

        return printProjectPricesList;
    }

    }



