package jicheng;

/**
 * 描述类的功能、用途、现存BUG，以及其它别人可能感兴趣的介绍。
 *
 * @author 张吉利
 * 版权信息：Copyright topwalk Corporation 2006-2011
 * @version 2020/4/26
 * @see        需要参见的其它类
 * @since 从产品的那一个版本，此类被添加进来。（可选）
 * @deprecated该类从产品的那一个版本后，已经被其它类替换。（可选）
 */
public class FatherChild {
    public static void main(String[] args) {
        //  主方法开始
        Child1 c = new Child1();
        //  实例化
    }
}

class Father {
    public Father() {
        System.out.println("父类无参构造函数");
    }
    public Father(String name) {
        System.out.println("父类有参构造函数");
    }
}

class Child extends Father {
    public Child() {
        this("dd");
        System.out.println("子类无参构造函数");
    }
    public Child(String name) {
        super("dd");
        System.out.println("子类有参构造函数3");
    }
}

class Child1 extends Child {
    public Child1() {
        this("dd");
        System.out.println("子类无参构造函数2");
    }
    public Child1(String name) {
        super("dd");
        System.out.println("子类有参构造函数1");
    }
}
