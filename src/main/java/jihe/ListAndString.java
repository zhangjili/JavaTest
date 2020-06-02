package jihe;


import java.util.ArrayList;
import java.util.List;

public class ListAndString {
    public static void main(String[] args) {
        List <String> a = new ArrayList<String>();
        a.add("123");
        a.add("abc");
        System.out.println(list2String(a));
        System.out.println(list2StringNY(a));
        System.out.println(string2List("helloworld","o"));
        System.out.println(a);

        System.out.println("===========================================================================================");
        List<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{113, a, "cc"});
        list.add(new Object[]{"xx", "yy", "zz"});

        for (Object [] str:list){
            System.out.println(str[1]);
        }
    }
    //list 转换为String
    public static String list2String(List<String> lists) {
        StringBuffer sb = new StringBuffer("");
        if ((lists == null) || (lists.size() == 0))
            return sb.toString();
        for (int i = 0; i < lists.size(); i++) {
            if (i == 0)
                sb.append("'").append(lists.get(i)).append("'");
            else
                sb.append(",").append("'").append(lists.get(i)).append("'");
        }
        return sb.toString();
    }
    public static String list2StringNY(List<String> lists) {
        StringBuffer sb = new StringBuffer("");
        if ((lists == null) || (lists.size() == 0))
            return sb.toString();
        for (int i = 0; i < lists.size(); i++) {
            if (i == 0)
                sb.append(lists.get(i));
            else
                sb.append(",").append(lists.get(i));
        }
        return sb.toString();
    }
    public static List<String> string2List(String str, String sign) {

        if (str == null)
            return null;
        List<String> lists = new ArrayList<String>();

        String[] strs = str.split(sign);
        for (String string : strs) {
            lists.add(string);
        }
        return lists;
    }

}