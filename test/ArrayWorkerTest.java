import by.itstep.tia.model.ArrayWorker;
import org.junit.Assert;
import org.junit.Test;

public class ArrayWorkerTest {
    @Test
    public void (){

        int[] array = {1,2,3,4,5};
        int expected = 5;

        int actual = ArrayWorker.max(array);

        Assert.assertEquals(expected, actual);
    }

}
