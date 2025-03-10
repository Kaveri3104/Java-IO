import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class ReadData {
    public static void main(String[] args) {
        Properties properties = new Properties();
        
        try (FileInputStream fileInputStream = new FileInputStream("config.properties")) {
            properties.load(fileInputStream);
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}