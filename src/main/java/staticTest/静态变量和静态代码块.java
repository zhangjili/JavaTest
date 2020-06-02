package staticTest;//原因是：
//
//        静态块：用静态申明，JVM加载类时执行，仅执行一次
//
//        构造块：类中直接用{}定义，每一次创建对象时执行
//
//        执行顺序优先级：静态块>main()>构造块>构造方法
//
//        因为静态声明缘故T1，T2也上升到静态位，与静态块处于同一优先级，同一优先级就先取按顺序来构造对象，构造对象，静态块

public class 静态变量和静态代码块 {
    public static 静态变量和静态代码块 t1 = new 静态变量和静态代码块();
    public static 静态变量和静态代码块 t2 = new 静态变量和静态代码块();
    {
        System.out.println("构造块");

    }
    static
    {
        System.out.println("静态块");

    }

    public static void main(String[] args)
    {

        静态变量和静态代码块 t =new 静态变量和静态代码块();

    }

}
