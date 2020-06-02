package jihe;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        sortTest1();
        System.out.println("");
        sortTest2();
        System.out.println("");
        toStringTest();
    }

    //对数组按照升序排序
    private static void sortTest1(){
        int[] nums = {2,5,0,4,6,-10};
        Arrays.sort(nums);
        for(int i :nums)
            System.out.print(i+" ");
    }

    //对数组元素指定范围进行排序（排序范围是从元素下标为from,到下标为to-1的元素进行排序）
    private static void sortTest2(){
        int[] nums = {2,5,0,4,6,-10};
        Arrays.sort(nums,0,4);
        for(int i :nums)
            System.out.print(i+" ");
    }

    //返回数组的字符串形式
    private static void toStringTest(){
        int[] nums = {2,5,0,4,1,-10};
        System.out.println(Arrays.toString(nums));
    }
}