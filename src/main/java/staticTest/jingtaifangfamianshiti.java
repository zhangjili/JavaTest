package staticTest;

class jingtaifangfamianshiti {
    jingtaifangfamianshiti(){
        System.out.println("HelloA");
    }

    {
        System.out.println("I'm A class");
    }

    static {
        System.out.println("static A");
    }
}


class HelloB extends jingtaifangfamianshiti {
    private HelloB(){
        // 这个地方有一个隐藏的super();被执行
        System.out.println("HelloB");
    }
    {
        System.out.println("I'm B class");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}

