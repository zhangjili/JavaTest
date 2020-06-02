package jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("i");
        al.add("love");
        al.add("Zilatan");

        Object[] obj = al.toArray(); //toArray() 返回object类型

        for (int i = 0; i < obj.length; i++) {
            String str = (String) obj[i];
            System.out.println(str);
        }
        System.out.println(al.getClass().getName());
        System.out.println(Arrays.toString(al.toArray()));
        System.out.println("============================================================");
//        System.out.println((Arrays.toString(al.toArray())).getClass().getName());
//        System.out.println(al);
//        System.out.println(al.getClass().getName());

//////////////////////////////////////////////////////////
        //toArray(T[] a) 方法返回的数组类型一定是集合中所储存的类型，
        // 如：集合中存储的为Character类型则返回的数组类型也应为Character类型，不能为char类型，若要使用char类型可通过
        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("i");
        a2.add("am");
        a2.add("Zilatan");
        a2.add("!");

        String[] strArr = a2.toArray(new String[0]); // 匿名数组对象
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}