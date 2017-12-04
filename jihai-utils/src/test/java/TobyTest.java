import java.io.UnsupportedEncodingException;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * @Author: laiqiuhua.
 * @Date: 2017/9/13 13:23.
 */
public class TobyTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
//        String str = URLEncoder.encode("AS-H18E1A2/F*R1DI-C8成品外机(台湾禾联，无管无线), R25G/NFI19+3成品01天猫(电商)", StandardCharsets.UTF_8.name());
//        System.out.println(str);
//        String str1 = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
//        System.out.println(str1);

        LocalTime startTime = LocalTime.now(ZoneId.of("Asia/Shanghai")).of(16, 30);
        LocalTime endTime = LocalTime.now(ZoneId.of("Asia/Shanghai")).of(18, 30);
        LocalTime now = LocalTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("ssss->"+(startTime.compareTo(now) <= 0));
        System.out.println(endTime.isAfter(now));

    }


}
