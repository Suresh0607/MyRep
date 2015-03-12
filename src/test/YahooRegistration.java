package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistration {

	@Test(dataProvider="registerData")
	public void Register(String Username, String Password, String email, String city)
	{
		 System.out.println("Registration");
		 //USerName
		 //Password
		 //email
		 //city
		 
		 System.out.println(Username+"-----"+Password+"-----"+email+"-----"+city);
	}
	
	@DataProvider
	
	public Object[][] registerData()
	{
		 Object[][] data = new Object[3][4];
		 
		 //First Row
		 data[0][0]="User1";
		 data[0][1]="Pass1";
		 data[0][2]="email1";
		 data[0][3]="City1";
		 
		 //Second Row
		 data[1][0]="User2";
		 data[1][1]="Pass2";
		 data[1][2]="email2";
		 data[1][3]="City2";
		 
		 //Third Row
		 data[2][0]="User3";
		 data[2][1]="Pass3";
		 data[2][2]="email3";
		 data[2][3]="City3";
		 		 
		 return data;
			 
	}
	
}
