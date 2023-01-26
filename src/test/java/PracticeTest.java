import org.example.Practice;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeTest {
    @BeforeClass


    @Test
    public void testEvenSum(){

        int [] arr = {2,5,6,7,9,3};

        try {
            Assert.assertEquals(8, Practice.evenSum(arr));
        } catch (Exception e) {
            System.out.println("ArithmeticException");
        }finally {
            Assert.assertEquals(8, Practice.evenSum(arr));
        }




    }
}
