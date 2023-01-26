import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestDemo {

//    Demo demo;
//
//    @BeforeClass
//    public void setUp(){
//
//    }
//
//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("This will be run before every test");
//    }
//
//    @Test()
//    @Description("Verify title is displayed on Home page")
//    @Ignore
//    public void testSum(){
//        Assert.assertEquals(demo.sum(2,2), 4);
//        System.out.println("result 4" );
//    }
//
//
//
//    @AfterClass
//    public void tearDown(){
//
//    }


    public int sum3(int a, int b){
        return a-b;
    }

    @Test
    public void testSum3() {

        Assert.assertEquals(sum3(4,4), 0);
    }
}
