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
    public static final String FIND_YOUNGEST_ELDEST_WORKERS = "sql/find_youngest_eldest_worker.sql";

    public static final String PRINT_PROJECT_PRICES = "sql/print_project_prices.sql";

    private static final Connection conn = Database.getInstance().getConnection();

    public static final String NAME = "name";
    public static final String PROJECT_COUNT = "PROJECT_COUNT";

    public static final String SALARY = "salary";

    public List<FindMaxSalaryWorker> findMaxSalaryWorkers (){
        List <FindMaxSalaryWorker> findMaxSalaryWorkerList = new ArrayList<>();
        try {
            String sql = Files.readString(Path.of(FIND_MAX_SALARY_WORKER));
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                FindMaxSalaryWorker findMaxSalaryWorker = new FindMaxSalaryWorker();
                findMaxSalaryWorker.setName(rs.getString("name"));
                findMaxSalaryWorker.setSalary(rs.getInt("salary"));
                findMaxSalaryWorkerList.add(findMaxSalaryWorker);
            }

        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }

        return findMaxSalaryWorkerList;
    }
}
