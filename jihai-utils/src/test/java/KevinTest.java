import com.jihai.mengmian.utils.NewDateUtils;
import org.junit.Test;

/**
 * Created by kevinchen on 2017/9/14.
 */
public class KevinTest {


    @Test
    public void test1(){//yyyy-MM-dd HH:mm:ss
        String yesterDayStr = NewDateUtils.getYesterdayStr();
        System.out.println(yesterDayStr);
    }

}
