import org.apache.commons.lang3.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        testJoin();
        testSplit();
        testReplace();
    }
    /**
     * 测试join 将数组以符号或其他字符串为间隔组成新的字符串
     */
    public static void testJoin() {
        String[] strs = { "1", "2", "3", "4", "5", "6" };
        String join = StringUtils.join(strs, "|");
        // 1|2|3|4|5|6
        System.out.println(join);
    }

    /**
     * 测试split 把字符串以某个字符分开，返回一个字符串数组
     */
    public static void testSplit() {
        String str = "1|2|3|4|5|6";
        String[] split = StringUtils.split(str, '|');
        // 结果为1,2,3,4,5,6
        for (String string : split) {
            System.out.println(string);
        }
    }


    /**
     * 测试replace 对字符串，在其中截取某个字符串替换成某个字符串
     */
    public static void testReplace() {
        String str = "you is luck";
        String replace = StringUtils.replace(str, "is", "are");
        // you is luck
        System.out.println(str);
        // you are luck
        System.out.println(replace);
    }

}