import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePageLogin {

    @DataProvider
    public Object[][] getLoginData(){

        Object[][] data = {{"userOne", "passwordOne"},{"userTwo", "passwordTwo"}};
        return data;
    }

    @Test (dataProvider = "getLoginData", groups = {"smoke"})
    public void login(String username, String password){

        System.out.println("Logged in with : " + username + " " + password);
    }
}
