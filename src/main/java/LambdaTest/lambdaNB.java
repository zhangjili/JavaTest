package LambdaTest;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class lambdaNB {
    public static void main(String[] args) {
        oldRunable();
        runable();
        System.out.println("====================================================");
        iterTest();
        System.out.println("=====================================================");
        mapTest();
        System.out.println("=====================================================");
        mapReduceTest();
        System.out.println("======================================================");
        filterTest();
        System.out.println("======================================================");
        sortedTest();
        System.out.println("========================================================");
        joinTest();


    }
    //1.替代匿名内部类
    // 使用匿名内部类
    private static void oldRunable() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("The old runable now is using!");
            }
        }).start();
    }
    //使用lambda表达式
    private static void runable(){
        new Thread(() -> System.out.println("It's a lambda function!")).start();
    }

    //2.使用lambda表达式对集合进行迭代
    private static void iterTest()  {
        List<String> list = Arrays.asList("java","python","scala");
        // java8 之前
        for (String each:list){
            System.out.println(each);
        }
        //java8之后
        list.forEach(System.out::println);
        list.forEach(x-> System.out.println(x));
    }

    //3.用lambda表达式实现map
    private static void mapTest(){
        List<Double> cost = Arrays.asList(10.0,20.0,30.0);
//        cost.stream().map(x->x+x*0.05).forEach(x-> System.out.println(x));
        //将结果手机起来转换成list
        List<Double> collect = cost.stream().map(x -> x + x * 0.05).collect(Collectors.toList());
        System.out.println(collect);
    }

    //4.用lambda表达式实现map与reduce
    private static void mapReduceTest(){
        List<Double> cost = Arrays.asList(10.0,20.0,30.0);
        Optional<Double> allCost = cost.stream().map(x->x+x*0.05).reduce((sum, x)->sum+x);
        System.out.println(allCost);
        System.out.println(allCost.get());
    }

    //5.filter操作 Collectors 类实现了很多归约操作，可以将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串：
    private static void filterTest()   {
        List<Double> cost = Arrays.asList(10.0,20.0,30.0,40.0);
        List<Double> filteredCost = cost.stream().filter(x -> x > 25.0).collect(Collectors.toList());
        filteredCost.forEach(x-> System.out.println(x));
    }

    //对Stream的字符串拼接
    private static void joinTest(){
        List<String> list = Arrays.asList("java", "python", "C++","php","java");
        //直接将输出结果拼接
        System.out.println(list.stream().collect(Collectors.joining()));
        //每个输出结果之间加拼接符号“|”
        System.out.println(list.stream().collect(Collectors.joining(" | ")));
        //输出结果开始头为Start--，结尾为--End，中间用拼接符号“||”
        System.out.println(list.stream().collect(Collectors.joining(" || ", "Start--", "--End")));
    }

    //sorted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
    private static void sortedTest(){
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(x-> System.out.println(x));
    }

}