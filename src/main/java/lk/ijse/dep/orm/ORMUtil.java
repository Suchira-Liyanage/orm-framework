package lk.ijse.dep.orm;

import java.util.Properties;

public class ORMUtil {

    public static void init(Properties dbProperties, Class... entities) {
        String username = dbProperties.getProperty("javax.persistence.jdbc.username");
        String password = dbProperties.getProperty("javax.persistence.jdbc.password");
        String url = dbProperties.getProperty("javax.persistence.jdbc.url");
        String driverClassName = dbProperties.getProperty("javax.persistence.jdbc.driver_class");

    }
}
