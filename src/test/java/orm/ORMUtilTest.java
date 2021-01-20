package orm;

import lk.ijse.dep.orm.ORMUtil;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class ORMUtilTest {

    private static Properties properties = new Properties();

    @BeforeClass
    public static void beforeClass() throws IOException {
        properties.load(ORMUtilTest.class.getResourceAsStream("/application.properties"));
    }

    @Test
    public void init() {
        ORMUtil.init(properties, Customer.class);
    }
}
