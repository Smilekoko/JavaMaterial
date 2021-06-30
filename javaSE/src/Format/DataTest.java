package Format;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DataTest {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

        System.out.println("原时间 " + sdf.format(date));

        TimeZone time = TimeZone.getTimeZone("ETC/GMT-8");
        TimeZone.setDefault(time);


        System.out.println("修改后时间 " + sdf.format(date));
    }
}
