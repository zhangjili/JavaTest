package jihe;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] s = {"a","b","c"};
        List list = Arrays.asList(s);
        System.out.println(list);
    }
}