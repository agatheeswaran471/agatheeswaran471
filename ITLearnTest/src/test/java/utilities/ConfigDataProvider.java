package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider{
	public static Properties properties= null;

	public static Properties loadPropertyfile() throws IOException{

		FileInputStream fileInputStream= new FileInputStream("./Configuration/config.properties");
		properties=new Properties();
		properties.load(fileInputStream);
		return properties;
	}
}



