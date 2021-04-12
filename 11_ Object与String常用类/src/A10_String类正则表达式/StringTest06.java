package A10_String类正则表达式;

/**
 * 正则表达式 : 专门用于处理字符串的技术 (正则大神)
 *
 * - 字符类 :
 *   - `[abc]`  字符串的这个位置只能是abc
 *   - `[^abc]`  字符串的这个位置不能是abc
 *   - `[a-zA-Z]` 字符串的这个位置必须是字母,52个
 *   - `[^a-zA-Z]` 字符串的这个位置必须不能是字母,52个
 * - 数字类:
 *   - `[0-9]` 字符串的这个位置只能是数字
 *   - `[^0-9]` 字符串的这个位置不能是数字
 *   - `[\d]` 等同于 `[0-9]`
 *   - `[\D]` 等同于 `[^0-9]`
 * - 预定义字符 :
 *   -  . 匹配所有的字符
 *   -  `[\d]` 等同于 `[0-9]`
 *   -  `[\D]` 等同于 `[^0-9]`
 *   -  `[\w]` 文字字符,包含数字,字母,下划线 `[a-zA-Z0-9_]`
 *   -  `[\W]` 文字字符,包含数字,字母,下划线 `[^a-zA-Z0-9_]`
 *
 * - 数量词 :
 *   - X{m}  X这个字符只能出现m次  a{3}
 *   - X{m,} X这个字符至少出现m次
 *   - X{m,n} X这个字符至少出现m次,不超过n次
 *   - X?  X这个字符出现一次,或者一次也没有
 *   - X* X这个字符出现零次或者多次
 *   - X+ X这个字符出现至少一次
 */

public class StringTest06 {

    /**
     *  检查邮箱
     *  规则 :
     * @ 前面 : 可以是数组,字母,混合,_  位数放下
     * @ 后面 : 数组,字母  sina qq 126 1393 yahoo gmail 位数放下
     * . 固定 : com  cn org  edu gov 字母  位数放下
     */

    public static void main(String[] args) {

        String email = "shihehe@sina.com";
        String reg = "[\\w]+@[a-z0-9]+(\\.[a-z]+)+";
        boolean b = email.matches(reg);
        System.out.println(b);

    }
    /**
     *  正则表达式检查手机号是否合法
     *  开头必须是1,长度固定11
     *  第二位3 4 5 6 7 8 9
     *  第三位 必须是都是数字
     */
    public static void stringMethod(){
        String tel = "13800138000";
        //定义正则的规则,也是字符串
        String regex = "1[3459678][0-9]{9}";
        //正则规则,和字符串校验
        //String类的方法 matches()
        boolean b = tel.matches(regex);
        System.out.println(b);

    }
}
