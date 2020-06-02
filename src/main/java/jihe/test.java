package jihe;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();
        list.add(new String[]{"aa", "bb", "cc"});
        list.add(new String[]{"xx", "yy", "zz"});

        for (String [] str:list){
            System.out.println(str[0]);
        }


        String s1 = new String("he") + new String("llo");
        String s2 = s1.intern();
        System.out.println(s1 == s2);

    }
}