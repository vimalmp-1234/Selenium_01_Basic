package testng;

import org.testng.annotations.DataProvider;

public class Data {
	
	@DataProvider
	public String[][] sendcred() {String[][] data = {{"ramu","ramu@123"},{"kiran","kiran@12"},{"vikram","viki@12"}};
	return data;
	}
}
