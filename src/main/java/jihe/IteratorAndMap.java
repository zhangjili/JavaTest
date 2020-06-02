package jihe;

import java.util.*;

public class IteratorAndMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("orange");
        list.add("banana");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("============================================================");
        Map<String,String> map = new HashMap<String, String>();
        map.put("apple","3.5");
        map.put("orange","10.3");
        map.put(null,"hello");
        // hello 被替换  只允许一条记录的键为Null；允许多条记录的值为Null；
        map.put(null,"world");
        map.put("banana","34");
        map.put("banana1",null);
        map.put("banana2",null);

        Set listset = map.keySet();
        Object [] a = listset.toArray();
        for (Object aa:a){
            System.out.println(aa);
        }
        System.out.println(map.entrySet());
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry);
        }

        System.out.println("============================================================");
        System.out.println("set="+listset);
        for (Iterator iterator1 = listset.iterator();iterator1.hasNext();){
            System.out.println(map.get((String) iterator1.next()));
        }

        //lambda表达式 推荐使用
        System.out.println("===============================================================");
        ArrayList<Object> objects = new ArrayList<>();
        map.forEach((x,y)-> System.out.println(x+"=="+y));
    }




}