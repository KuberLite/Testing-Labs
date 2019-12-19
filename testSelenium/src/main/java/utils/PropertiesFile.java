package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
    public static String getProperty(String key) {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream("src/main/resources/res.property");
            prop.load(input);
            prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
