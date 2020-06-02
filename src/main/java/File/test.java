package File;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\opt\\a.text");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println(file.getPath());

        StringBuffer zipName = new StringBuffer("D:\\opt\\aa.txt");
        zipName.append("\\hello");
        System.out.println(zipName);


        System.out.println(generate9());
        System.out.println(Math.random());
    }

    public synchronized static String generate9() {
        int n = (int) (Math.random() * 900000000) + 100000000;
        return String.valueOf(n);
    }
}