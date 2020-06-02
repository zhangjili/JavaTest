package staticTest;

public class 构造方法和静态块 {
    public static void main(String[] args) {
        A k=new B();
        k.sayHi();
        k.hello();
    }
}

class A {
    public A(){
        System.out.println("我是父类的构造方法");
    }
    public void sayHi(){
        System.out.println("我是父类zd");
    }
    public void hello(){
        System.out.println("我是父类hello");
    }
    static {
        System.out.println("123");
    }
}

class B extends A{
    public B(){
        //默认调用super() 调用子类的构造方法
        System.out.println("我是子类的构造方法");
    }
    public void sayHi(){
        System.out.println("我是子类");
    }
    static {
        System.out.println("456");
    }
}