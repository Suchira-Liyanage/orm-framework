package lk.ijse.dep.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ORMUtil {

    public static void init(Properties dbProperties, Class... entities) {
        String username = dbProperties.getProperty("javax.persistence.jdbc.username");
        String password = dbProperties.getProperty("javax.persistence.jdbc.password");
        String url = dbProperties.getProperty("javax.persistence.jdbc.url");
        String driverClassName = dbProperties.getProperty("javax.persistence.jdbc.driver_class");
        Connection connection = null;

        if (username == null || password == null || url == null || driverClassName == null) {
            throw new RuntimeException("Unable to initialize ORM framework without user-name, password, url, and driver");
        }

        try {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException throwables) {
            throw new RuntimeException("Failed to establish the connection", throwables);
        }
    }
}
