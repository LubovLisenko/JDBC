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

    // "initDbSql": "sql/init_db.sql"

//    public void initDb(Database database) {
//        String initDbFileName = new Prefs().getString(Prefs.INIT_DB_SQL_FILE_PATH);
//        String sql = null;
//        try {
//            sql = String.join(
//                    "\n",
//                    Files.readAllLines(Paths.get(initDbFileName)));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        database.executeUpdate(sql);
//
//
//    }

    public static void main(String[] args) {
        Connection conn = Database.getInstance().getConnection();
            try {
                String sql = Files.readString(Path.of(INIT_DB_FILENAME));
                conn.createStatement().executeUpdate(sql);

            } catch (IOException | SQLException e) {
                throw new RuntimeException(e);
            }
       }

    }

