package com.goit.jdbc.feature.database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabasePopulateService {
    public static final String POPULATE_DB_FILE = "sql/populate_db.sql";
    public static void main(String[] args) {
        Connection conn = Database.getInstance().getConnection();
        try  {
            String insertSql = Files.readString(Path.of(POPULATE_DB_FILE));
            conn.createStatement().executeUpdate(insertSql);
            conn.close();

        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
