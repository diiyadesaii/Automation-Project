package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    public static Properties properties;

    public static void loadProperties() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\riyad\\IdeaProjects\\AutomationProject\\src\\test\\resources\\config.properties");
        properties=new Properties();
        properties.load(file);
    }

    public static String getProperties(String s){
        return properties.getProperty(s);
    }
}
