import java.sql.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDC {
	public static void main(String[] args) throws SQLException {
		try {
		//Class.forName("com.sql.cj.jdbc.Driver");	
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo","root","root");
		Statement s=con.createStatement();
		String sql="select * from credentials where scenario='rewardscard'";
		ResultSet rs=s.executeQuery(sql);
		while(rs.next()) {
			String driverPath = "C:\\Users\\c1julymind155\\Downloads\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driverPath);
		    WebDriver driver=new ChromeDriver(); 
			driver.get("https://login.salesforce.com/");
			
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));
		
		}
	}
		catch(SQLException e) {
			System.out.println(e);
		} 
		
	}

}
