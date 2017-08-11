import junit.framework.Assert;
import org.junit.*;

/**
 * Created by rocky on 2017/8/11.
 */
public class TestMavenDemo {
    @Test
    public void test(){
        Assert.assertEquals("输出Demo",new MavenDemo().doDemo());
    }
}
