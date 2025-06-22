package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

import dynamicCodes.BaseClass01;

public class LinkedIn extends BaseClass01{

	public static void main(String[] args) throws Throwable {
		
		String host="localhost";
		String portnumber="3306";
		launch_Browser("chrome");
		Hiturl("https://in.linkedin.com/");
		driver.findElement(By.xpath("//a[@class=\"nav__button-secondary btn-secondary-emphasis btn-md\"]")).click();

		//here we developed connection with MySQL ,I don't know my SQL password hence I used any password and hence I am getting exception in output
		Connection connect = DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/stp", "root", "1234567890");
		
		
		//here we created connection
		Statement cs = connect.createStatement();
		//in set interface we get output as array and index starts from 0
		ResultSet result = cs.executeQuery("select email,password from linkedin1 where sr_no=5;");
		//But in sql index starts from 1 hence we use next method
		result.next();
		
		//column name i.e. column lable
		System.out.println(result.getString("email"));
		System.out.println(result.getString("password"));
		
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(result.getString("email"));
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(result.getString("password"));
		driver.findElement(By.xpath("//span[@id=\"password-visibility-toggle\"]")).click();
	
	}

}
