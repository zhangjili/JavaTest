package File;

import java.io.*;

public class ReadJson {
    public static void main(String[] args)  {
        System.out.println(getJson());
        System.out.println(System.getProperties());
        System.out.println(System.getProperties().getProperty("java.home"));
        System.out.println(System.getProperties().getProperty("os.name"));
        System.out.println(System.getProperties().getProperty("os.name").getClass().getName());
        String [] a  = System.getProperties().getProperty("os.name").split(" ");
        System.out.println(a[0]);
        if (a[0].equals("Windows")){
            System.out.println("这是window操作系统");
        }
        test();
        test1();
    }
    private static String getJson() {
        String jsonStr = "";
        try {
            File file = new File("D:\\opt\\set_data_number.json");
            Reader reader = new InputStreamReader(new FileInputStream(file), "Utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (Exception e) {
            return null;
        }
    }
     static void test()  {
        try {
            File file = new File ("D:\\opt\\set_data_number.json");
            FileInputStream in=new FileInputStream (file);
            InputStreamReader inReader=new InputStreamReader (in,"UTF-8");
            BufferedReader bufReader=new BufferedReader(inReader);
            System.out.println(bufReader.readLine());
        }catch (IOException e ){
            e.printStackTrace();
        }

    }
     private static void test1()  {
        try {
            //InputStreamReader 是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符。
            // 它使用的字符集可以由名称指定或显式给定，或者可以接受平台默认的字符集。
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:\\opt\\set_data_number.json"))));
            System.out.println(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}