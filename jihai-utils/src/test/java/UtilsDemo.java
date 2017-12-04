import org.junit.Test;

import java.util.Calendar;

/**
 * Created by kevinchen on 2016/12/16.
 */
public class UtilsDemo {

    @Test
    public void test1(){
        System.out.println(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
//        System.out.println(LocalDate.now().get(ChronoField.HOUR_OF_DAY));
    }

    public static int shardingCount = 4;




}
