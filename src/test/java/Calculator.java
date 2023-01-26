import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {
    public int sum(int a, int b){
        return a+b;
    }

    @Test
            public void testSum() {

        Assert.assertEquals(sum(4,4), 8);
    }
}
