package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PracticDataDriven {

	public static void main(String[] args) throws IOException 
	{
	FileInputStream filepath = new FileInputStream("./TestData/LoginandUrl.properties");
	Properties prop = new Properties();
	prop.load(filepath);
	String user = prop.getProperty("email");
	String password = prop.getProperty("pwd");
	System.out.println(user);
	System.out.println(password);
	
	}

}
