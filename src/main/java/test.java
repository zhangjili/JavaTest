import org.apache.commons.lang3.StringUtils;

public class test {
    public static void main(String[] args) {
        int a = 3;
        Integer integer = Integer.valueOf(a);
        System.out.println(integer);
        System.out.println(integer.getClass().getName());

        Integer A = new Integer(5);
        int aa = A.intValue();
        System.out.println(aa);
        System.out.println(aa);




    }
}