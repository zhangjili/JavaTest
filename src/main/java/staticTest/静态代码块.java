package staticTest;

public class 静态代码块 {
    public static void main(String[] args) {
        C c1 = new C();
        C c2 = new C();
    }

}

//    执行顺序 静态代码块 —–> 构造代码块 ——-> 构造方法
class C {
    C() {
        System.out.println("构造方法调用");
    }

    {
        System.out.println("代码块调用");
    }

    static {
        System.out.println("静态代码块调用");
    }
}