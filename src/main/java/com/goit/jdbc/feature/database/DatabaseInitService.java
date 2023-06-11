package com.goit.jdbc.feature.database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseInitService {
    public static final String INIT_DB_FILENAME = "sql/init_db.sql";


    public static void main(String[] args) {
            try  (Connection conn = Database.getInstance().getConnection()) {
                String sql = Files.readString(Path.of(INIT_DB_FILENAME));
                conn.createStatement().executeUpdate(sql);

            } catch (IOException | SQLException e) {
                throw new RuntimeException(e);
            }
       }
}

