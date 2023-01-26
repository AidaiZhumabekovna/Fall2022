import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
    @DataProvider(name = "login data")
    public Object[][] dpMethod(){
        return new Object[][]{
                {"aidai@gmail.com", "asd123"},  // manual tester prepare this data
                {"email2", "password2"},
                {"email2", "password2"},
                {"email2", "password2"},
                {"email2", "password2"}
        };
    }

    @Test(dataProvider = "login data")
    public void myTest(String email, String pass){
        System.out.println("Test Login page: Testing email field with " + email +  " " + "Test Login page: Testing email field with " + pass);
    }


}
