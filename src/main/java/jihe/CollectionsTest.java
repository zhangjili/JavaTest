package jihe;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        shengxu();
        nixu();
        reverseTest();
        shuffleTest();
        fillTest();
        reverseTest1();

    }

    private static void nixu(){
        List<Integer> intList = Arrays.asList(2, 3, 1);
        System.out.println("before sort:");
        System.out.println(intList);
        System.out.println("after sort:");
        Collections.sort(intList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(intList);
    }

    private static void shengxu(){
        List<Integer> intList = Arrays.asList(2, 3, 1);
        System.out.println("before sort:");
        System.out.println(intList);
        System.out.println("after sort:");
        Collections.sort(intList);
        System.out.println(intList);
    }
//    先调用split方法将字符串转换为数组,再调用Arrays.aslist方法将数组转换为列表,再调用Collection方法的reverse方法实现逆序
    private static void reverseTest()  {
        List list = Arrays.asList("one two three four five six siven".split(" "));
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("==========================================================");
        List list1 = Arrays.asList("abcd".split(""));
        Collections.reverse(list1);
        System.out.println(list1);

    }

    private static void reverseTest1(){
        System.out.println("============================================================");
        String [] a ="abcd".split("");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i =a.length;i>0;i--){
            stringBuffer.append(a[i-1]);
        }
        System.out.println(stringBuffer);
    }

    private static void shuffleTest(){
        System.out.println("========================================");
        List c = new ArrayList();
        c.add("l");
        c.add("o");
        c.add("v");
        c.add("e");
        System.out.println(c);
        Collections.shuffle(c);
        System.out.println(c);
        Collections.shuffle(c);
        System.out.println(c);
    }
    private static void fillTest(){
        System.out.println("===============================================");
        List m = Arrays.asList("one two three four five six siven".split(" "));
        System.out.println(m);
        Collections.fill(m, "青鸟52T25小龙");
        System.out.println(m);

    }


    }
