package staticTest;

import java.util.ArrayList;

public class 局部代码块 {
    public static void main(String[] args) {
        BB b = new BB();
        b.go();
    }

}

class BB {
    BB() {
    }

    public void go() {
//方法中的局部代码块，一般进行一次性地调用，调用完立刻释放空间，避免在接下来的调用过程中占用栈空间
//因为栈空间内存是有限的，方法调用可能会会生成很多局部变量导致栈内存不足。
//使用局部代码块可以避免这样的情况发生。
//        位置：局部位置（方法内部）
//        作用：限定变量的生命周期，尽早释放，节约内存
//        调用：调用其所在的方法时执行
        {
            int i = 1;
            ArrayList<Integer> list = new ArrayList<Integer>();
            while (i < 10) {
                list.add(i++);
            }
            for (Integer j : list) {
                System.out.println(j);
            }
            System.out.println("gogogo");
        }
        System.out.println("hello");
    }
}