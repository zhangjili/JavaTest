package riqi;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class shijian {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(date);
        System.out.println(simpleDateFormat.format(date));
        System.out.println("==============================================================");
        System.out.println(new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(new Date()));

        Integer x =Integer.valueOf("9");
        System.out.println(x+3);
        Double c = Double.valueOf("989");
        Float a = Float.valueOf("80");

        Integer b = Integer.valueOf("444",16);   // 使用 16 进制

        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

    }

    /*
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        return simpleDateFormat.format(date);



    }

    /*
     * 将时间转换为时间戳
     */
    public static String dateToStamp(String s) throws ParseException, ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }
}