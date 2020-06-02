package riqi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarTest {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance());
        System.out.println(Calendar.getInstance().getTime());
        System.out.println(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(Calendar.getInstance().getTime()));

    }
}