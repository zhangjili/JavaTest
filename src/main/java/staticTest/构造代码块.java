package staticTest;

class AA {

    int i = 1;
    int initValue;//成员变量的初始化交给代码块来完成

    {
//代码块的作用体现于此：在调用构造方法之前，用某段代码对成员变量进行初始化。
//而不是在构造方法调用时再进行。一般用于将构造方法的相同部分提取出来。
//        位置：类成员的位置，就是类中方法之外的位置
//        作用：把多个构造方法共同的部分提取出来，共用构造代码块
//        调用：每次调用构造方法时，都会优先于构造方法执行，也就是每次new一个对象时自动调用，对对象的初始化
//
//        对象一实例化就执行，每实例化一次执行一次；
//
        for (int i = 0; i < 100; i++) {
            initValue += i;
        }
    }

    {
        System.out.println(initValue);
        System.out.println(i);//此时会打印1
        int i = 2;//代码块里的变量和成员变量不冲突，但会优先使用代码块的变量
        System.out.println(i);//此时打印2//System.out.println(j);//提示非法向后引用，因为此时j的的初始化还没开始。
//
    }


    {
        System.out.println("代码块运行");
    }

    int j = 2;


    {
        System.out.println(j);
        System.out.println(i);//代码块中的变量运行后自动释放，不会影响代码块之外的代码
    }


    AA() {
        System.out.println("构造方法运行");
    }
}

public class 构造代码块 {
    public static void main(String[] args) {
        AA a = new AA();
    }
}