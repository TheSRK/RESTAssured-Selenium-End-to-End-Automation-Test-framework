package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesManager {
    String configFilePath;
    Properties properties = new Properties();
    String propValue;

    public PropertiesManager(String configFilePath){
        this.configFilePath = configFilePath;
    }

    public String getProperty(String strKey) {
        try {
            File f = new File(configFilePath);
            if (f.exists()) {
                FileInputStream in = new FileInputStream(f);
                properties.load(in);
                propValue = properties.getProperty(strKey);
                in.close();
            } else
                System.out.println("File not found!");
        } catch (Exception e) {
            System.out.println(e);
        }
        return propValue;
    }

    public void setProperty(String mpropKey, String mpropValue)
            throws Throwable {
        try {
            File f = new File(configFilePath);
            if (f.exists()) {
                FileInputStream in = new FileInputStream(f);
                properties.load(in);
                properties.setProperty(mpropKey, mpropValue);
                properties.store(new FileOutputStream(configFilePath), null);

                in.close();
            } else {
                System.out.println("File not found!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void removeProperty(String mpropKey) {
        try {
            File f = new File(configFilePath);
            if (f.exists()) {
                FileInputStream in = new FileInputStream(f);
                properties.load(in);
                properties.remove(mpropKey);
                properties.store(new
                        FileOutputStream(configFilePath), null);
                in.close();
            } else
                System.out.println("File not found!");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
