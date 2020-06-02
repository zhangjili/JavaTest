package jihe;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class TreeMapTest {
    public static void main(String[] args) {
//        TreeMap实现SortMap接口，能够把它保存的记录根据键排序，默认是按键值的升序排序
        // lambda 表达式
        TreeMap<Integer, String> treeMap = new TreeMap<>((o1, o2) -> o2 - o1);
        treeMap.put(4, "a");
        treeMap.put(2, "b");
        treeMap.put(3, "c");
        treeMap.put(1, "e");
        System.out.println(treeMap);
        System.out.println("==============================");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry);

        }


    }

}