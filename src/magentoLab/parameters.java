package magentoLab;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameters {
	static WebDriver driver = new ChromeDriver();

	Random rand = new Random ();
	int RandomEmail=rand.nextInt(999);
	int randomPassoward = rand.nextInt(50000);

	static String URL = "https://magento.softwaretestingboard.com/";
	static String signUpUrl = "https://magento.softwaretestingboard.com/customer/account/create/";
	static String logoutUrl = "https://magento.softwaretestingboard.com/customer/account/logout/";
	static String loginUrl = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/";
	  static String loginUrl2 ="https://magento.softwaretestingboard.com/customer/account/";

	static String[] firstNameArr = { "zain", "rema", "ali" };
	static String[] lastNameArr = { "mohammed", "zaid", "nour"};
	
	int randomIndex = rand.nextInt(5);
	
	String firstName = firstNameArr[randomIndex];
	String lastNames = lastNameArr[randomIndex];
	String EmailFinal = firstName+lastNames+RandomEmail+"@gmail.com";
	String FinalPassoward = "N$$$"+ randomPassoward + "!#$#" ;

}
